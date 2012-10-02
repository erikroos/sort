package org.erikroos.sort;


public class Sort {

	public static void main(String[] args) {
		TestDriver test = new TestDriver();
		
		// Vary number of repetitions -> find point where performance ratio Q vs. H stabilizes
		test.runTest(100, 0, 100);
		test.runTest(1000, 0, 100);
		test.runTest(10000, 0, 100);
		test.runTest(50000, 0, 100);
		test.runTest(100000, 0, 100);
		test.runTest(500000, 0, 100);
		test.runTest(1000000, 0, 100);
		System.out.println();
		
		// Vary orderedness
		test.runTest(100000, 0, 100);
		test.runTest(100000, 10, 100);
		test.runTest(100000, 20, 100);
		test.runTest(100000, 30, 100);
		test.runTest(100000, 40, 100);
		test.runTest(100000, 50, 100);
		test.runTest(100000, 60, 100);
		test.runTest(100000, 70, 100);
		test.runTest(100000, 80, 100);
		test.runTest(100000, 90, 100);
		test.runTest(100000, 95, 100);
		test.runTest(100000, 98, 100);
		test.runTest(100000, 99, 100);
		test.runTest(100000, 100, 100);
		System.out.println();
		
		// Vary array size
		test.runTest(100000, 50, 10);
		test.runTest(100000, 50, 100);
		test.runTest(100000, 50, 500);
		test.runTest(100000, 50, 1000);
	}

}
