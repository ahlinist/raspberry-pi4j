package rasp.robo;

import com.pi4j.io.gpio.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rasp.robo.listener.SoundListener;

@SpringBootApplication
public class RoboApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(RoboApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("App started");

		final GpioController gpio = GpioFactory.getInstance();
		GpioPinDigitalInput myButton = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02,             // PIN NUMBER
				"MyButton",                   // PIN FRIENDLY NAME (optional)
				PinPullResistance.PULL_DOWN); // PIN RESISTANCE (optional)
		myButton.addListener(new SoundListener());
	}
}
