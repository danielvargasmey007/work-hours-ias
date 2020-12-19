package com.ias.workhours.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The Class ConfiguracionAplicacion.
 */
@Configuration
public class ConfiguracionAplicacion implements WebMvcConfigurer{
	
	/**
	 * Adds the cors mappings.
	 *
	 * @param registry the registry
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedOrigins("*")
			.allowedMethods("POST","GET");
	}
}