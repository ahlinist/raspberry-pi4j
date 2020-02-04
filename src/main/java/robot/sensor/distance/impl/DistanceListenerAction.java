package robot.sensor.distance.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DistanceListenerAction implements Runnable {

    @Override
    public void run() {
        log.info(" --> Obstacle detected!");
    }
}
