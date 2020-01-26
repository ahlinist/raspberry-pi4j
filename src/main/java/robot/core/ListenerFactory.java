package robot.core;

public interface ListenerFactory {

    Listener getInstance(Runnable action);
}
