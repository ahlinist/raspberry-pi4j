package robot.core;

public interface OutputFactory {

    Output getInstance(int pinNumber, String pinName);
}
