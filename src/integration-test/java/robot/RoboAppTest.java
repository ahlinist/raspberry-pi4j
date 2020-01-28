package robot;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import robot.configuration.ControllerTestConfiguration;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RoboApplication.class, ControllerTestConfiguration.class})
public class RoboAppTest {

    @Autowired
    TwoWheelRobot twoWheelRobot;

    @Test
    public void testApplicationContextLoads() {
        Assertions.assertThat(twoWheelRobot).isNotNull();
    }
}
