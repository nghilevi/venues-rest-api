package io.github.vinhnghi.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import io.github.vinhnghi.resources.VenuesResources;

@Configuration
public class JerseyConfig extends ResourceConfig{
	/**
     * Register JAX-RS application components.
     */
	public JerseyConfig() {
		register(VenuesResources.class);
	}

}
