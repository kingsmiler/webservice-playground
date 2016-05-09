package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * 访问认证检查。
 *
 */
@Provider
@PreMatching
public class AuthorizationFilter implements ContainerRequestFilter {
    private static final Logger log = LoggerFactory.getLogger(AuthorizationFilter.class);

    private static final String EMPTY = "";

    public void filter(ContainerRequestContext ctx) throws IOException {
        log.info("-----------------AuthorizationFilter");
    }

    private static NotAuthorizedException notAuthorizedException = new NotAuthorizedException("Invalid Access!");

    private void throwNotAuthorizedException() {
        throw notAuthorizedException;
    }

}
