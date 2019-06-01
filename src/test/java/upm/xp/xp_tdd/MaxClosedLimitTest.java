package upm.xp.xp_tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MaxClosedLimitTest {
    @Test
    public void MaxClosedLimitLower() {
        MaxClosedLimit max = new MaxClosedLimit(3);
        
        assertTrue(max.isIncluded(2));
    }
    
    @Test
    public void MaxClosedLimitEqual() {
        MaxClosedLimit max = new MaxClosedLimit(3);
        
        assertTrue(max.isIncluded(3));        
    }

    @Test
    public void MaxClosedLimitHigher() {
        MaxClosedLimit max = new MaxClosedLimit(3);
        
        assertFalse(max.isIncluded(4));        
    }
    
    @Test
    public void MaxClosedLimitIsClosed() {
        MaxClosedLimit max = new MaxClosedLimit(3);
        
        assertTrue(max.isClosed());        
    }
}
