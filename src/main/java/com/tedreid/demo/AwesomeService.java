package com.tedreid.demo;

public class AwesomeService {


	private long id;
	private String name;

	public AwesomeService(long id, String name) {
		this.id = id;
		this.name = name;

	}

	public String SayHelloToMyLittleFriend(){
		return "Hello, " + name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
