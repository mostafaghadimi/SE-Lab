package test;
import main.impl.mult.MultImplRecursive;
import main.impl.mult.MultImplStandard;
import main.impl.power.PowerImplRecursive;
import main.impl.power.PowerImplStandard;
import main.interfaces.Power;
import org.junit.Test;
import org.junit.Assert;

public class PowerTest {
    @Test
    public void testPowerStandardRecursive() {
        Power power = new PowerImplStandard(new MultImplRecursive());
        Assert.assertEquals(81, power.power(3, 4), 0);
    }

    @Test
    public void testPowerRecursiveRecursive() {
        Power power = new PowerImplRecursive(new MultImplRecursive());
        Assert.assertEquals(81, power.power(3, 4), 0);
    }

    @Test
    public void testPowerRecursiveStandard(){
        Power power = new PowerImplRecursive(new MultImplStandard());
        Assert.assertEquals(81, power.power(3, 4), 0);
    }

    @Test
    public void testPowerStandardStandard(){
        Power power = new PowerImplStandard(new MultImplStandard());
        Assert.assertEquals(81, power.power(3, 4), 0);
    }
}
