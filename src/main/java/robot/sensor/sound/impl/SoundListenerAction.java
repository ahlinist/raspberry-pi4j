package robot.sensor.sound.impl;

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
public class SoundListenerAction implements Runnable {

    private final Route route;

    @Override
    public void run() {
        log.info(" --> Sound detected!");
        Step stepBack = new Step(Speed.SLOW, Direction.BACKWARD);
        List<Step> sequence = List.of(stepBack);
        route.addSequence(sequence);
    }
}
