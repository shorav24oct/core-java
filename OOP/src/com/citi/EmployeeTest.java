package com.citi;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "shorav");
		Employee e2 = new Employee(100, "shaily");
		Employee e3 = new Employee(105, "sharma");
		Employee e4 = new Employee(103, "test");

		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);

		System.out.println(treeSet);

		TreeSet<Employee> employees = new TreeSet<Employee>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				Employee e1 = (Employee) o1;
				Employee e2 = (Employee) o2;
				return e1.name.compareTo(e2.name);
			}

		});

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		System.out.println(employees);

	}

}
