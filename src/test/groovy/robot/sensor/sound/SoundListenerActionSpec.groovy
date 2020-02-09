package robot.sensor.sound

import robot.sensor.sound.impl.SoundListenerActionImpl
import spock.lang.Specification
import spock.lang.Subject

class SoundListenerActionSpec extends Specification {

    SoundSensorModule soundSensorModule = Mock SoundSensorModule

    @Subject
    SoundListenerActionImpl soundListenerAction = new SoundListenerActionImpl(soundSensorModule)

    def "test run()"() {
        when:
        soundListenerAction.run()

        then:
        1 * soundSensorModule.registerEvent()
        0 * _
    }
}
