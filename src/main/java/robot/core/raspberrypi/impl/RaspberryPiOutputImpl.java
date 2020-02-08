package robot.core.raspberrypi.impl;

import com.pi4j.io.gpio.GpioPinDigitalOutput;
import lombok.RequiredArgsConstructor;
import robot.core.Output;

@RequiredArgsConstructor
public class RaspberryPiOutputImpl implements Output {

    private final GpioPinDigitalOutput gpioPinDigitalOutput;

    @Override
    public void high() {
        gpioPinDigitalOutput.high();
    }

    @Override
    public void low() {
        gpioPinDigitalOutput.low();
    }
}
