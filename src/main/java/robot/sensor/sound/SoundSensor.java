package robot.sensor.sound;

import com.pi4j.io.gpio.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.sensor.Sensor;

@Component
@RequiredArgsConstructor
public class SoundSensor implements Sensor {

    private final GpioController controller;
    private final SoundListener soundListener;

    @Override
    public void init() {
        System.out.println("Initializing a sound sensor");
        GpioPinDigitalInput soundSensorInput = controller.provisionDigitalInputPin(RaspiPin.GPIO_02,
                "Sound sensor input",
                PinPullResistance.PULL_DOWN);
        soundSensorInput.addListener(soundListener);
    }
}
