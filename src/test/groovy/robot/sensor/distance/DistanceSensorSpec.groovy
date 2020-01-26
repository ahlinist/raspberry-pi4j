package robot.sensor.distance

import robot.controller.Controller
import robot.controller.Input
import robot.sensor.distance.impl.DistanceListenerAction
import robot.sensor.distance.impl.DistanceSensorImpl
import spock.lang.Specification
import spock.lang.Subject

class DistanceSensorSpec extends Specification {

    Controller controller = Mock Controller
    DistanceListenerAction action = Mock DistanceListenerAction

    @Subject
    DistanceSensor distanceSensor = new DistanceSensorImpl(controller, action)

    Input input = Mock Input

    def "test init"() {
        when:
        distanceSensor.init()

        then:
        1 * controller.initInput(0, "distance sensor", action) >> input
        0 * _
    }
}
