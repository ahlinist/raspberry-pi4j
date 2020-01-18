package robot.sensor.sound.impl;

import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import org.springframework.stereotype.Component;
import robot.sensor.sound.SoundListener;

@Component
public class SoundListenerImpl implements SoundListener {

    @Override
    public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
        System.out.println(" --> GPIO PIN STATE CHANGE: " + event.getPin() + " = " + event.getState());
    }
}
