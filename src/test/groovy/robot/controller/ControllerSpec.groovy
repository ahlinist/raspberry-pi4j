package robot.controller

import robot.controller.impl.RaspberryPiControllerImpl
import spock.lang.Specification
import spock.lang.Subject

class ControllerSpec extends Specification {

    InputFactory inputFactory = Mock InputFactory
    ListenerFactory listenerFactory = Mock ListenerFactory

    @Subject
    Controller controller = new RaspberryPiControllerImpl(inputFactory, listenerFactory)

    Runnable action = Mock Runnable
    Input input = Mock Input
    Listener listener = Mock Listener

    def "test initInput()"() {
        given:
        Integer pinNumber = 1
        String pinName = 'pin name'

        when:
        Input result = controller.initInput(pinNumber, pinName, action)

        then:
        1 * listenerFactory.getInstance(action) >> listener
        1 * inputFactory.getInstance(pinNumber, pinName) >> input
        1 * input.addListener(listener)
        0 * _

        and:
        result == input
    }
}
