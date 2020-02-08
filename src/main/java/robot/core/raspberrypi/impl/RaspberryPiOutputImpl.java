package robot.core.raspberrypi.impl;

import com.pi4j.io.gpio.GpioPinDigitalOutput;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import robot.core.Output;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

@RequiredArgsConstructor
public class RaspberryPiOutputImpl implements Output {

    private final long interval;
    private final GpioPinDigitalOutput gpioPinDigitalOutput;

    @Override
    @SneakyThrows
    public void pulse() {
        gpioPinDigitalOutput.high();
        Thread.sleep(1000l);
        gpioPinDigitalOutput.low();
        //gpioPinDigitalOutput.blink(0, interval, TimeUnit.of(ChronoUnit.MILLIS));
        //gpioPinDigitalOutput.pulse(interval, TimeUnit.of(ChronoUnit.MILLIS));
    }
}
