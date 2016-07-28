package org.ikane;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoSpringCloudOauth2ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudOauth2ClientApplication.class, args);
	}
	
}
