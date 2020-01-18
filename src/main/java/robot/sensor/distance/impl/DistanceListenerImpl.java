package robot.sensor.distance.impl;

import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import org.springframework.stereotype.Component;
import robot.sensor.distance.DistanceListener;

@Component
public class DistanceListenerImpl implements DistanceListener {

    @Override
    public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
        System.out.println(" --> Obstacle detected: " + event.getPin() + ". " + event.getState());
    }
}
