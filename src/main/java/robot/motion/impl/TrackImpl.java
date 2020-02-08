package robot.motion.impl;

import lombok.RequiredArgsConstructor;
import robot.core.Output;
import robot.motion.Track;

@RequiredArgsConstructor
public class TrackImpl implements Track {

    private final Output forwardOutput;
    private final Output backwardOutput;

    @Override
    public void forward() {
        forwardOutput.pulse();
    }

    @Override
    public void backward() {
        backwardOutput.pulse();
    }
}
