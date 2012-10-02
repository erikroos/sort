package org.erikroos.sort;


public class HSort extends SortClass {
	
	private int itemToInsert = -1;
	
	public void sort(int low, int high) {
		int i = 0;
		while (i < sortList.size()) {
			i = sortRun();
		}
		if (itemToInsert > -1) {
			sortRun();
		}
	}
	
	private int sortRun() {
		int i = 0;
		int prev = sortList.get(0);
		while (i < sortList.size() && sortList.get(i) >= prev) {
			if (itemToInsert > -1 && itemToInsert < sortList.get(i)) {
				sortList.add(i, itemToInsert);
				itemToInsert = -1;
			}
			prev = sortList.get(i);
			i++;
		}
		if (i < sortList.size()) {
			itemToInsert = sortList.get(i);
			sortList.remove(i);
		}
		return i;
	}

}
