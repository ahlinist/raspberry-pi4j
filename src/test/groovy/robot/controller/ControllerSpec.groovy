package robot.controller

import com.pi4j.io.gpio.GpioController
import robot.controller.impl.RaspberryPiControllerImpl
import robot.controller.impl.RaspberryPiInputImpl
import robot.controller.impl.RaspberryPiListenerImpl
import spock.lang.Specification
import spock.lang.Subject

class ControllerSpec extends Specification {

    GpioController gpioController = Mock GpioController

    @Subject
    Controller controller = new RaspberryPiControllerImpl(gpioController)

    Runnable action = Mock Runnable

    def "test initListener()"() {
        when:
        def result = controller.initListener(action)

        then:
        result instanceof RaspberryPiListenerImpl
    }

    def "test initInput()"() {
        given:
        Integer pinNumber = 1
        String pinName = 'pin name'

        when:
        def result = controller.initInput(pinNumber, pinName)

        then:
        result instanceof RaspberryPiInputImpl
    }
}
