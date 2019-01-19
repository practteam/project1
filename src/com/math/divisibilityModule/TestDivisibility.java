package com.math.divisibilityModule;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import junit.framework.TestResult;


class TestDivisibility {

	@Test
	void trueTestForOnlyDivisibleByThree() {
		DivisibilityTest a = new DivisibilityTest();
		boolean isTrue = a.divisibleByThreeOrFive(9);
		Assert.assertTrue(isTrue);
	}
	@Test
	void falseTestForNotDivisibleByThreeandFive() {
		DivisibilityTest a = new DivisibilityTest();
		boolean num = a.divisibleByThreeOrFive(8);
		Assert.assertFalse(num);
	}
	
	@Test
	void trueTestForOnlyDivisibleByFive() {
		DivisibilityTest a = new DivisibilityTest();
		boolean num = a.divisibleByThreeOrFive(10);
		Assert.assertTrue(num);
	}
	@Test
	void trueTestForDivisibleByFiveandthree() {
		DivisibilityTest a = new DivisibilityTest();
		boolean num = a.divisibleByThreeOrFive(15);
		Assert.assertTrue(num);
	}

}
