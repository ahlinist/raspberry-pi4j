package robot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.sensor.distance.DistanceSensor;
import robot.sensor.sound.SoundSensor;

@Component
@RequiredArgsConstructor
public class TwoWheelRobot implements Robot {

    private final SoundSensor soundSensor;
    private final DistanceSensor distanceSensor;

    @Override
    public void init() {
        System.out.println("Initializing a two wheel robot...");
        soundSensor.init();
        distanceSensor.init();
    }
}
