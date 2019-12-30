import org.springframework.boot.ApplicationArguments
import robot.Robot
import spock.lang.Specification
import spock.lang.Subject

class RoboApplicationSpec extends Specification {

    Robot robot = Mock Robot

    @Subject
    RoboApplication roboApplication = new RoboApplication(robot)

    def "test app run"() {
        when:
        roboApplication.run(_ as ApplicationArguments)

        then:
        1 * robot.init()
        0 * _
    }
}
