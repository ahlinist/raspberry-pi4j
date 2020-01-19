package robot.sensor.sound.impl;

import org.springframework.stereotype.Component;

@Component
public class SoundListenerAction implements Runnable {

    @Override
    public void run() {
        System.out.println(" --> Sound detected!");
    }
}
