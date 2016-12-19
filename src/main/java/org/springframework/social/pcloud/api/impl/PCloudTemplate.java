package org.springframework.social.pcloud.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.pcloud.api.PCloud;
import org.springframework.social.pcloud.api.UserOperations;
import org.springframework.social.support.ClientHttpRequestFactorySelector;

public class PCloudTemplate extends AbstractOAuth2ApiBinding implements PCloud{

	private UserOperations userOperations;
	
	public PCloudTemplate() {
		initialize();
	}

	public PCloudTemplate(String accessToken) {
		super(accessToken);
		initialize();
	}
	
	
	private void initialize() {
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
		initSubApis();

	}

	private void initSubApis() {
		userOperations = new UserTemplate(this, getRestTemplate(), isAuthorized());
	}

	@Override
	public UserOperations userOperations() {
		return userOperations;
	}
}
