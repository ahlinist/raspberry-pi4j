package robot.sensor.distance

import robot.core.Controller
import robot.core.Input
import robot.sensor.distance.impl.DistanceListenerAction
import robot.sensor.distance.impl.DistanceSensorImpl
import spock.lang.Specification
import spock.lang.Subject

class DistanceSensorSpec extends Specification {

    Controller controller = Mock Controller
    DistanceListenerAction action = Mock DistanceListenerAction
    Integer pin = 0

    @Subject
    DistanceSensor distanceSensor = new DistanceSensorImpl(controller, action, pin)

    Input input = Mock Input

    def "test init"() {
        when:
        distanceSensor.init()

        then:
        1 * controller.initInput(0, action) >> input
        0 * _
    }
}
