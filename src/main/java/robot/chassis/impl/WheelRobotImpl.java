package robot.chassis.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import robot.chassis.Chassis;
import robot.motion.MotionProcessor;
import robot.sensor.distance.DistanceSensor;
import robot.sensor.motion.MotionSensor;

@Slf4j
@Component
@RequiredArgsConstructor
public class WheelRobotImpl implements Chassis {

    private final MotionSensor motionSensor;
    private final DistanceSensor distanceSensor;
    private final MotionProcessor motionProcessor;

    @Override
    public void init() {
        log.info("Initializing a two wheel robot...");
        motionSensor.init();
        distanceSensor.init();
        motionProcessor.init();
    }
}
