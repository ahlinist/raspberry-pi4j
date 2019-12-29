package robo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import robo.sensor.sound.SoundSensor;

@SpringBootApplication
@RequiredArgsConstructor
public class RoboApplication implements ApplicationRunner {

	private final SoundSensor soundSensor;

	public static void main(String[] args) {
		SpringApplication.run(RoboApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("Starting app...");
		soundSensor.init();
	}
}
