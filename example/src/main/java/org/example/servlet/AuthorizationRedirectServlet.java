package org.example.servlet;

import lombok.extern.slf4j.Slf4j;
import org.simple.auth.model.OAuthException;
import org.simple.auth.service.NetworkService;
import org.simple.auth.servlet.AbstractAuthorizationRedirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Peter Schneider-Manzell
 */
@Slf4j
public class AuthorizationRedirectServlet extends AbstractAuthorizationRedirect {


    @Override
    public void onError(Exception authException, HttpServletRequest req, HttpServletResponse resp) {
        log.error("Error during authorziation redirect!", authException);
    }
}
