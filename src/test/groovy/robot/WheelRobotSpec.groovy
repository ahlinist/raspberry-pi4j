package robot

import robot.chassis.impl.WheelRobotImpl
import robot.sensor.distance.DistanceSensor
import robot.sensor.motion.MotionSensor
import robot.sensor.sound.SoundSensor
import spock.lang.Specification
import spock.lang.Subject

class WheelRobotSpec extends Specification {

    SoundSensor soundSensor = Mock SoundSensor
    MotionSensor motionSensor = Mock MotionSensor
    DistanceSensor distanceSensor = Mock DistanceSensor

    @Subject
    WheelRobotImpl wheelRobot = new WheelRobotImpl(soundSensor, motionSensor, distanceSensor)

    def "test init()"() {
        when:
        wheelRobot.init()

        then:
        1 * soundSensor.init()
        1 * motionSensor.init()
        1 * distanceSensor.init()
        0 * _
    }
}
