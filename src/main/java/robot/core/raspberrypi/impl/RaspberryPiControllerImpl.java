package robot.core.raspberrypi.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.core.*;

@Component
@RequiredArgsConstructor
public class RaspberryPiControllerImpl implements Controller {

    private final InputFactory inputFactory;
    private final OutputFactory outputFactory;
    private final ListenerFactory listenerFactory;

    @Override
    public Input initInput(int pinNumber, Runnable action) {
        Listener listener = listenerFactory.getInstance(action);
        Input input = inputFactory.getInstance(pinNumber);
        input.addListener(listener);
        return input;
    }

    @Override
    public Output initOutput(int pinNumber) {
        return outputFactory.getInstance(pinNumber);
    }
}
