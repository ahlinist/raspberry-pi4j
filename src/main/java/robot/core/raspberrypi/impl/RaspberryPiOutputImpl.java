package robot.core.raspberrypi.impl;

import com.pi4j.io.gpio.GpioPinDigitalOutput;
import lombok.RequiredArgsConstructor;
import robot.core.Output;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

@RequiredArgsConstructor
public class RaspberryPiOutputImpl implements Output {

    private final long interval;
    private final GpioPinDigitalOutput gpioPinDigitalOutput;

    @Override
    public void pulse() {
        gpioPinDigitalOutput.high();
        gpioPinDigitalOutput.pulse(interval, TimeUnit.of(ChronoUnit.MILLIS));
    }
}
