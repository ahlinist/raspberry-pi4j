package robot.sensor.sound.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.motion.Direction;
import robot.motion.Route;
import robot.motion.Speed;
import robot.motion.Step;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SoundListenerAction implements Runnable {

    private final Route route;

    @Override
    public void run() {
        Step stepBack = new Step(Speed.SLOW, Direction.BACK);
        List<Step> sequence = List.of(stepBack);
        route.addSequence(sequence);
    }
}
