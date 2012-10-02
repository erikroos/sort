package org.erikroos.sort;

import java.util.ArrayList;
import java.util.List;

public abstract class SortClass {
	
	protected List<Integer> sortList;
	
	public abstract void sort(int low, int high);

	public List<Integer> getSortList() {
		return sortList;
	}

	public void setSortList(List<Integer> sortList) {
		this.sortList = new ArrayList<Integer>(sortList);
	}

}
