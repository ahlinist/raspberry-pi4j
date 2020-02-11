package robot.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("motion.track.pin")
public class TrackConfigurationProperties {

    private Side right;
    private Side left;

    @Data
    public static class Side {

        private int front;
        private int rear;
    }
}
