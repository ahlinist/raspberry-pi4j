package robot.core

import com.pi4j.io.gpio.GpioPinDigitalOutput
import robot.core.raspberrypi.impl.RaspberryPiOutputImpl
import spock.lang.Specification
import spock.lang.Subject

class OutputSpec extends Specification {

    GpioPinDigitalOutput gpioPinDigitalOutput = Mock GpioPinDigitalOutput

    @Subject
    Output output = new RaspberryPiOutputImpl(gpioPinDigitalOutput)

    def "test high()" () {
        when:
        output.high()

        then:
        1 * gpioPinDigitalOutput.high()
        0 * _
    }

    def "test low()" () {
        when:
        output.low()

        then:
        1 * gpioPinDigitalOutput.low()
        0 * _
    }
}
