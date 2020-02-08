package robot.core

import robot.core.raspberrypi.impl.RaspberryPiControllerImpl
import spock.lang.Specification
import spock.lang.Subject

class ControllerSpec extends Specification {

    InputFactory inputFactory = Mock InputFactory
    OutputFactory outputFactory = Mock OutputFactory
    ListenerFactory listenerFactory = Mock ListenerFactory

    @Subject
    Controller controller = new RaspberryPiControllerImpl(inputFactory, outputFactory,  listenerFactory)

    Runnable action = Mock Runnable
    Input input = Mock Input
    Output output = Mock Output
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

    def "test initOutput()"() {
        given:
        Integer pinNumber = 1
        String pinName = 'pin name'

        when:
        Output result = controller.initOutput(pinNumber, pinName)

        then:
        1 * outputFactory.getInstance(pinNumber, pinName) >> output
        0 * _

        and:
        result == output
    }
}
