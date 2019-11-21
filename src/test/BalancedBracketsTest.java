package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
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
