package robot

import org.springframework.boot.ApplicationArguments
import robot.core.Controller
import spock.lang.Specification
import spock.lang.Subject

class RoboAppSpec extends Specification {

    Controller controller = Mock Controller

    @Subject
    RoboApplication roboApplication = new RoboApplication(controller)

    def "test run()"() {
        when:
        roboApplication.run(_ as ApplicationArguments)

        then:
        1 * controller.init()
        0 * _
    }
}
