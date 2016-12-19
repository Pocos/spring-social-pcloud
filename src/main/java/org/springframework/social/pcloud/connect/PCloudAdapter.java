package org.springframework.social.pcloud.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.pcloud.api.PCloud;
import org.springframework.social.pcloud.api.PCloudProfile;

public class PCloudAdapter implements ApiAdapter<PCloud>{

	@Override
	public boolean test(PCloud api) {
		try {
			api.userOperations().getUserProfile();
			return true;
		} catch(ApiException e) {
			return false;
		}
	}

	@Override
	public void setConnectionValues(PCloud api, ConnectionValues values) {
		PCloudProfile profile = api.userOperations().getUserProfile();
		values.setProviderUserId(profile.getId());
	}

	@Override
	public UserProfile fetchUserProfile(PCloud api) {
		PCloudProfile profile=api.userOperations().getUserProfile();
		
		return new UserProfileBuilder()
				.setFirstName(profile.getFirstName())
				.setLastName("")
				.setEmail(profile.getEmail())
				.build();
	}

	@Override
	public void updateStatus(PCloud api, String message) {
		// TODO Auto-generated method stub
		
	}

}
