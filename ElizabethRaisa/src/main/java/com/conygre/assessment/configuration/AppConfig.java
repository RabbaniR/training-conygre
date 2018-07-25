package com.conygre.assessment.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/*import org.springframework.boot.autoconfigure.EnableAutoConfiguration;*/

@Configuration
@EnableWebMvc
@Import(JpaConfiguration.class)
@ComponentScan(basePackages = "com.conygre.assessment")
/*@EnableJpaRepositories
@EntityScan("com.conygre.assessment.entities")*/
public class AppConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/src/main/static/**").addResourceLocations("/src/main/static/");

    }
}

