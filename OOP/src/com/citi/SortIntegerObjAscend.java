package com.citi;

import java.util.Comparator;
import java.util.TreeSet;

public class SortIntegerObjAscend {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				return i1.compareTo(i2);
			}

		});

		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(20);
		treeSet.add(20);

		System.out.println(treeSet);
	}

}
