import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    public void everyStatementAndBranchTest1() {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<String>(Arrays.asList())));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<String>(Arrays.asList("1","2","3","4","5"))));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals((new ArrayList<String>(Arrays.asList("1", "#", "2", "0", "3", "#", "1", "#", "#"))),SILab2.function(new ArrayList<String>(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "#"))));

        assertEquals((new ArrayList<String>(Arrays.asList("#", "2", "#", "1", "1", "#", "0", "1", "#"))),SILab2.function(new ArrayList<String>(Arrays.asList("#", "0", "#", "0", "0", "#", "0", "0", "#"))));
    }
}