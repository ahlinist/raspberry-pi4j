package robot.controller

import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioPinDigitalInput
import com.pi4j.io.gpio.PinPullResistance
import com.pi4j.io.gpio.RaspiPin
import robot.controller.impl.RaspberryPiControllerImpl
import robot.controller.impl.RaspberryPiInputImpl
import robot.controller.impl.RaspberryPiListenerImpl
import spock.lang.Specification
import spock.lang.Subject

class ControllerSpec extends Specification {

    GpioController gpioController = Mock GpioController
    ListenerFactory listenerFactory = Mock ListenerFactory
    @Subject
    Controller controller = new RaspberryPiControllerImpl(gpioController, listenerFactory)

    Runnable action = Mock Runnable
    Listener listener = Mock RaspberryPiListenerImpl
    GpioPinDigitalInput gpioInput = Mock GpioPinDigitalInput

    def "test initInput()"() {
        given:
        Integer pinNumber = 1
        String pinName = 'pin name'

        when:
        def result = controller.initInput(pinNumber, pinName, action)

        then:
        1 * listenerFactory.getInstance(action) >> listener
        1 * gpioController.provisionDigitalInputPin(RaspiPin.GPIO_01, pinName, PinPullResistance.PULL_DOWN) >> gpioInput
        1 * gpioInput.addListener(listener)
        0 * _

        and:
        result instanceof RaspberryPiInputImpl
    }
}
