package dev.thubaas.iocdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import dev.thubaas.iocdemo.services.DeliveryService;

@SpringBootApplication
public class IocDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(IocDemoApplication.class, args);
		
		DeliveryService deliveryService = (DeliveryService) context.getBean(DeliveryService.class);
		
		System.out.println("Address retrieved from the address bean in the IoC Container");
		System.out.println(deliveryService.showAddress());
	}

}
