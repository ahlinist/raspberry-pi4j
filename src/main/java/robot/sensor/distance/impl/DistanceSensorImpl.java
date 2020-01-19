package robot.sensor.distance.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.controller.Controller;
import robot.controller.Input;
import robot.controller.Listener;
import robot.sensor.distance.DistanceSensor;

@Component
@RequiredArgsConstructor
public class DistanceSensorImpl implements DistanceSensor {

    private final Controller controller;
    private final Runnable action;

    @Override
    public void init() {
        System.out.println("Initializing a distance sensor");
        Listener listener = controller.initListener(action);
        Input input = controller.initInput(0, "Distance sensor input");
        input.addListener(listener);
    }
}
