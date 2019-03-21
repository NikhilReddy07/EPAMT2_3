package interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestTest {

	@Test
	void test() {
		
		InterestCalculator testObj=new InterestCalculator();
		
		//Simple Interest Test
		assertEquals(10,testObj.simpleInterest(100,5,2));
		assertEquals(94.5,testObj.simpleInterest(540,7,2.5));
		
		//Compound Interest Test
		assertEquals(110.25,testObj.compoundInterest(100,5,2));
		assertEquals(639.51,testObj.compoundInterest(540,7,2.5),0.01);
		
	}

}
