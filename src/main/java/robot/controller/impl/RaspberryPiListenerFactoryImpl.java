package robot.controller.impl;

import org.springframework.stereotype.Component;
import robot.controller.Listener;
import robot.controller.ListenerFactory;

@Component
public class RaspberryPiListenerFactoryImpl implements ListenerFactory {

    @Override
    public Listener getInstance(Runnable action) {
        return new RaspberryPiListenerImpl(action);
    }
}
