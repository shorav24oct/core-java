package com.citi;

public class Employee implements Comparable<Object> {

	Integer id;
	String name;

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		Integer id1 = this.id;

		Employee employee = (Employee) o;
		Integer id2 = employee.id;

		return id1.compareTo(id2);
	}

}
