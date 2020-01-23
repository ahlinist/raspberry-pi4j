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
    GpioController gpioController = Stub()

    def "test context loads"() {
        given:
        gpioController.provisionDigitalInputPin(_, _, _) >> {throw new RuntimeException('asd')}

        expect:
        context != null
        context.containsBean("helloWorldService")
        context.containsBean("simpleBootApp")
        context.containsBean("scopedHelloWorldService")
    }
}