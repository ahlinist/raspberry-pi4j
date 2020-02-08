package robot.sensor.distance.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import robot.core.Controller;
import robot.sensor.AbstractSensor;
import robot.sensor.distance.DistanceSensor;

@Component
public class DistanceSensorImpl extends AbstractSensor implements DistanceSensor {

    private static final String NAME = "distance sensor";

    public DistanceSensorImpl(Controller controller,
                              DistanceListenerAction action,
                              @Value("${sensor.distance.pin}") int pin) {
        super(controller, action, NAME, pin);
    }
}
