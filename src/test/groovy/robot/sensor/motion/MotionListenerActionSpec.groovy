package robot.sensor.motion

import robot.motion.Direction
import robot.motion.Route
import robot.motion.Speed
import robot.motion.Step
import robot.sensor.motion.impl.MotionListenerAction
import spock.lang.Specification
import spock.lang.Subject

class MotionListenerActionSpec extends Specification {

    Route route = Mock Route

    @Subject
    MotionListenerAction motionListenerAction = new MotionListenerAction(route)

    def "test run()"() {
        given:
        List<Step> sequence = [new Step(Speed.FAST, Direction.FORWARD)]

        when:
        motionListenerAction.run()

        then:
        1 * route.addSequence(sequence)
        0 * _
    }
}
