package robot.sensor;

import lombok.RequiredArgsConstructor;
import robot.controller.Controller;
import robot.controller.Input;
import robot.controller.Listener;

@RequiredArgsConstructor
public abstract class AbstractSensor implements Sensor {

    private final Controller controller;
    private final Runnable action;
    private final String name;
    private final int pinNumber;

    @Override
    public void init() {
        System.out.println("Initializing " + name);
        Listener listener = controller.initListener(action);
        Input input = controller.initInput(pinNumber, name);
        input.addListener(listener);
    }
}
