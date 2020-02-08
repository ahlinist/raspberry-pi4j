package robot.core;

public interface Controller {

    Input initInput(int punNumber, String pinName, Runnable action);

    Output initOutput(int pinNumber, String pinName);
}
