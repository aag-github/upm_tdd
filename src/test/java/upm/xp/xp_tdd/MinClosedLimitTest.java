package upm.xp.xp_tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinClosedLimitTest {
    @Test
    public void MinClosedLimitLower() {
        MinClosedLimit max = new MinClosedLimit(3);
        
        assertFalse(max.isIncluded(2));
    }
    
    @Test
    public void MinClosedLimitEqual() {
        MinClosedLimit max = new MinClosedLimit(3);
        
        assertTrue(max.isIncluded(3));        
    }

    @Test
    public void MinClosedLimitHigher() {
        MinClosedLimit max = new MinClosedLimit(3);
        
        assertTrue(max.isIncluded(4));        
    }
    
    @Test
    public void MinClosedLimitIsClosed() {
        MinClosedLimit max = new MinClosedLimit(3);
        
        assertTrue(max.isClosed());        
    }
}
