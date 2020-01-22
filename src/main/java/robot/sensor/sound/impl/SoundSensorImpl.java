package robot.sensor.sound.impl;

import org.springframework.stereotype.Component;
import robot.controller.Controller;
import robot.sensor.AbstractSensor;
import robot.sensor.sound.SoundSensor;

@Component
public class SoundSensorImpl extends AbstractSensor implements SoundSensor {

    private static final String NAME = "sound sensor";
    private static final int PIN_NUMBER = 2;

    public SoundSensorImpl(Controller controller, SoundListenerAction action) {
        super(controller, action, NAME, PIN_NUMBER);
    }
}
