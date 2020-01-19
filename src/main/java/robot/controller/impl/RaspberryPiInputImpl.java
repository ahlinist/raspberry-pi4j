package robot.controller.impl;

import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import lombok.RequiredArgsConstructor;
import robot.controller.Input;
import robot.controller.Listener;

@RequiredArgsConstructor
public class RaspberryPiInputImpl implements Input {

    private final GpioPinDigitalInput gpioPinDigitalInput;

    @Override
    public void addListener(Listener listener) {
        GpioPinListenerDigital gpioListener = (GpioPinListenerDigital) listener;
        gpioPinDigitalInput.addListener(gpioListener);
    }
}
