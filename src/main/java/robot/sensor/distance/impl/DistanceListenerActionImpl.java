package robot.sensor.distance.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import robot.sensor.distance.DistanceListenerAction;
import robot.sensor.distance.DistanceSensorModule;

@Slf4j
@Component
@RequiredArgsConstructor
public class DistanceListenerActionImpl implements DistanceListenerAction {

    private final DistanceSensorModule distanceSensorModule;

    @Override
    public void run() {
        log.info(" --> Obstacle detected!");
        distanceSensorModule.registerEvent();
    }
}
