package org.springframework.social.pcloud.security;

import org.springframework.social.pcloud.api.PCloud;
import org.springframework.social.pcloud.connect.PCloudConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

public class PCloudAuthenticationService extends OAuth2AuthenticationService<PCloud>{


	public PCloudAuthenticationService(String apiKey, String appSecret) {
		super(new PCloudConnectionFactory(apiKey, appSecret));
	}

}
