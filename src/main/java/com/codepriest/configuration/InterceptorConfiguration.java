package com.codepriest.configuration;

import com.codepriest.Interceptors.ClientVerifierInterceptor;
import com.codepriest.Interceptors.ValidationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurerAdapter {
    @Autowired
    ClientVerifierInterceptor clientVerifierInterceptor;
    @Autowired
    ValidationInterceptor validationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(clientVerifierInterceptor).addPathPatterns("/owanbe/*");
        registry.addInterceptor(validationInterceptor).addPathPatterns("/owanbe/*").excludePathPatterns("/owanbe/login");
    }
}
