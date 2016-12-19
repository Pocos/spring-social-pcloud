package org.springframework.social.pcloud.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.pcloud.api.PCloud;
import org.springframework.social.pcloud.api.impl.PCloudTemplate;

public class PCloudServiceProvider  extends AbstractOAuth2ServiceProvider<PCloud> {

	public PCloudServiceProvider(String clientId, String clientSecret) {
		super(new PCloudOAuth2Template(clientId, clientSecret));
	}

	@Override
	public PCloud getApi(String accessToken) {
		return new PCloudTemplate(accessToken);
	}
}
