package robot.sensor.motion.impl;

import org.springframework.stereotype.Component;
import robot.controller.Controller;
import robot.sensor.AbstractSensor;
import robot.sensor.motion.MotionSensor;

@Component
public class MotionSensorImpl extends AbstractSensor implements MotionSensor {

    private static final String NAME = "motion sensor";
    private static final int PIN_NUMBER = 1;

    public MotionSensorImpl(Controller controller, MotionListenerAction action) {
        super(controller, action, NAME, PIN_NUMBER);
    }
}
