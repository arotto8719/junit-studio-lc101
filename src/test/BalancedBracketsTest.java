package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
@Test
public void onlyBracketsReturnFalse() {
    BalancedBrackets test_Class = new BalancedBrackets();
    assertFalse(test_Class.hasBalancedBrackets("[]"));
}
    //for normal addition
    @Test
    public void testAdd1Plus1() {
        int x  = 1 ; int y = 1;
        assertEquals(2, test_Class.hasBalancedBrackets.add(x,y));
    }
    //if you are using 0 as default for null, make sure your class works in that case.
    @Test
    public void testAdd1Plus1()
    {
        int y = 1;
        assertEquals(0, test_Class.hasBalancedBrackets.add(null,y));
    }

        @Test
        public void testSimpleAddition() {
        }


        @Test
        public void testPositiveNegativeAddition() {
        }


        @Test
        public void testNegativePositiveAddition() {
        }


        @Test
        public void testNegativeAddition() {
        }


        @Test
        public void testOverflow() {
        }

    @Before
    public void createBalancedBrackets() {
        test_Class.newBalancedBrackets();
        }
    @Test
    public void onlyBracketsExpected() {
        assertEquals(test_Class.actualBalancedBrackets("[]"));
    }
    }


