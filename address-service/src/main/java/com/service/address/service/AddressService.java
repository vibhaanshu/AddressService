package com.service.address.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.address.dao.AddressDao;
import com.service.address.model.AddressResponse;

@Component
public class AddressService {
	
	@Autowired
	AddressDao addressDao;
	
	public AddressResponse getAllAddress() {
		return addressDao.getAllAddress();
		
	}

}
