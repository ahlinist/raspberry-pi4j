package robot.motion.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import robot.motion.Direction;
import robot.motion.Speed;
import robot.motion.Step;

@Getter
@RequiredArgsConstructor
public class StepImpl implements Step {

    private final Speed speed;
    private final Direction direction;
}
