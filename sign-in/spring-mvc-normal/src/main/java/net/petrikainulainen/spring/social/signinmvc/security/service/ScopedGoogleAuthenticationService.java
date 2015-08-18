package net.petrikainulainen.spring.social.signinmvc.security.service;

import org.springframework.social.google.api.Google;
import org.springframework.social.google.connect.GoogleConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

public class ScopedGoogleAuthenticationService extends OAuth2AuthenticationService<Google> {

    public ScopedGoogleAuthenticationService(String apiKey, String appSecret) {
        super(new GoogleConnectionFactory(apiKey, appSecret));
        setDefaultScope("https://www.googleapis.com/auth/userinfo.profile");
    }

}
