package robot.sensor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import robot.core.Controller;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractSensor implements Sensor {

    private final Controller controller;
    private final Runnable action;
    private final String name;
    private final int pinNumber;

    @Override
    public void init() {
        log.info("Initializing " + name);
        controller.initInput(pinNumber, name, action);
    }
}
