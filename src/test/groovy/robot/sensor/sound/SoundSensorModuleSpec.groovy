package robot.sensor.sound

import robot.motion.Direction
import robot.motion.Route
import robot.motion.Speed
import robot.motion.Step
import robot.sensor.sound.impl.SoundSensorModuleImpl
import spock.lang.Specification
import spock.lang.Subject

class SoundSensorModuleSpec extends Specification {

    Integer eventInterval = 1000
    Route route = Mock Route

    @Subject
    SoundSensorModule sensorModule = new SoundSensorModuleImpl(eventInterval, route)

    def "test registerEvent()"() {
        given:
        List<Step> sequence = [new Step(Speed.SLOW, Direction.BACKWARD)]

        when:
        sensorModule.registerEvent()

        then:
        1 * route.addSequence(sequence)
        0 * _
    }

    def "test registerEvent() for 2 sequential events more frequent than allowed interval"() {
        given: 'event interval is 1000 ms'
        List<Step> sequence = [new Step(Speed.SLOW, Direction.BACKWARD)]

        when:
        sensorModule.registerEvent()
        sensorModule.registerEvent()

        then: 'only 1 sequence is added'
        1 * route.addSequence(sequence)
        0 * _
    }

    def "test registerEvent() for 2 sequential events matching interval"() {
        given: 'event interval is 0'
        Route route = Mock Route
        SoundSensorModule sensorModule = new SoundSensorModuleImpl(0, route)
        List<Step> sequence = [new Step(Speed.SLOW, Direction.BACKWARD)]

        when:
        sensorModule.registerEvent()
        sensorModule.registerEvent()

        then: '2 sequences are added'
        2 * route.addSequence(sequence)
        0 * _
    }
}
