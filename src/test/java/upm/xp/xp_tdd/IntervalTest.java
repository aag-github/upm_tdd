package upm.xp.xp_tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntervalTest {
    @Test
    public void GetMinLimitDifferentValuesClosed() {
        Interval interval1 = new IntervalBuilder().withMin(3).build();
        Interval interval2 = new IntervalBuilder().withMin(2).build();
        
        Limit result = interval1.getMaximumOfMinLimits(interval2);
        
        assertEquals(result.getValue(), 3, 1E-6);
        assertTrue(result.isClosed());
    }

    @Test    
    public void GetMinLimitDifferentValuesOpen() {
        Interval interval1 = new IntervalBuilder().withMin(3).withMinType("(").build();
        Interval interval2 = new IntervalBuilder().withMin(2).build();
        
        Limit result1 = interval1.getMaximumOfMinLimits(interval2);    
        assertEquals(result1.getValue(), 3, 1E-6);
        assertFalse(result1.isClosed());

        Limit result2 = interval2.getMaximumOfMinLimits(interval1);    
        assertEquals(result2.getValue(), 3, 1E-6);
        assertFalse(result2.isClosed());
    }

    @Test
    public void GetMinLimitSameValuesClosed() {
        Interval interval1 = new IntervalBuilder().withMin(2).build();
        Interval interval2 = new IntervalBuilder().withMin(2).build();
        
        Limit result = interval1.getMaximumOfMinLimits(interval2);
        
        assertEquals(result.getValue(), 2, 1E-6);
        assertTrue(result.isClosed());
    }

    @Test    
    public void GetMinLimitSameValuesOpen() {
        Interval interval1 = new IntervalBuilder().withMin(2).withMinType("(").build();
        Interval interval2 = new IntervalBuilder().withMin(2).build();
        
        Limit result1 = interval1.getMaximumOfMinLimits(interval2);    
        assertEquals(result1.getValue(), 2, 1E-6);
        assertFalse(result1.isClosed());

        Limit result2 = interval2.getMaximumOfMinLimits(interval1);    
        assertEquals(result2.getValue(), 2, 1E-6);
        assertFalse(result2.isClosed());
    }
    
    @Test
    public void GetMaxLimitDifferentValuesClosed() {
        Interval interval1 = new IntervalBuilder().withMax(3).build();
        Interval interval2 = new IntervalBuilder().withMax(2).build();
        
        Limit result = interval1.getMinimumOfMaxLimits(interval2);
        
        assertEquals(result.getValue(), 2, 1E-6);
        assertTrue(result.isClosed());
    }

    @Test    
    public void GetMaxLimitDifferentValuesOpen() {
        Interval interval1 = new IntervalBuilder().withMax(3).build();
        Interval interval2 = new IntervalBuilder().withMax(2).withMaxType(")").build();
        
        Limit result1 = interval1.getMinimumOfMaxLimits(interval2);    
        assertEquals(result1.getValue(), 2, 1E-6);
        assertFalse(result1.isClosed());

        Limit result2 = interval2.getMinimumOfMaxLimits(interval1);    
        assertEquals(result2.getValue(), 2, 1E-6);
        assertFalse(result2.isClosed());
    }

    @Test
    public void GetMaxLimitSameValuesClosed() {
        Interval interval1 = new IntervalBuilder().withMax(2).build();
        Interval interval2 = new IntervalBuilder().withMax(2).build();
        
        Limit result = interval1.getMinimumOfMaxLimits(interval2);
        
        assertEquals(result.getValue(), 2, 1E-6);
        assertTrue(result.isClosed());
    }

    @Test    
    public void GetMaxLimitSameValuesOpen() {
        Interval interval1 = new IntervalBuilder().withMax(2).build();
        Interval interval2 = new IntervalBuilder().withMax(2).withMaxType(")").build();

        Limit result1 = interval1.getMinimumOfMaxLimits(interval2);    
        assertEquals(result1.getValue(), 2, 1E-6);
        assertFalse(result1.isClosed());

        Limit result2 = interval2.getMinimumOfMaxLimits(interval1);    
        assertEquals(result2.getValue(), 2, 1E-6);
        assertFalse(result2.isClosed());
    }
    
    @Test(expected = AssertionError.class)
    public void MaxMinWrongValues() {
        new IntervalBuilder().withMax(2).withMin(3).build();
    }
}
