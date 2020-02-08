package robot.configuration;

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

    private final int rightForwardPin;
    private final int rightBackwardPin;
    private final int leftForwardPin;
    private final int leftBackwardPin;
    private final Controller controller;

    public TrackControllerConfiguration(
            @Value("${motion.track.right.forward.pin}") int rightForwardPin,
            @Value("${motion.track.right.backward.pin}") int rightBackwardPin,
            @Value("${motion.track.left.forward.pin}") int leftForwardPin,
            @Value("${motion.track.left.backward.pin}") int leftBackwardPin,
            Controller controller) {
        this.rightForwardPin = rightForwardPin;
        this.rightBackwardPin = rightBackwardPin;
        this.leftForwardPin = leftForwardPin;
        this.leftBackwardPin = leftBackwardPin;
        this.controller = controller;
    }

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
