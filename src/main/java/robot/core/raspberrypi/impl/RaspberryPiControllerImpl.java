package robot.core.raspberrypi.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.core.*;

@Component
@RequiredArgsConstructor
public class RaspberryPiControllerImpl implements Controller {

    private final InputFactory inputFactory;
    private final ListenerFactory listenerFactory;

    @Override
    public Input initInput(int pinNumber, String pinName, Runnable action) {
        Listener listener = listenerFactory.getInstance(action);
        Input input = inputFactory.getInstance(pinNumber, pinName);
        input.addListener(listener);
        return input;
    }
}
