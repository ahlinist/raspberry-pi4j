package robot.core

import robot.core.impl.RaspberryPiListenerFactoryImpl
import spock.lang.Specification
import spock.lang.Subject

class ListenerFactorySpec extends Specification {

    @Subject
    ListenerFactory factory = new RaspberryPiListenerFactoryImpl()

    Runnable action = Mock Runnable

    def "test getInstance()"() {
        expect:
        factory.getInstance(action) instanceof Listener
    }
}
