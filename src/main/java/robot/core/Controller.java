package robot.core;

public interface Controller {

    Input initInput(int punNumber, String pinName, Runnable action);
}
