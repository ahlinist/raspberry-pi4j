package robot;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@RequiredArgsConstructor
public class RoboApplication implements ApplicationRunner {

	private final Robot robot;

	public static void main(String[] args) {
		SpringApplication.run(RoboApplication.class, args);
	}

	@Override
	@SneakyThrows
	public void run(ApplicationArguments args) {
		System.out.println("Starting app...");
		robot.init();
	}
}
