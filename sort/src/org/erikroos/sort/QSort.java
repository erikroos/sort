package org.erikroos.sort;


public class QSort extends SortClass {
	
	public void sort(int low, int high) {
		if (low < high) {
			int splitIndex = partition(low, high);
			sort(low, splitIndex - 1);
			sort(splitIndex + 1, high);
		}
	}
	
	private int partition(int low, int high) {
		int splitValue = sortList.get(low);
		int up = low;
		int down = high;
		do {
			while (sortList.get(up) <= splitValue && up < high) {
				up++;
			}
			while (sortList.get(down) > splitValue && down > low) {
				down--;
			}
			if (up < down) {
				exchange(up, down);
			}
		} while (up < down);
		int splitIndex = down;
		exchange(low, splitIndex);
		return splitIndex;
	}

	private void exchange(int index1, int index2) {
		int tmp = sortList.get(index2);
		sortList.set(index2, sortList.get(index1));
		sortList.set(index1, tmp);
	}
	
}
