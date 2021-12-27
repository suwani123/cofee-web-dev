package com.adl.fh.request;

public class AgeRequest {
	
	private int age;
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "AgeRequest is* [age=" + age + "]";
	}

}
