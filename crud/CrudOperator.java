package com.xworkz.crudOperator.crud;

public class CrudOperator {
	private String[] beachNames = new String[5];
	private String country = new String();
	private int counter = 0;

	public CrudOperator() {
		this("INDIA");
		System.out.println("Invoked no arg Constructer");
	}

	public CrudOperator(String country) {
		this.country = country;
		System.out.println("invoked String Constructer");
	}

	public String getCountry() {
		return country;
	}

	public void addBeachName(String name) {
		System.out.println("Invoked addBeachName");
		System.out.println("Name arg : ".concat(name));
		if (this.counter < 5) {
			this.beachNames[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("Array is full");
		}
	}

	public void displayBeachNames() {
		System.out.println("Invoked displayBeachNames");
		for (int i = 0; i < this.beachNames.length; i++) {
			String name = this.beachNames[i];
			System.out.println(name);
		}
	}

}
