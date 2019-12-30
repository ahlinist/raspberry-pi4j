package sensor.sound

import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioPinDigitalInput
import com.pi4j.io.gpio.PinPullResistance
import com.pi4j.io.gpio.RaspiPin
import com.pi4j.io.gpio.event.GpioPinListenerDigital
import spock.lang.Specification
import spock.lang.Subject

class SoundSensorSpec extends Specification {

    GpioController gpioController = Mock GpioController
    GpioPinListenerDigital soundListener = Mock GpioPinListenerDigital

    @Subject
    SoundSensor soundSensor = new SoundSensor(gpioController, soundListener)

    GpioPinDigitalInput soundSensorInput = Mock GpioPinDigitalInput

    def "test init"() {
        when:
        soundSensor.init()

        then:
        1 * gpioController.provisionDigitalInputPin(RaspiPin.GPIO_02,"Sound sensor input", PinPullResistance.PULL_DOWN) >> soundSensorInput
        1 * soundSensorInput.addListener(soundListener)
        0 * _
    }
}
