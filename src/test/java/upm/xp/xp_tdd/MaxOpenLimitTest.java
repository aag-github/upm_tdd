package upm.xp.xp_tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MaxOpenLimitTest {
    @Test
    public void MaxOpenLimitLower() {
        MaxOpenLimit max = new MaxOpenLimit(3);
        
        assertTrue(max.isMatch(2));
    }
    
    @Test
    public void MaxOpenLimitEqual() {
        MaxOpenLimit max = new MaxOpenLimit(3);
        
        assertFalse(max.isMatch(3));        
    }

    @Test
    public void MaxOpenLimitHigher() {
        MaxOpenLimit max = new MaxOpenLimit(3);
        
        assertFalse(max.isMatch(4));        
    }
    
    @Test
    public void MaxOpenLimitIsClosed() {
        MaxOpenLimit max = new MaxOpenLimit(3);
        
        assertFalse(max.isClosed());        
    }
}
