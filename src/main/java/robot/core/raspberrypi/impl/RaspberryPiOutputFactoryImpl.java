package robot.core.raspberrypi.impl;

import com.pi4j.io.gpio.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.core.Output;
import robot.core.OutputFactory;
import robot.core.raspberrypi.RaspberryPiPinMapping;

@Component
@RequiredArgsConstructor
public class RaspberryPiOutputFactoryImpl implements OutputFactory {

    private static final PinState STATE = PinState.LOW;

    private final GpioController gpioController;

    @Override
    public Output getInstance(int pinNumber, String pinName) {
        Pin pin = RaspberryPiPinMapping.PIN_MAPPING.get(pinNumber);
        GpioPinDigitalOutput gpioOutput = gpioController.provisionDigitalOutputPin(pin, pinName, STATE);
        return new RaspberryPiOutputImpl(gpioOutput);
    }
}
