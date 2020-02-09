package robot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import robot.configuration.ControllerTestConfiguration
import robot.core.Controller
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration(classes = [RoboApplication.class, ControllerTestConfiguration.class])
class RoboApplicationTest extends Specification {


    @Autowired
    Controller controller

    def "test context loads"() {
        expect:
        controller != null
    }
}
