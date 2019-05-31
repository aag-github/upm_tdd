package upm.xp.xp_tdd;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Closed_ClosedOpen_IntervalTest extends IntersectionBaseTest {

    // Los test cases se podrían definir sin tantos argumentos, ya que cada clase podría tener un atributo 
    // que fuera el tipo de los intervalos, en vez de poner "[" "]" "(" ")" todo el rato, pero visualmente ayuda
    // el ver los inervalos "completos" (con los marcadores del tipo de extremo) cuando estás pensando si un 
    // test debe devolver true o false
    @Parameters(name = "{index}: Closed_Closed: {0} {1}{2},{3}{4} {5}{6},{7}{8} returns {9}") 
    public static Collection<Object[]> data() {
        Object[][] values = {               
                { TestName.Non_overlapping_ZeroLength_Left,    "[", 4, 6, "]", "[", 0, 0, ")", false },
                { TestName.Non_overlapping_ZeroLength_Right,   "[", 4, 6, "]", "[", 8, 8, ")", false },
                { TestName.Non_overlapping_Left,               "[", 4, 6, "]", "[", 0, 2, ")", false },
                { TestName.Non_overlapping_Right,              "[", 4, 6, "]", "[", 8, 9, ")", false },
                { TestName.Adjacent_Left,                      "[", 4, 6, "]", "[", 0, 4, ")", false },
                { TestName.Adjacent_Right,                     "[", 4, 6, "]", "[", 6, 9, ")", true },
                { TestName.From_OutLeft_To_Middle,             "[", 4, 6, "]", "[", 0, 5, ")", true },
                { TestName.From_OutRight_To_Middle,            "[", 4, 6, "]", "[", 5, 9, ")", true },
                { TestName.From_OutLeft_To_RightLimit,         "[", 4, 6, "]", "[", 0, 6, ")", true },
                { TestName.From_OutRight_To_LeftLimit,         "[", 4, 6, "]", "[", 4, 9, ")", true },
                { TestName.From_OutLeft_To_OutRight,           "[", 4, 6, "]", "[", 0, 9, ")", true },
                { TestName.ZeroLength_On_RightLimit,           "[", 4, 6, "]", "[", 4, 4, ")", false },
                { TestName.ZeroLength_On_LeftLimit,            "[", 4, 6, "]", "[", 6, 6, ")", false },
                { TestName.From_LeftLimit_To_Middle,           "[", 4, 6, "]", "[", 4, 5, ")", true },
                { TestName.From_RightLimit_To_Middle,          "[", 4, 6, "]", "[", 5, 6, ")", true },
                { TestName.SameLimits,                         "[", 4, 6, "]", "[", 4, 6, ")", true },
                { TestName.ZeroLength_InTheMiddle,             "[", 4, 6, "]", "[", 5, 5, ")", false },
                { TestName.ZeroLength_On_ZeroLength,           "[", 4, 4, "]", "[", 4, 4, ")", false },
                { TestName.ZeroLength_Not_On_ZeroLength,       "[", 4, 4, "]", "[", 5, 5, ")", false },
        };
        assert(values.length == IntersectionBaseTest.NUMBER_OF_TESTS);

        return Arrays.asList(values);
    }

}
