package robot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import robot.core.Controller;
import robot.core.Output;
import robot.motion.Track;
import robot.motion.impl.TrackImpl;

@Configuration
public class TrackControllerConfiguration {

    @Autowired
    private TrackConfigurationProperties trackConfiguration;
    @Autowired
    private Controller controller;

    @Bean
    public Track rightTrack() {
        TrackConfigurationProperties.Side right = trackConfiguration.getRight();
        Output rightForwardOutput = controller.initOutput(right.getFront());
        Output rightBackwardOutput = controller.initOutput(right.getRear());
        return new TrackImpl(rightForwardOutput, rightBackwardOutput);
    }

    @Bean
    public Track leftTrack() {
        TrackConfigurationProperties.Side left = trackConfiguration.getLeft();
        Output leftForwardOutput = controller.initOutput(left.getFront());
        Output leftBackwardOutput = controller.initOutput(left.getRear());
        return new TrackImpl(leftForwardOutput, leftBackwardOutput);
    }
}
