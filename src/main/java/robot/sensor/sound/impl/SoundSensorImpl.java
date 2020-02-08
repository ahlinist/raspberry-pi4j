package robot.sensor.sound.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import robot.core.Controller;
import robot.sensor.AbstractSensor;
import robot.sensor.sound.SoundSensor;

@Component
public class SoundSensorImpl extends AbstractSensor implements SoundSensor {

    private static final String NAME = "sound sensor";

    public SoundSensorImpl(Controller controller,
                           SoundListenerAction action,
                           @Value("${sensor.sound.pin}") int pin) {
        super(controller, action, NAME, pin);
    }
}
