package dev.thubaas.iocdemo.services;


import org.springframework.stereotype.Service;

import dev.thubaas.iocdemo.Address;

@Service
public class DeliveryService {
	
	private final Address address;
	
	public DeliveryService(Address address) {
		this.address = address;
	}
	
	public String showAddress() {
		return address.getStreetNumber() + " " + address.getStreetName();
	}

}
