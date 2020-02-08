package robot.core.raspberrypi.impl;

import com.pi4j.io.gpio.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.core.Input;
import robot.core.InputFactory;
import robot.core.raspberrypi.RaspberryPiPinMapping;

@Component
@RequiredArgsConstructor
public class RaspberryPiInputFactoryImpl implements InputFactory {

    private static final PinPullResistance RESISTANCE = PinPullResistance.PULL_DOWN;

    private final GpioController gpioController;

    @Override
    public Input getInstance(int pinNumber, String pinName) {
        Pin pin = RaspberryPiPinMapping.PIN_MAPPING.get(pinNumber);
        GpioPinDigitalInput gpioInput = gpioController.provisionDigitalInputPin(pin, pinName, RESISTANCE);
        return new RaspberryPiInputImpl(gpioInput);
    }
}
