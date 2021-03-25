package com.example.SpringBootjspView;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//this program is used to configure the jsp file//we don't require application.properties when using this file

@Configuration
@EnableWebMvc
@ComponentScan
public class MVCConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void configureViewResolvers(ViewResolverRegistry register) {
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();	
	    resolver.setPrefix("/WEB-INF/jsp/");
	    resolver.setSuffix(".jsp");
	    //resolver.setSuffix(".html");
	    //Create file in src/main/webapp/WEB-INF/jsp.
	    resolver.setViewClass(JstlView.class);
	    register.viewResolver(resolver);
	}

}
