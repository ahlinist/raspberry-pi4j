package robot.sensor.motion.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import robot.motion.Direction;
import robot.motion.Route;
import robot.motion.Speed;
import robot.motion.Step;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class MotionListenerAction implements Runnable {

    private final Route route;

    @Override
    public void run() {
        log.info(" --> Motion detected!");
        Step stepForward = new Step(Speed.FAST, Direction.FORWARD);
        List<Step> sequence = List.of(stepForward);
        route.addSequence(sequence);
    }
}
