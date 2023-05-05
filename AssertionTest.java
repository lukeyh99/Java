package JUnit.testsrc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertionTest
{

    @Test
    public void testAssert()
    {

	// Variable declaration
	String string1 = "Junit";
	String string2 = "Junit";
	String string3 = "test";
	String string4 = "test";
	String string5 = null;
	int variable1 = 1;
	int variable2 = 2;
	int[] arithematicArrary1 =
	    { 1, 2, 3 };
	int[] arithematicArrary2 =
	    { 1, 2, 3 };

	// Assert statements
	assertEquals(string1, string2);
	assertSame(string3, string4);
	assertNotSame(string1, string3);
	assertNotNull(string1);
	assertNull(string5);
	assertTrue(variable1 < variable2);
	assertArrayEquals(arithematicArrary1, arithematicArrary2);
    }

}
