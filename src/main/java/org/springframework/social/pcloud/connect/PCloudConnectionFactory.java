package org.springframework.social.pcloud.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.pcloud.api.PCloud;

public class PCloudConnectionFactory extends OAuth2ConnectionFactory<PCloud> {

	public PCloudConnectionFactory(String clientId, String clientSecret) {
		super("pcloud", new PCloudServiceProvider(clientId, clientSecret), new PCloudAdapter());
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.connect.support.OAuth2ConnectionFactory#supportsStateParameter()
	 */
	@Override
	public boolean supportsStateParameter() {
		return false;
	}
}
