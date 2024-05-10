package com.citi;

import java.util.Comparator;
import java.util.TreeSet;

public class SortStringObjReverseAlpha {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				String s1 = (String) o1;
				String s2 = (String) o2;
				return s2.compareTo(s1);
			}

		});

		treeSet.add("shorav");
		treeSet.add("shaily");
		treeSet.add("rinki");
		treeSet.add("anu");
		treeSet.add("onkeshwar");
		treeSet.add("nancy");
		treeSet.add("renu");

		System.out.println(treeSet);
	}

}
