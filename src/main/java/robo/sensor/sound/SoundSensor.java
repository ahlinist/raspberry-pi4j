package robo.sensor.sound;

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robo.sensor.Sensor;

@Component
@RequiredArgsConstructor
public class SoundSensor implements Sensor {

    private final GpioController gpioController;
    private final GpioPinListenerDigital soundListener;

    @Override
    public void init() {
        GpioPinDigitalInput soundSensorInput = gpioController.provisionDigitalInputPin(RaspiPin.GPIO_02,             // PIN NUMBER
                "Sound sensor input",                   // PIN FRIENDLY NAME (optional)
                PinPullResistance.PULL_DOWN); // PIN RESISTANCE (optional)
        soundSensorInput.addListener(soundListener);
        System.out.println("Sound sensor initialized");
    }
}
