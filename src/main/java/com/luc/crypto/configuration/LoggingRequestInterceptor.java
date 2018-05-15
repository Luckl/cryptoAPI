package com.luc.crypto.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This is an interceptor that will log the request method and URI that was called on our API
 */
@Slf4j
@Component
public class LoggingRequestInterceptor extends HandlerInterceptorAdapter {

    /**
     * Logs the URI and Method of the request
     * @return true, otherwise our request will fail
     */
    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) {
        log.error("The endpoint {} has just been called with method {}", request.getRequestURI(),
                request.getMethod());
        return true;
    }

    @Override
    public void afterCompletion(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex) {
        // this method is empty because we do not want to log anything after the request was completed
    }
}
