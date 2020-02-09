package robot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import robot.core.Controller;
import robot.core.Output;
import robot.motion.Track;
import robot.motion.TrackController;
import robot.motion.impl.TrackControllerImpl;
import robot.motion.impl.TrackImpl;

@Configuration
public class TrackControllerConfiguration {

    @Value("${motion.track.right.forward.pin}")
    private int rightForwardPin;
    @Value("${motion.track.right.backward.pin}")
    private int rightBackwardPin;
    @Value("${motion.track.left.forward.pin}")
    private int leftForwardPin;
    @Value("${motion.track.left.backward.pin}")
    private int leftBackwardPin;
    @Autowired
    private Controller controller;

    @Bean
    public Track rightTrack() {
        Output rightForwardOutput = controller.initOutput(rightForwardPin);
        Output rightBackwardOutput = controller.initOutput(rightBackwardPin);
        return new TrackImpl(rightForwardOutput, rightBackwardOutput);
    }

    @Bean
    public Track leftTrack() {
        Output leftForwardOutput = controller.initOutput(leftForwardPin);
        Output leftBackwardOutput = controller.initOutput(leftBackwardPin);
        return new TrackImpl(leftForwardOutput, leftBackwardOutput);
    }

    @Bean
    public TrackController trackController() {
        return new TrackControllerImpl(rightTrack(), leftTrack());
    }
}
