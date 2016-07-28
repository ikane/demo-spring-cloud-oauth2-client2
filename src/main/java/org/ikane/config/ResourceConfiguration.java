package org.ikane.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;


@Configuration
@EnableResourceServer
public class ResourceConfiguration  extends ResourceServerConfigurerAdapter {
	
	/**
	 * Provide security so that endpoints are only served if the request is
	 * already authenticated.
	 */
	@Override
	public void configure(HttpSecurity http) throws Exception {
		// @formatter:off
				http
				.headers()
					.frameOptions().disable()
				.and()
				.authorizeRequests()
						.anyRequest()
							.authenticated()
//							.antMatchers(HttpMethod.GET, "/**").access("#oauth2.hasScope('read')")
//				            .antMatchers(HttpMethod.OPTIONS, "/**").access("#oauth2.hasScope('read')")
//				            .antMatchers(HttpMethod.POST, "/**").access("#oauth2.hasScope('write')")
//				            .antMatchers(HttpMethod.PUT, "/**").access("#oauth2.hasScope('write')")
//				            .antMatchers(HttpMethod.PATCH, "/**").access("#oauth2.hasScope('write')")
//				            .antMatchers(HttpMethod.DELETE, "/**").access("#oauth2.hasScope('write')")
				            ;
		// @formatter:on
	}
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.resourceId("service");
	}
}
