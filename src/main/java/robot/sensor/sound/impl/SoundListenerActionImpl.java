package robot.sensor.sound.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import robot.sensor.sound.SoundListenerAction;
import robot.sensor.sound.SoundSensorModule;

@Slf4j
@Component
@RequiredArgsConstructor
public class SoundListenerActionImpl implements SoundListenerAction {

    private final SoundSensorModule soundSensorModule;

    @Override
    public void run() {
        log.info(" --> Sound detected!");
        soundSensorModule.registerEvent();
    }
}
