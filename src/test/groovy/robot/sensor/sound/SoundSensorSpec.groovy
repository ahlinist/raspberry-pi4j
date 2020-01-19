package robot.sensor.sound

import robot.controller.Controller
import robot.controller.Input
import robot.controller.Listener
import robot.sensor.sound.impl.SoundListenerAction
import robot.sensor.sound.impl.SoundSensorImpl
import spock.lang.Specification
import spock.lang.Subject

class SoundSensorSpec extends Specification {

    Controller controller = Mock Controller
    SoundListenerAction action = Mock SoundListenerAction

    @Subject
    SoundSensor soundSensor = new SoundSensorImpl(controller, action)

    Listener listener = Mock Listener
    Input input = Mock Input

    def "test init"() {
        when:
        soundSensor.init()

        then:
        1 * controller.initListener(action) >> listener
        1 * controller.initInput(2, "Sound sensor input") >> input
        1 * input.addListener(listener)
        0 * _
    }
}
