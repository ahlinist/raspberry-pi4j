package robot.sensor.motion

import robot.core.Controller
import robot.core.Input
import robot.sensor.motion.impl.MotionListenerAction
import robot.sensor.motion.impl.MotionSensorImpl
import spock.lang.Specification
import spock.lang.Subject

class MotionSensorSpec extends Specification {

    Controller controller = Mock Controller
    MotionListenerAction action = Mock MotionListenerAction
    String name = 'motion sensor'
    Integer pin = 1

    @Subject
    MotionSensor motionSensor = new MotionSensorImpl(controller, action, name, pin)

    Input input = Mock Input

    def "test init()"() {
        when:
        motionSensor.init()

        then:
        1 * controller.initInput(1, 'motion sensor', action) >> input
        0 * _
    }
}
