package robot.sensor.distance

import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioPinDigitalInput
import com.pi4j.io.gpio.PinPullResistance
import com.pi4j.io.gpio.RaspiPin
import robot.sensor.distance.impl.DistanceSensorImpl
import spock.lang.Specification
import spock.lang.Subject

class DistanceSensorSpec extends Specification {

    GpioController gpioController = Mock GpioController
    DistanceListener distanceListener = Mock DistanceListener

    @Subject
    DistanceSensor distanceSensor = new DistanceSensorImpl(gpioController, distanceListener)

    GpioPinDigitalInput distanceSensorInput = Mock GpioPinDigitalInput

    def "test init"() {
        when:
        distanceSensor.init()

        then:
        1 * gpioController.provisionDigitalInputPin(RaspiPin.GPIO_00, "Distance sensor input", PinPullResistance.PULL_DOWN) >> distanceSensorInput
        1 * distanceSensorInput.addListener(distanceListener)
        0 * _
    }
}
