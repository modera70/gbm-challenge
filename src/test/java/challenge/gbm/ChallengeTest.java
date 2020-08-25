package challenge.gbm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChallengeTest {

    @Test
    public void shouldFactorialMethodWork() throws Exception {
        Assert.assertEquals(ChallengeUtility.getFactorial(5),120);
    }

    @Test
    public void shouldValidateArrayMethodWork(){
        Assert.assertEquals(ChallengeUtility.validateArray(new char[]{'a','b','c','d'},'a','b','f'),false);
    }

    @Test
    public void shouldSumArrayElementsMethodWork(){
        Assert.assertEquals(ChallengeUtility.sumElements(new int[]{1,2,5}),8);
    }

    @Test
    public void shouldGetModuleMethodWork() throws Exception {
        Assert.assertEquals(ChallengeUtility.calculateModules(0,3),2);
    }

    @Test
    public void shouldGetNumberOfDaysMethodWork() throws Exception {
        Assert.assertEquals(ChallengeUtility.getNumberOfDays(2,2020),29);
    }

}
