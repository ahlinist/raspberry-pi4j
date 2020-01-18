package robot.sensor.sound

import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioPinDigitalInput
import com.pi4j.io.gpio.PinPullResistance
import com.pi4j.io.gpio.RaspiPin
import robot.sensor.sound.impl.SoundSensorImpl
import spock.lang.Specification
import spock.lang.Subject

class SoundSensorSpec extends Specification {

    GpioController gpioController = Mock GpioController
    SoundListener soundListener = Mock SoundListener

    @Subject
    SoundSensor soundSensor = new SoundSensorImpl(gpioController, soundListener)

    GpioPinDigitalInput soundSensorInput = Mock GpioPinDigitalInput

    def "test init"() {
        when:
        soundSensor.init()

        then:
        1 * gpioController.provisionDigitalInputPin(RaspiPin.GPIO_02, "Sound sensor input", PinPullResistance.PULL_DOWN) >> soundSensorInput
        1 * soundSensorInput.addListener(soundListener)
        0 * _
    }
}
