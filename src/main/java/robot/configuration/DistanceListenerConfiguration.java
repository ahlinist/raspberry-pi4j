package robot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import robot.core.Controller;
import robot.sensor.distance.DistanceListenerAction;

@Configuration
public class DistanceListenerConfiguration {

    @Value("${sensor.distance.pin}")
    private int pinNumber;
    @Autowired
    private Controller controller;
    @Autowired
    private DistanceListenerAction distanceListenerAction;

    @Bean
    public void register() {
        controller.initInput(pinNumber, distanceListenerAction);
    }
}
