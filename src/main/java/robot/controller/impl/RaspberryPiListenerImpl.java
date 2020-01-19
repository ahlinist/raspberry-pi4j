package robot.controller.impl;

import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import lombok.RequiredArgsConstructor;
import robot.controller.Listener;

@RequiredArgsConstructor
public class RaspberryPiListenerImpl implements GpioPinListenerDigital, Listener {

    private final Runnable action;

    @Override
    public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
        action.run();
    }
}
