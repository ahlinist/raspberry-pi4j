package robot.sensor.distance.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import robot.motion.Direction;
import robot.motion.Route;
import robot.motion.Speed;
import robot.motion.Step;
import robot.sensor.distance.DistanceSensorModule;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class DistanceSensorModuleImpl implements DistanceSensorModule {

    private final Route route;

    @Override
    public void registerEvent() {
        Step right = new Step(Speed.FAST, Direction.RIGHT);
        List<Step> sequence = List.of(right);
        route.addSequence(sequence);
    }
}
