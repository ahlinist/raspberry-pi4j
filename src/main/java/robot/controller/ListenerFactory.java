package robot.controller;

public interface ListenerFactory {

    Listener getInstance(Runnable action);
}
