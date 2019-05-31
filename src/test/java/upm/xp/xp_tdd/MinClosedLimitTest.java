package upm.xp.xp_tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinClosedLimitTest {
    @Test
    public void MinClosedLimitLower() {
        MinClosedLimit max = new MinClosedLimit(3);
        
        assertFalse(max.isMatch(2));
    }
    
    @Test
    public void MinClosedLimitEqual() {
        MinClosedLimit max = new MinClosedLimit(3);
        
        assertTrue(max.isMatch(3));        
    }

    @Test
    public void MinClosedLimitHigher() {
        MinClosedLimit max = new MinClosedLimit(3);
        
        assertTrue(max.isMatch(4));        
    }
    
    @Test
    public void MinClosedLimitIsClosed() {
        MinClosedLimit max = new MinClosedLimit(3);
        
        assertTrue(max.isClosed());        
    }
}
