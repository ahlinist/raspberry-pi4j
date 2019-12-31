package robot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.sensor.sound.SoundSensor;

@Component
@RequiredArgsConstructor
public class TwoWheelRobot implements Robot {

    private final SoundSensor soundSensor;

    @Override
    public void init() {
        System.out.println("Initializing a two wheel robot...");
        soundSensor.init();
    }
}
