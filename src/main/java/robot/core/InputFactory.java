package robot.core;

public interface InputFactory {

    Input getInstance(int pinNumber, String pinName);
}
