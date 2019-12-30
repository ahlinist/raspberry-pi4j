package robot;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import sensor.sound.SoundSensor;
import util.Profiles;

@RequiredArgsConstructor
@Profile(Profiles.TWO_WHEEL)
public class TwoWheelRobot implements Robot {

    private final SoundSensor soundSensor;

    @Override
    public void init() {
        System.out.println("Initializing a two wheel robot...");
        soundSensor.init();
    }
}
