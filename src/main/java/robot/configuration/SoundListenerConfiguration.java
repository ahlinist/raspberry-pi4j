package robot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import robot.core.Controller;
import robot.sensor.sound.SoundListenerAction;

@Configuration
public class SoundListenerConfiguration {

    @Value("${sensor.sound.pin}")
    private int pinNumber;
    @Autowired
    private Controller controller;
    @Autowired
    private SoundListenerAction soundListenerAction;

    @Bean
    public void register() {
        controller.initInput(pinNumber, soundListenerAction);
    }
}
