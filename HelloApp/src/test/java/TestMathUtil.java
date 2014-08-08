import org.junit.Test;
import org.junit.Assert;

/**
 * Created by jim on 14-8-8.
 */
public class TestMathUtil {
    @Test
    public void testAdd(){
        int sum = MathUtil.add(1,2);
        Assert.assertEquals(sum,3);
    }

    @Test
    public void testSub(){
        int sum = MathUtil.sub(10,7);
        Assert.assertEquals(sum,3);
    }

}
