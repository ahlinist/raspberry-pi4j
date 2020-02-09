package robot.sensor.motion.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import robot.motion.Direction;
import robot.motion.Route;
import robot.motion.Speed;
import robot.motion.Step;
import robot.sensor.motion.MotionListenerAction;
import robot.sensor.motion.MotionSensorModule;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class MotionListenerActionImpl implements MotionListenerAction {

    private final MotionSensorModule motionSensorModule;

    @Override
    public void run() {
        log.info(" --> Motion detected!");
        motionSensorModule.registerEvent();
    }
}
