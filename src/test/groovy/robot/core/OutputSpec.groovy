package robot.core

import com.pi4j.io.gpio.GpioPinDigitalOutput
import robot.core.raspberrypi.impl.RaspberryPiOutputImpl
import spock.lang.Specification
import spock.lang.Subject

import java.time.temporal.ChronoUnit
import java.util.concurrent.TimeUnit

class OutputSpec extends Specification {

    long interval = 0
    GpioPinDigitalOutput gpioPinDigitalOutput = Mock GpioPinDigitalOutput

    @Subject
    Output output = new RaspberryPiOutputImpl(interval, gpioPinDigitalOutput)

    def "test pulse()" () {
        when:
        output.pulse()

        then:
        1 * gpioPinDigitalOutput.high()
        1 * gpioPinDigitalOutput.pulse(interval, TimeUnit.of(ChronoUnit.MILLIS))
        0 * _
    }
}
