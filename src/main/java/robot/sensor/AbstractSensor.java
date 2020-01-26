package robot.sensor;

import lombok.RequiredArgsConstructor;
import robot.core.Controller;

@RequiredArgsConstructor
public abstract class AbstractSensor implements Sensor {

    private final Controller controller;
    private final Runnable action;
    private final String name;
    private final int pinNumber;

    @Override
    public void init() {
        System.out.println("Initializing " + name);
        controller.initInput(pinNumber, name, action);
    }
}
