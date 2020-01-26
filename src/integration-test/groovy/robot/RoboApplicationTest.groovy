package robot

import com.pi4j.io.gpio.GpioController
import org.apache.catalina.core.ApplicationContext
import org.spockframework.spring.SpringBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class RoboApplicationTest extends Specification {

    @Autowired
    ApplicationContext context

    @SpringBean
    GpioController gpioController = Stub() {
        provisionDigitalInputPin(_, _, _) >> { throw new RuntimeException("I'm stubbed!") }
    }

    def "test context loads"() {
        expect:
        context != null
        context.containsBean('gpioController')
    }
}
