package upm.xp.xp_tdd;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ClosedIntervalTest extends IntersectionBaseTest {

    @Parameters(name = "{index}: Closed_Closed: {0} {1}{2},{3}{4} {5}{6},{7}{8} returns {9}") 
    public static Collection<Object[]> data() {
        Object[][] values = {               
                { "Non-overlapping_ZeroLength_Left",    "[", 4, 6, "]", "[", 0, 0, "]", false },
                { "Non-overlapping_ZeroLength_Right",   "[", 4, 6, "]", "[", 8, 8, "]", false },
                { "Non-overlapping_Left",               "[", 4, 6, "]", "[", 0, 2, "]", false },
                { "Non-overlapping_Right",              "[", 4, 6, "]", "[", 8, 9, "]", false },
                { "Adjacent_Left",                      "[", 4, 6, "]", "[", 0, 4, "]", true },
                { "Adjacent_Right",                     "[", 4, 6, "]", "[", 6, 9, "]", true },
                { "From_OutLeft_To_Middle",             "[", 4, 6, "]", "[", 0, 5, "]", true },
                { "From_OutRight_To_Middle",            "[", 4, 6, "]", "[", 5, 9, "]", true },
                { "From_OutLeft_To_RightLimit",         "[", 4, 6, "]", "[", 0, 6, "]", true },
                { "From_OutRight_To_LeftLimit",         "[", 4, 6, "]", "[", 4, 9, "]", true },
                { "From_OutLeft_To_OutRight",           "[", 4, 6, "]", "[", 0, 9, "]", true },
                { "ZeroLength_On_RightLimit",           "[", 4, 6, "]", "[", 4, 4, "]", true },
                { "ZeroLength_On_LeftLimit",            "[", 4, 6, "]", "[", 6, 6, "]", true },
                { "From_LeftLimit_To_Middle",           "[", 4, 6, "]", "[", 4, 5, "]", true },
                { "From_RightLimit_To_Middle",          "[", 4, 6, "]", "[", 5, 6, "]", true },
                { "SameLimits",                         "[", 4, 6, "]", "[", 4, 6, "]", true },                
                { "ZeroLength_InTheMiddle",             "[", 4, 6, "]", "[", 5, 5, "]", true },                
        
        };
        return Arrays.asList(values);
    }

}
