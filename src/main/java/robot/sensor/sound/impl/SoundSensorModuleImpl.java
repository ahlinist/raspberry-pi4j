package robot.sensor.sound.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import robot.motion.Direction;
import robot.motion.Route;
import robot.motion.Speed;
import robot.motion.Step;
import robot.sensor.sound.SoundSensorModule;

import java.time.Instant;
import java.util.List;

@Slf4j
@Component
public class SoundSensorModuleImpl implements SoundSensorModule {

    private final int eventInterval;
    private final Route route;

    public SoundSensorModuleImpl(
            @Value("${sensor.sound.interval}") int eventInterval,
            Route route) {
        this.eventInterval = eventInterval;
        this.route = route;
    }

    private Instant lastExecuted;

    @Override
    public void registerEvent() {
        Instant now = Instant.now();

        if (lastExecuted == null || now.minusMillis(eventInterval).isAfter(lastExecuted)) {
            lastExecuted = now;
            Step backward = new Step(Speed.SLOW, Direction.BACKWARD);
            List<Step> sequence = List.of(backward);
            route.addSequence(sequence);
        }
    }
}
