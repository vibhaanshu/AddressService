package com.service.addresss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.addresss.dao.AddressDao;
import com.service.addresss.model.AddressResponse;

@Component
public class AddressService {
	
	@Autowired
	AddressDao addressDao;
	
	public AddressResponse getAllAddress() {
		return addressDao.getAllAddress();
		
	}

}
