package robot;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import robot.sensor.sound.SoundSensor;
import robot.util.Profiles;

@Component
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
