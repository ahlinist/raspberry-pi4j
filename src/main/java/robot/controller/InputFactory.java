package robot.controller;

public interface InputFactory {

    Input getInstance(int pinNumber, String pinName);
}
