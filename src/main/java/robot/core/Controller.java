package robot.core;

public interface Controller {

    void init();

    Input initInput(int punNumber, Runnable action);

    Output initOutput(int pinNumber);
}
