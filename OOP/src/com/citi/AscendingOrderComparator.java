package com.citi;

import java.util.TreeSet;

public class AscendingOrderComparator {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>(new MyComparatorForAscend());
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(20);
		treeSet.add(20);
		System.out.println(treeSet);
	}

}
