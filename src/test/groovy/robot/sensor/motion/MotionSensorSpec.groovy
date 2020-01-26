package robot.sensor.motion

import robot.controller.Controller
import robot.controller.Input
import robot.sensor.motion.impl.MotionListenerAction
import robot.sensor.motion.impl.MotionSensorImpl
import spock.lang.Specification
import spock.lang.Subject

class MotionSensorSpec extends Specification {

    Controller controller = Mock Controller
    MotionListenerAction action = Mock MotionListenerAction

    @Subject
    MotionSensor motionSensor = new MotionSensorImpl(controller, action)

    Input input = Mock Input

    def "test init()"() {
        when:
        motionSensor.init()

        then:
        1 * controller.initInput(1, "motion sensor", action) >> input
        0 * _
    }
}
