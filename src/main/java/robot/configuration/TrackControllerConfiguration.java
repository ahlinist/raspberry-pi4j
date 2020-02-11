package robot.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import robot.core.Controller;
import robot.core.Output;
import robot.motion.Track;
import robot.motion.impl.TrackImpl;

import static robot.configuration.TrackConfigurationProperties.Side;

@Configuration
@RequiredArgsConstructor
public class TrackControllerConfiguration {

    private final TrackConfigurationProperties trackConfiguration;
    private final Controller controller;

    @Bean
    public Track rightTrack() {
        Side right = trackConfiguration.getRight();
        Output rightForwardOutput = controller.initOutput(right.getFront());
        Output rightBackwardOutput = controller.initOutput(right.getRear());
        return new TrackImpl(rightForwardOutput, rightBackwardOutput);
    }

    @Bean
    public Track leftTrack() {
        Side left = trackConfiguration.getLeft();
        Output leftForwardOutput = controller.initOutput(left.getFront());
        Output leftBackwardOutput = controller.initOutput(left.getRear());
        return new TrackImpl(leftForwardOutput, leftBackwardOutput);
    }
}
