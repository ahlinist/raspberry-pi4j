package robot.sensor.motion.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.motion.Direction;
import robot.motion.Route;
import robot.motion.Speed;
import robot.motion.Step;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MotionListenerAction implements Runnable {

    private final Route route;

    @Override
    public void run() {
        Step stepForward = new Step(Speed.FAST, Direction.TOWARDS);
        List<Step> sequence = List.of(stepForward);
        route.addSequence(sequence);
    }
}
