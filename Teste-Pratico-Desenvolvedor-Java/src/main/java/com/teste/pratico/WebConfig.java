package com.teste.pratico;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Configuration
public class WebConfig extends SpringBootServletInitializer implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/index.xhtml");
        registry.addViewController("/create-opening").setViewName("redirect:/create/create-opening.xhtml");
        registry.addViewController("/create-applicant").setViewName("redirect:/create/create-applicant.xhtml");
    }
}
