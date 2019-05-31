package upm.xp.xp_tdd;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class IntersectionBaseTest {
    
    @Parameters(name = "{index}: Base class to parametrize other tests: {0} {1}{2},{3}{4} {5}{6},{7}{8} returns {9}") 
    public static Collection<Object[]> data() {
        Object[][] values = {               
                { "dummy test",    "[", 0, 0, "]", "[", 0, 0, "]", true },
        
        };
        assert(true);
        return Arrays.asList(values);
    }

    @Parameter(0) public String name; 
    
    @Parameter(1) public String firstMinType;
    @Parameter(2) public double firstMin;
    @Parameter(3) public double firstMax;
    @Parameter(4) public String firstMaxType;
    
    @Parameter(5) public String secondMinType;
    @Parameter(6) public double secondMin;
    @Parameter(7) public double secondMax;
    @Parameter(8) public String secondMaxType;
    
    @Parameter(9) public boolean result;


    
@Test
public void givenTwoInervalsCheckIsIntersectedFunction() {
    Interval one = new IntervalBuilder().withMin(firstMin)
                                        .withMax(firstMax)
                                        .withMinType(firstMinType)
                                        .withMaxType(firstMaxType)
                                        .build();

    Interval another = new IntervalBuilder().withMin(secondMin)
                                            .withMax(secondMax)
                                            .withMinType(secondMinType)
                                            .withMaxType(secondMaxType)
                                            .build();

    assertEquals(one.isIntersected(another), result);
}
}
