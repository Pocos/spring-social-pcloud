package org.springframework.social.pcloud.api.impl;

import java.util.Map;

import org.springframework.social.pcloud.api.PCloudProfile;
import org.springframework.social.pcloud.api.UserOperations;
import org.springframework.web.client.RestTemplate;

public class UserTemplate extends AbstractPCloudOperations implements UserOperations{
	private final RestTemplate restTemplate;
	public UserTemplate(PCloudTemplate liveTemplate, RestTemplate restTemplate, boolean authorized) {
		super(authorized);
		this.restTemplate = restTemplate;
	}

	@Override
	public PCloudProfile getUserProfile() {
		@SuppressWarnings("unchecked")
		Map<String, ?> user = restTemplate.getForObject(buildUri("userinfo"), Map.class);
		String id=String.valueOf(user.get("userid"));
		String firstName = String.valueOf(user.get("email"));
		String email = String.valueOf(user.get("email"));
		
		return new PCloudProfile(id,firstName,email);

	}

}
