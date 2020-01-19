package robot.controller;

public interface Controller {

    Input initInput(int punNumber, String pinName);

    Listener initListener(Runnable action);
}
