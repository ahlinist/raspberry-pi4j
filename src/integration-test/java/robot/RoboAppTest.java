package robot;

import com.pi4j.io.gpio.GpioController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import robot.configuration.ControllerConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RoboApplication.class, ControllerConfiguration.class})
@WebAppConfiguration
public class RoboAppTest {

    @MockBean
    GpioController gpioController;

    @Autowired
    TwoWheelRobot twoWheelRobot;

    @Test
    public void testMe() {
        Assert.assertNotNull(twoWheelRobot);
    }
}
