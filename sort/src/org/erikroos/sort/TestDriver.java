package org.erikroos.sort;

import java.util.ArrayList;
import java.util.List;

public class TestDriver {
	
	public void runTest(int nrOfTimes, int orderedness, int arraySize) {
		long startTime;
		long endTime;
		long totalTimeH = 0;
		long totalTimeQ = 0;
		HSort hSort = new HSort();
		QSort qSort = new QSort();
		List<Integer> sortList;
		
		for (int i = 0; i < nrOfTimes; i++) {
			sortList = createSortList(arraySize, orderedness);
			hSort.setSortList(sortList);
			qSort.setSortList(sortList);
			//System.out.println("List to order: " + sortList.toString());
			
			startTime = System.nanoTime();
			hSort.sort(0, sortList.size() - 1);
			endTime = System.nanoTime();
			totalTimeH += (endTime - startTime);
			//System.out.println("H-ordered list: " + hSort.getSortList().toString());
			
			startTime = System.nanoTime();
			qSort.sort(0, sortList.size() - 1);
			endTime = System.nanoTime();
			totalTimeQ += (endTime - startTime);
			//System.out.println("Q-ordered list: " + hSort.getSortList().toString());
			
			if (hSort.getSortList().size() != arraySize || qSort.getSortList().size() != arraySize ||
				!hSort.getSortList().equals(qSort.getSortList())) {
				System.out.println("An error occurred during sorting!");
			}
			
		}
		double avgQ = totalTimeQ / (1000.0 * nrOfTimes);
		double avgH = totalTimeH / (1000.0 * nrOfTimes);
		System.out.println("Times: " +  nrOfTimes +
				"\t\tOrderedness: " + orderedness + "%\t\tSize: " + arraySize + 
				"\tAverage time Q: " + String.format("%.2f", avgQ)  + " micros" +
				"\t\tAverage time H: " + String.format("%.2f", avgH) + " micros" +
				"\tFactor H vs. Q: " + String.format("%.2f", avgH / avgQ));
	}

	private List<Integer> createSortList(int size, int orderedness) {
		List<Integer> sortList = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			if (Math.random() < (orderedness / 100.0)) {
				sortList.add(i);
			} else {
				sortList.add((int)(Math.random() * 100));
			}
		}
		return sortList;
	}
}
