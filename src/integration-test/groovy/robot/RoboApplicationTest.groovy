package robot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import robot.configuration.ControllerTestConfiguration
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration(classes = [RoboApplication.class, ControllerTestConfiguration.class])
class RoboApplicationTest extends Specification {


    @Autowired
    TwoWheelRobot twoWheelRobot

    def "test context loads"() {
        expect:
        twoWheelRobot != null
    }
}
