package robot.sensor.distance.impl;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import robot.sensor.distance.DistanceListener;
import robot.sensor.distance.DistanceSensor;

@Component
@RequiredArgsConstructor
public class DistanceSensorImpl implements DistanceSensor {

    private final GpioController controller;
    private final DistanceListener distanceListener;

    @Override
    public void init() {
        System.out.println("Initializing a distance sensor");
        GpioPinDigitalInput distanceSensorInput = controller.provisionDigitalInputPin(RaspiPin.GPIO_00,
                "Distance sensor input",
                PinPullResistance.PULL_DOWN);
        distanceSensorInput.addListener(distanceListener);
    }
}
