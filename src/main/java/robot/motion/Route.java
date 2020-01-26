package robot.motion;

import java.util.List;

public interface Route {

    void addSequence(List<Step> sequence);

    List<Step> nextSequence();
}
