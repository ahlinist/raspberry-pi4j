package robot

import org.springframework.boot.ApplicationArguments
import robot.chassis.Chassis
import spock.lang.Specification
import spock.lang.Subject

class RoboApplicationSpec extends Specification {

    Chassis chassis = Mock Chassis

    @Subject
    RoboApplication roboApplication = new RoboApplication(chassis)

    def "test app run"() {
        when:
        roboApplication.run(_ as ApplicationArguments)

        then:
        1 * chassis.init()
        0 * _
    }
}
