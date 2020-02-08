package robot.core

import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.PinState
import com.pi4j.io.gpio.RaspiPin
import robot.core.raspberrypi.impl.RaspberryPiOutputFactoryImpl
import robot.core.raspberrypi.impl.RaspberryPiOutputImpl
import spock.lang.Specification
import spock.lang.Subject

class OutputFactorySpec extends Specification {

    GpioController gpioController = Mock GpioController

    @Subject
    OutputFactory outputFactory = new RaspberryPiOutputFactoryImpl(gpioController)

    def "test getInstance()"() {
        given:
        String pinName = 'pin name'

        when:
        Output output = outputFactory.getInstance(1, pinName)

        then:
        1 * gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_01, pinName, PinState.LOW)
        0 * _

        and:
        output instanceof RaspberryPiOutputImpl
    }
}
