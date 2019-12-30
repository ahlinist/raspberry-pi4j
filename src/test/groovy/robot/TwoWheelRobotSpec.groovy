package robot

import sensor.sound.SoundSensor
import spock.lang.Specification
import spock.lang.Subject

class TwoWheelRobotSpec extends Specification {

    SoundSensor soundSensor = Mock SoundSensor

    @Subject
    TwoWheelRobot robot = new TwoWheelRobot(soundSensor)

    def "test init()"() {
        when:
        robot.init()

        then:
        1 * soundSensor.init()
        0 * _
    }
}
