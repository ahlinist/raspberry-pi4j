package robot.core;

public interface Controller {

    Input initInput(int punNumber, Runnable action);

    Output initOutput(int pinNumber);
}
