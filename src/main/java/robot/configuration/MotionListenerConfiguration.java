package robot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import robot.core.Controller;
import robot.sensor.motion.MotionListenerAction;

@Configuration
public class MotionListenerConfiguration {

    @Value("${sensor.motion.pin}")
    private int pinNumber;
    @Autowired
    private Controller controller;
    @Autowired
    private MotionListenerAction motionListenerAction;

    @Bean
    public void registerMotion() {
        controller.initInput(pinNumber, motionListenerAction);
    }
}
