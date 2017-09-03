package com.kubraiscier.designpatterns.creational.builder;

/**
 * @author kubraiscier
 *
 */
public class User {

	// All final attributes
	private final String firstName; // required
	private final String lastName; // required
	private final String phone; // optional
	private final String address; // optional

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	// All getter and no setter to provide immutability
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User: " + this.firstName + ", " + this.lastName + ", " + this.phone + ", " + this.address;
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private String phone;
		private String address;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		// Return the finally constructed User object
		public User build() {
			return new User(this);
		}
	}

}
