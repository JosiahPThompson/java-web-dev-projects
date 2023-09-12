package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void hasContentsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));

    }

    @Test
    public void hasLeadingContentsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));

    }

    @Test
    public void hasTrailingContentsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));

    }

    @Test
    public void isEmptyReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));

    }


    @Test
    public void hasMissingTrailingBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));

    }

    @Test
    public void hasReversedOrderTrailingBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));

    }

    @Test
    public void hasMissingTrailingBracketNoContentsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));

    }

    @Test
    public void hasEmptyReversedBracketsNoContentsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }

    @Test
    public void hasCurlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void hasCarrotBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("<>"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}