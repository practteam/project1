package com.math.divisibilityModule;

public class DivisibilityTest {
	Boolean divisibleByThreeOrFive(int num) {
		if(num % 3 == 0 || num % 5 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
