package robot.sensor.distance

import robot.motion.Direction
import robot.motion.Route
import robot.motion.Speed
import robot.motion.Step
import robot.sensor.distance.impl.DistanceSensorModuleImpl
import spock.lang.Specification
import spock.lang.Subject

class DistanceSensorModuleSpec extends Specification {

    Route route = Mock Route

    @Subject
    DistanceSensorModule sensorModule = new DistanceSensorModuleImpl(route)

    def "test registerEvent()"() {
        given:
        List<Step> sequence = [new Step(Speed.FAST, Direction.RIGHT)]

        when:
        sensorModule.registerEvent()

        then:
        1 * route.addSequence(sequence)
        0 * _
    }
}
