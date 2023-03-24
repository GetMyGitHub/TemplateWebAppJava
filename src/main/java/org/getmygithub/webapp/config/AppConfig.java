package org.getmygithub.webapp.config;

import org.getmygithub.webapp.controller.ProductController;
import org.getmygithub.webapp.repository.ProductRepository;
import org.getmygithub.webapp.service.ProductService;
import org.getmygithub.webapp.service.ProductServiceImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

public class AppConfig extends ResourceConfig {

	public AppConfig() {
		register(ProductController.class);
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(ProductServiceImpl.class).to(ProductService.class);
				bind(ProductRepository.class).to(ProductRepository.class);
			}
		});
		// Now you can expect validation errors to be sent to the
		// client.
		property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
	}
}