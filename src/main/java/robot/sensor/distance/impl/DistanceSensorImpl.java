package robot.sensor.distance.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import robot.core.Controller;
import robot.sensor.AbstractSensor;
import robot.sensor.distance.DistanceSensor;

@Component
public class DistanceSensorImpl extends AbstractSensor implements DistanceSensor {

    public DistanceSensorImpl(Controller controller,
                              DistanceListenerAction action,
                              @Value("${sensor.distance.name}") String name,
                              @Value("${sensor.distance.pin}") int pin) {
        super(controller, action, name, pin);
    }
}
