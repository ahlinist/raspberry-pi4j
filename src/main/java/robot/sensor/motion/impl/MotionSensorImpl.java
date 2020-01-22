package robot.sensor.motion.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.controller.Controller;
import robot.controller.Input;
import robot.controller.Listener;
import robot.sensor.motion.MotionSensor;

@Component
@RequiredArgsConstructor
public class MotionSensorImpl implements MotionSensor {

    private final Controller controller;
    private final MotionListenerAction action;

    @Override
    public void init() {
        System.out.println("Initializing a motion sensor");
        Listener listener = controller.initListener(action);
        Input input = controller.initInput(1, "Motion sensor input");
        input.addListener(listener);
    }
}
