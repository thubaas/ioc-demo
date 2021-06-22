package dev.thubaas.iocdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import dev.thubaas.iocdemo.Address;
import dev.thubaas.iocdemo.services.DeliveryService;

@Configuration
@ComponentScan(basePackageClasses = DeliveryService.class)
public class Config {
	
	@Bean
	public Address getAddress() {
		Address address = new Address();
		address.setStreetName("Fifi Street");
		address.setStreetNumber(2020);
		return address;
	}

}
