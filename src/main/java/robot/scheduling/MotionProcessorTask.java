package robot.scheduling;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import robot.motion.MotionProcessor;

@Component
@RequiredArgsConstructor
public class MotionProcessorTask {

    private final MotionProcessor motionProcessor;

    @Scheduled(fixedRateString = "${operations.interval}")
    public void scheduleMotionProcessing() {
        motionProcessor.process();
    }
}
