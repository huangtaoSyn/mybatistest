package com.huang.dao;/**
 * @author: huangtao
 * @description:
 * @date: 2019-02-19 17:47
 * @version: $version$
 */
public class Employee {
	public int id;
	public String name;
	public boolean gender;
	public String email;

	public Employee() {
	}

	public Employee(int id, String name, boolean gender, String email) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender=" + gender +
				", email='" + email + '\'' +
				'}';
	}
}
