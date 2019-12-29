package robo

import org.springframework.boot.ApplicationArguments
import robo.sensor.sound.SoundSensor
import spock.lang.Specification
import spock.lang.Subject

class RoboApplicationSpec extends Specification {

    SoundSensor soundSensor = Mock SoundSensor

    @Subject
    RoboApplication roboApplication = new RoboApplication(soundSensor)

    def "test app run"() {
        when:
        roboApplication.run(_ as ApplicationArguments)

        then:
        1 * soundSensor.init()
        0 * _
    }
}
