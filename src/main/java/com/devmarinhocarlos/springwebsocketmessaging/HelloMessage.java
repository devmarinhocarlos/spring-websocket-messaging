package com.devmarinhocarlos.springwebsocketmessaging;

public class HelloMessage {
	private String firstName;
	private String lastName;

	public HelloMessage(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public HelloMessage() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "HelloMessage [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
