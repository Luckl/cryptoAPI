package com.luc.crypto;

import com.luc.crypto.configuration.LoggingRequestInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.MappedInterceptor;

/**
 * Starts our application using spring boot
 */
@SpringBootApplication
public class CryptoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CryptoApplication.class, args);
    }

    /**
     * Register our logging interceptor so it will start logging all requests done on our API
     * @return the MappedInterceptor bean
     */
    @Bean
    public MappedInterceptor myInterceptor() {
        return new MappedInterceptor(new String[]{"/currencies/**"}, new LoggingRequestInterceptor());
    }
}
