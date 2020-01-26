package robot.core

import com.pi4j.io.gpio.GpioPinDigitalInput
import robot.core.impl.RaspberryPiInputImpl
import robot.core.impl.RaspberryPiListenerImpl
import spock.lang.Specification
import spock.lang.Subject

class InputSpec extends Specification {

    GpioPinDigitalInput gpioPinDigitalInput = Mock GpioPinDigitalInput

    @Subject
    Input input = new RaspberryPiInputImpl(gpioPinDigitalInput)

    Listener listener = Mock RaspberryPiListenerImpl

    def "test addListener()"() {
        when:
        input.addListener(listener)

        then:
        1 * gpioPinDigitalInput.addListener(listener)
        0 * _
    }
}
