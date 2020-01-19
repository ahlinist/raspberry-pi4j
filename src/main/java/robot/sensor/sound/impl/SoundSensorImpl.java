package robot.sensor.sound.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.controller.Controller;
import robot.controller.Input;
import robot.controller.Listener;
import robot.sensor.sound.SoundSensor;

@Component
@RequiredArgsConstructor
public class SoundSensorImpl implements SoundSensor {

    private final Controller controller;
    private final Runnable action;

    @Override
    public void init() {
        System.out.println("Initializing a sound sensor");
        Listener listener = controller.initListener(action);
        Input input = controller.initInput(2, "Sound sensor input");
        input.addListener(listener);
    }
}
