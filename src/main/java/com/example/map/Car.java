package com.example.map;

public class Car {

	String name;

	public Car(String name) {
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		int result = 1;
//		final int prime = 31;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println(toString() +" hashCode: " + result);
		return result;
	}

	// use this method and observe different behaviour
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return printAndReturn(obj, true);
//		if (obj == null)
//			return printAndReturn(obj, false);
//		if (getClass() != obj.getClass())
//			return printAndReturn(obj, false);
//		Car other = (Car) obj;
//		if (name == null) {
//			if (other.name != null)
//				return printAndReturn(obj, false);
//		} 
//		else if (!name.equals(other.name))
//			return printAndReturn(obj, false);
//		return printAndReturn(obj, true);
//	}
	
	@Override
	public boolean equals(Object obj) {
		return printAndReturn(obj, super.equals(obj));
	}

	public boolean printAndReturn(Object obj, boolean result) {
		System.out.println(toString() + " equals " + obj + ": " + result);
		return result;
	}
	
	@Override
	public String toString() {
		return super.hashCode() + " Car [name=" + name + "]";
	}
	
	
}
