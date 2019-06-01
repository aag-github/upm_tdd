package upm.xp.xp_tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinOpenLimitTest {
    @Test
    public void MinOpenLimitLower() {
        MinOpenLimit max = new MinOpenLimit(3);
        
        assertFalse(max.isIncluded(2));
    }
    
    @Test
    public void MinOpenLimitEqual() {
        MinOpenLimit max = new MinOpenLimit(3);
        
        assertFalse(max.isIncluded(3));        
    }

    @Test
    public void MinOpenLimitHigher() {
        MinOpenLimit max = new MinOpenLimit(3);
        
        assertTrue(max.isIncluded(4));        
    }
    
    @Test
    public void MinOpenLimitIsOpen() {
        MinOpenLimit max = new MinOpenLimit(3);
        
        assertFalse(max.isClosed());        
    }
}
