package org.springframework.social.pcloud.api;

public class PCloudProfile {

	private final String id;

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getEmail() {
		return email;
	}

	private final String firstName;

	private final String email;

	public PCloudProfile(String id, String firstName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.email = email;
	}
}
