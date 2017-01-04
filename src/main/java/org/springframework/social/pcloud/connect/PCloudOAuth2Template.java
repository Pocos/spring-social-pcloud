package org.springframework.social.pcloud.connect;

import org.springframework.social.oauth2.OAuth2Template;
/**
 * 
 * @author Andrea M.G. Pocorobba
 *
 */
public class PCloudOAuth2Template extends OAuth2Template{

	private static String AUTHORIZE_URL = "https://my.pcloud.com/oauth2/authorize";
	private static String ACCESS_TOKEN_URL = "https://api.pcloud.com/oauth2_token";
	
	/**
	 * @param clientId
	 * @param clientSecret
	 */
	public PCloudOAuth2Template(String clientId, String clientSecret) {
		super(clientId, clientSecret,AUTHORIZE_URL, ACCESS_TOKEN_URL);
		setUseParametersForClientAuthentication(true);
	}

}
