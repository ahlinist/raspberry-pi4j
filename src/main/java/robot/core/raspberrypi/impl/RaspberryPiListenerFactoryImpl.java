package robot.core.raspberrypi.impl;

import org.springframework.stereotype.Component;
import robot.core.Listener;
import robot.core.ListenerFactory;

@Component
public class RaspberryPiListenerFactoryImpl implements ListenerFactory {

    @Override
    public Listener getInstance(Runnable action) {
        return new RaspberryPiListenerImpl(action);
    }
}
