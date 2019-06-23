package com.service.address.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.service.address.model.Address;
import com.service.address.model.AddressResponse;

@Component
public class AddressDao {
	
	public AddressResponse getAllAddress() {
		return createAddresses();
	}
	
	private AddressResponse createAddresses() {
		AddressResponse addressResponse = new AddressResponse();

		Address address = new Address();
		address.setCity("Delhi");
		address.setPostalCode("110099");
		address.setStreet("Pritam Pura");
		
		addressResponse.add(address);
		
		address = new Address();
		address.setCity("Delhi");
		address.setPostalCode("110090");
		address.setStreet("Preet Vihar");
		
		addressResponse.add(address);
		
		return addressResponse;
	}

}
