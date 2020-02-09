package robot.chassis

import robot.chassis.impl.WheelRobotImpl
import robot.motion.MotionProcessor
import robot.sensor.distance.DistanceSensor
import robot.sensor.motion.MotionSensor
import spock.lang.Specification
import spock.lang.Subject

class WheelRobotSpec extends Specification {

    MotionSensor motionSensor = Mock MotionSensor
    DistanceSensor distanceSensor = Mock DistanceSensor
    MotionProcessor motionProcessor = Mock MotionProcessor

    @Subject
    WheelRobotImpl wheelRobot = new WheelRobotImpl(motionSensor, distanceSensor, motionProcessor)

    def "test init()"() {
        when:
        wheelRobot.init()

        then:
        1 * motionSensor.init()
        1 * distanceSensor.init()
        1 * motionProcessor.init()
        0 * _
    }
}
