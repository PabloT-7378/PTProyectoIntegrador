package com.ptportfolio.pablot.security.jwt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtEntPoi implements AuthenticationEntryPoint {
    private final static Logger logger = LoggerFactory.getLogger(JwtEntPoi.class);

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        logger.error("Fallo el metodo");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
    }
}
