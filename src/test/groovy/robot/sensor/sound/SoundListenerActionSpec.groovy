package robot.sensor.sound

import robot.motion.Direction
import robot.motion.Route
import robot.motion.Speed
import robot.motion.Step
import robot.sensor.sound.impl.SoundListenerAction
import spock.lang.Specification
import spock.lang.Subject

class SoundListenerActionSpec extends Specification {

    Route route = Mock Route

    @Subject
    SoundListenerAction soundListenerAction = new SoundListenerAction(route)

    def "test run()"() {
        given:
        List sequence = [new Step(Speed.SLOW, Direction.BACK)]

        when:
        soundListenerAction.run()

        then:
        1 * route.addSequence(sequence)
        0 * _
    }
}
