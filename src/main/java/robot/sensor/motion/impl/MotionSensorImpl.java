package robot.sensor.motion.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import robot.core.Controller;
import robot.sensor.AbstractSensor;
import robot.sensor.motion.MotionSensor;

@Component
public class MotionSensorImpl extends AbstractSensor implements MotionSensor {

    private static final String NAME = "motion sensor";

    public MotionSensorImpl(Controller controller,
                            MotionListenerAction action,
                            @Value("${sensor.motion.pin}") int pin) {
        super(controller, action, NAME, pin);
    }
}
