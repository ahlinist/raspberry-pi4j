package robot.motion.impl;

import lombok.RequiredArgsConstructor;
import robot.motion.Track;
import robot.motion.TrackController;

@RequiredArgsConstructor
public class TrackControllerImpl implements TrackController {

    private final Track rightTrack;
    private final Track leftTrack;

    @Override
    public void forward() {
        rightTrack.forward();
        leftTrack.forward();
    }

    @Override
    public void right() {
        rightTrack.forward();
        leftTrack.backward();
    }

    @Override
    public void left() {
        rightTrack.backward();
        leftTrack.forward();
    }

    @Override
    public void backward() {
        rightTrack.backward();
        leftTrack.backward();
    }
}
