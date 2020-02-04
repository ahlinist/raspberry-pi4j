package robot;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import robot.chassis.Chassis;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class RoboApplication implements ApplicationRunner {

	private final Chassis chassis;

	public static void main(String[] args) {
		SpringApplication.run(RoboApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		log.info("Starting the robo app...");
		chassis.init();
	}
}
