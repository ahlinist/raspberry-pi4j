package robot.sensor.distance.impl;

import org.springframework.stereotype.Component;
import robot.controller.Controller;
import robot.sensor.AbstractSensor;
import robot.sensor.distance.DistanceSensor;

@Component
public class DistanceSensorImpl extends AbstractSensor implements DistanceSensor {

    private static final String NAME = "distance sensor";
    private static final int PIN_NUMBER = 0;

    public DistanceSensorImpl(Controller controller, DistanceListenerAction action) {
        super(controller, action, NAME, PIN_NUMBER);
    }
}
