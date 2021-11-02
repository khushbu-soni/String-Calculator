

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalc {

	public static void main(String args[]) {
	      org.junit.runner.JUnitCore.main("TestCalc");
	    }
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	
	
}