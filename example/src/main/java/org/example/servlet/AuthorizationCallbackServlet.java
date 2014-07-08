package org.example.servlet;

import lombok.extern.slf4j.Slf4j;
import org.simple.auth.model.AccessToken;
import org.simple.auth.model.BasicUserProfile;
import org.simple.auth.model.OAuthException;
import org.simple.auth.servlet.AbstractAuthorizationCallback;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Peter Schneider-Manzell
 */
@Slf4j
public class AuthorizationCallbackServlet extends AbstractAuthorizationCallback {
    @Override
    public void onError(OAuthException authException, HttpServletRequest req, HttpServletResponse resp) {
        log.error("Error during authorization callback!", authException);
    }

    @Override
    public void onSuccess(AccessToken accessToken, BasicUserProfile userProfile, HttpServletRequest req, HttpServletResponse resp) {
        log.error("Successfull authorization callback!");
    }
}