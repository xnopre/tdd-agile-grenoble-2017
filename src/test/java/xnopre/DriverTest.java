package xnopre;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DriverTest {
    @Test
    public void test() {

        Connector connector = mock(Connector.class);
        Driver driver = new Driver(connector);

        driver.openGate("2");

        verify(connector).transmit("OG2");

    }

    @Test
    public void test_error() {

        Connector connector = mock(Connector.class);
        Driver driver = new Driver(connector);
        doThrow(new RuntimeException()).when(connector).transmit(anyString());

        try {
            driver.openGate("2");
        } catch (Exception e) {
            Assert.assertEquals(DriverException.class, e.getClass());
        }

    }
}
