package robot.chassis

import robot.chassis.impl.WheelRobotImpl
import robot.motion.MotionProcessor
import robot.sensor.distance.DistanceSensor

import spock.lang.Specification
import spock.lang.Subject

class WheelRobotSpec extends Specification {

    DistanceSensor distanceSensor = Mock DistanceSensor
    MotionProcessor motionProcessor = Mock MotionProcessor

    @Subject
    WheelRobotImpl wheelRobot = new WheelRobotImpl(distanceSensor, motionProcessor)

    def "test init()"() {
        when:
        wheelRobot.init()

        then:
        1 * distanceSensor.init()
        1 * motionProcessor.init()
        0 * _
    }
}
