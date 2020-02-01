package robot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import robot.chassis.impl.WheelRobotImpl
import robot.configuration.ControllerTestConfiguration
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration(classes = [RoboApplication.class, ControllerTestConfiguration.class])
class RoboApplicationTest extends Specification {


    @Autowired
    WheelRobotImpl wheelRobot

    def "test context loads"() {
        expect:
        wheelRobot != null
    }
}
