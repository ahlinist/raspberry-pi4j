package robot.configuration;

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinListener;
import com.pi4j.io.gpio.trigger.GpioTrigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Configuration
public class ControllerTestConfiguration {

    @Bean
    public GpioController gpioController() {
        return new GpioController() {
            @Override
            public void export(PinMode mode, PinState defaultState, GpioPin... pin) {

            }

            @Override
            public void export(PinMode mode, GpioPin... pin) {

            }

            @Override
            public boolean isExported(GpioPin... pin) {
                return false;
            }

            @Override
            public void unexport(Pin... pin) {

            }

            @Override
            public void unexport(GpioPin... pin) {

            }

            @Override
            public void unexportAll() {

            }

            @Override
            public void setMode(PinMode mode, GpioPin... pin) {

            }

            @Override
            public PinMode getMode(GpioPin pin) {
                return null;
            }

            @Override
            public boolean isMode(PinMode mode, GpioPin... pin) {
                return false;
            }

            @Override
            public void setPullResistance(PinPullResistance resistance, GpioPin... pin) {

            }

            @Override
            public PinPullResistance getPullResistance(GpioPin pin) {
                return null;
            }

            @Override
            public boolean isPullResistance(PinPullResistance resistance, GpioPin... pin) {
                return false;
            }

            @Override
            public void high(GpioPinDigitalOutput... pin) {

            }

            @Override
            public boolean isHigh(GpioPinDigital... pin) {
                return false;
            }

            @Override
            public void low(GpioPinDigitalOutput... pin) {

            }

            @Override
            public boolean isLow(GpioPinDigital... pin) {
                return false;
            }

            @Override
            public void setState(PinState state, GpioPinDigitalOutput... pin) {

            }

            @Override
            public void setState(boolean state, GpioPinDigitalOutput... pin) {

            }

            @Override
            public boolean isState(PinState state, GpioPinDigital... pin) {
                return false;
            }

            @Override
            public PinState getState(GpioPinDigital pin) {
                return null;
            }

            @Override
            public void toggle(GpioPinDigitalOutput... pin) {

            }

            @Override
            public void pulse(long milliseconds, GpioPinDigitalOutput... pin) {

            }

            @Override
            public void setValue(double value, GpioPinAnalogOutput... pin) {

            }

            @Override
            public double getValue(GpioPinAnalog pin) {
                return 0;
            }

            @Override
            public void addListener(GpioPinListener listener, GpioPinInput... pin) {

            }

            @Override
            public void addListener(GpioPinListener[] listeners, GpioPinInput... pin) {

            }

            @Override
            public void removeListener(GpioPinListener listener, GpioPinInput... pin) {

            }

            @Override
            public void removeListener(GpioPinListener[] listeners, GpioPinInput... pin) {

            }

            @Override
            public void removeAllListeners() {

            }

            @Override
            public void addTrigger(GpioTrigger trigger, GpioPinInput... pin) {

            }

            @Override
            public void addTrigger(GpioTrigger[] triggers, GpioPinInput... pin) {

            }

            @Override
            public void removeTrigger(GpioTrigger trigger, GpioPinInput... pin) {

            }

            @Override
            public void removeTrigger(GpioTrigger[] triggers, GpioPinInput... pin) {

            }

            @Override
            public void removeAllTriggers() {

            }

            @Override
            public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, String name, PinMode mode, PinPullResistance resistance) {
                return null;
            }

            @Override
            public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, PinMode mode, PinPullResistance resistance) {
                return null;
            }

            @Override
            public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, String name, PinMode mode) {
                return null;
            }

            @Override
            public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(GpioProvider provider, Pin pin, PinMode mode) {
                return null;
            }

            @Override
            public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, String name, PinMode mode, PinPullResistance resistance) {
                return null;
            }

            @Override
            public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, PinMode mode, PinPullResistance resistance) {
                return null;
            }

            @Override
            public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, String name, PinMode mode) {
                return null;
            }

            @Override
            public GpioPinDigitalMultipurpose provisionDigitalMultipurposePin(Pin pin, PinMode mode) {
                return null;
            }

            @Override
            public GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin, String name, PinPullResistance resistance) {
                return null;
            }

            @Override
            public GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin, PinPullResistance resistance) {
                return null;
            }

            @Override
            public GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinDigitalInput provisionDigitalInputPin(GpioProvider provider, Pin pin) {
                return null;
            }

            @Override
            public GpioPinDigitalInput provisionDigitalInputPin(Pin pin, String name, PinPullResistance resistance) {
                return new GpioPinDigitalInput() {
                    @Override
                    public boolean hasDebounce(PinState state) {
                        return false;
                    }

                    @Override
                    public int getDebounce(PinState state) {
                        return 0;
                    }

                    @Override
                    public void setDebounce(int debounce) {

                    }

                    @Override
                    public void setDebounce(int debounce, PinState... state) {

                    }

                    @Override
                    public boolean isHigh() {
                        return false;
                    }

                    @Override
                    public boolean isLow() {
                        return false;
                    }

                    @Override
                    public PinState getState() {
                        return null;
                    }

                    @Override
                    public boolean isState(PinState state) {
                        return false;
                    }

                    @Override
                    public Collection<GpioTrigger> getTriggers() {
                        return null;
                    }

                    @Override
                    public void addTrigger(GpioTrigger... trigger) {

                    }

                    @Override
                    public void addTrigger(List<? extends GpioTrigger> triggers) {

                    }

                    @Override
                    public void removeTrigger(GpioTrigger... trigger) {

                    }

                    @Override
                    public void removeTrigger(List<? extends GpioTrigger> triggers) {

                    }

                    @Override
                    public void removeAllTriggers() {

                    }

                    @Override
                    public GpioProvider getProvider() {
                        return null;
                    }

                    @Override
                    public Pin getPin() {
                        return null;
                    }

                    @Override
                    public void setName(String name) {

                    }

                    @Override
                    public String getName() {
                        return null;
                    }

                    @Override
                    public void setTag(Object tag) {

                    }

                    @Override
                    public Object getTag() {
                        return null;
                    }

                    @Override
                    public void setProperty(String key, String value) {

                    }

                    @Override
                    public boolean hasProperty(String key) {
                        return false;
                    }

                    @Override
                    public String getProperty(String key) {
                        return null;
                    }

                    @Override
                    public String getProperty(String key, String defaultValue) {
                        return null;
                    }

                    @Override
                    public Map<String, String> getProperties() {
                        return null;
                    }

                    @Override
                    public void removeProperty(String key) {

                    }

                    @Override
                    public void clearProperties() {

                    }

                    @Override
                    public void export(PinMode mode) {

                    }

                    @Override
                    public void export(PinMode mode, PinState defaultState) {

                    }

                    @Override
                    public void unexport() {

                    }

                    @Override
                    public boolean isExported() {
                        return false;
                    }

                    @Override
                    public void setMode(PinMode mode) {

                    }

                    @Override
                    public PinMode getMode() {
                        return null;
                    }

                    @Override
                    public boolean isMode(PinMode mode) {
                        return false;
                    }

                    @Override
                    public void setPullResistance(PinPullResistance resistance) {

                    }

                    @Override
                    public PinPullResistance getPullResistance() {
                        return null;
                    }

                    @Override
                    public boolean isPullResistance(PinPullResistance resistance) {
                        return false;
                    }

                    @Override
                    public Collection<GpioPinListener> getListeners() {
                        return null;
                    }

                    @Override
                    public void addListener(GpioPinListener... listener) {

                    }

                    @Override
                    public void addListener(List<? extends GpioPinListener> listeners) {

                    }

                    @Override
                    public boolean hasListener(GpioPinListener... listener) {
                        return false;
                    }

                    @Override
                    public void removeListener(GpioPinListener... listener) {

                    }

                    @Override
                    public void removeListener(List<? extends GpioPinListener> listeners) {

                    }

                    @Override
                    public void removeAllListeners() {

                    }

                    @Override
                    public GpioPinShutdown getShutdownOptions() {
                        return null;
                    }

                    @Override
                    public void setShutdownOptions(GpioPinShutdown options) {

                    }

                    @Override
                    public void setShutdownOptions(Boolean unexport) {

                    }

                    @Override
                    public void setShutdownOptions(Boolean unexport, PinState state) {

                    }

                    @Override
                    public void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance) {

                    }

                    @Override
                    public void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance, PinMode mode) {

                    }
                };
            }

            @Override
            public GpioPinDigitalInput provisionDigitalInputPin(Pin pin, PinPullResistance resistance) {
                return null;
            }

            @Override
            public GpioPinDigitalInput provisionDigitalInputPin(Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinDigitalInput provisionDigitalInputPin(Pin pin) {
                return null;
            }

            @Override
            public GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin, String name, PinState defaultState) {
                return null;
            }

            @Override
            public GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin, PinState defaultState) {
                return null;
            }

            @Override
            public GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinDigitalOutput provisionDigitalOutputPin(GpioProvider provider, Pin pin) {
                return null;
            }

            @Override
            public GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin, String name, PinState defaultState) {
                return null;
            }

            @Override
            public GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin, PinState defaultState) {
                return null;
            }

            @Override
            public GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinDigitalOutput provisionDigitalOutputPin(Pin pin) {
                return null;
            }

            @Override
            public GpioPinAnalogInput provisionAnalogInputPin(GpioProvider provider, Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinAnalogInput provisionAnalogInputPin(GpioProvider provider, Pin pin) {
                return null;
            }

            @Override
            public GpioPinAnalogInput provisionAnalogInputPin(Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinAnalogInput provisionAnalogInputPin(Pin pin) {
                return null;
            }

            @Override
            public GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin, String name, double defaultValue) {
                return null;
            }

            @Override
            public GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin, double defaultValue) {
                return null;
            }

            @Override
            public GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinAnalogOutput provisionAnalogOutputPin(GpioProvider provider, Pin pin) {
                return null;
            }

            @Override
            public GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin, String name, double defaultValue) {
                return null;
            }

            @Override
            public GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin, double defaultValue) {
                return null;
            }

            @Override
            public GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinAnalogOutput provisionAnalogOutputPin(Pin pin) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin, String name, int defaultValue) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin, int defaultValue) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionPwmOutputPin(GpioProvider provider, Pin pin) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionPwmOutputPin(Pin pin, String name, int defaultValue) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionPwmOutputPin(Pin pin, int defaultValue) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionPwmOutputPin(Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionPwmOutputPin(Pin pin) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin, String name, int defaultValue) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin, int defaultValue) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionSoftPwmOutputPin(GpioProvider provider, Pin pin) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin, String name, int defaultValue) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin, int defaultValue) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin, String name) {
                return null;
            }

            @Override
            public GpioPinPwmOutput provisionSoftPwmOutputPin(Pin pin) {
                return null;
            }

            @Override
            public GpioPin provisionPin(GpioProvider provider, Pin pin, String name, PinMode mode, PinState defaultState) {
                return null;
            }

            @Override
            public GpioPin provisionPin(GpioProvider provider, Pin pin, String name, PinMode mode) {
                return null;
            }

            @Override
            public GpioPin provisionPin(GpioProvider provider, Pin pin, PinMode mode) {
                return null;
            }

            @Override
            public GpioPin provisionPin(Pin pin, String name, PinMode mode) {
                return null;
            }

            @Override
            public GpioPin provisionPin(Pin pin, PinMode mode) {
                return null;
            }

            @Override
            public void setShutdownOptions(GpioPinShutdown options, GpioPin... pin) {

            }

            @Override
            public void setShutdownOptions(Boolean unexport, GpioPin... pin) {

            }

            @Override
            public void setShutdownOptions(Boolean unexport, PinState state, GpioPin... pin) {

            }

            @Override
            public void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance, GpioPin... pin) {

            }

            @Override
            public void setShutdownOptions(Boolean unexport, PinState state, PinPullResistance resistance, PinMode mode, GpioPin... pin) {

            }

            @Override
            public Collection<GpioPin> getProvisionedPins() {
                return null;
            }

            @Override
            public GpioPin getProvisionedPin(Pin pin) {
                return null;
            }

            @Override
            public GpioPin getProvisionedPin(String name) {
                return null;
            }

            @Override
            public void unprovisionPin(GpioPin... pin) {

            }

            @Override
            public boolean isShutdown() {
                return false;
            }

            @Override
            public void shutdown() {

            }
        };
    }

}
