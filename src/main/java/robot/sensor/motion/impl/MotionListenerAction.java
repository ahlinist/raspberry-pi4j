package robot.sensor.motion.impl;

import org.springframework.stereotype.Component;

@Component
public class MotionListenerAction implements Runnable {

    @Override
    public void run() {
        System.out.println(" --> Motion detected!");
    }
}
