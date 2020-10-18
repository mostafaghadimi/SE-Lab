package test;
import main.impl.mult.MultImplStandard;
import main.impl.power.PowerImplStandard;
import main.interfaces.Power;
import org.junit.Test;
import org.junit.Assert;

public class PowerTest {
    @Test
    public void testPower() {
        Power power = new PowerImplStandard(new MultImplStandard());
        Assert.assertEquals(12, power.power(3, 4), 0);
    }
}
