import org.junit.Test;

import static org.junit.Assert.*;

public class PlusTest {
    @Test
    public void plus() throws Exception {
        Plus ten = new Plus();
        assertEquals("Der skal stå 10", 10, ten.expectTen());
    }

    @org.junit.Test
    public void minus() throws Exception {
        Plus twe = new Plus();
        assertEquals("Der skal stå 20", 20, twe.expectTwenty());
    }

}