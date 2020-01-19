package robot.sensor.distance.impl;

import org.springframework.stereotype.Component;

@Component
public class DistanceListenerAction implements Runnable {

    @Override
    public void run() {
        System.out.println(" --> Obstacle detected!");
    }
}
