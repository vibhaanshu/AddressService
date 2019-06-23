package com.service.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.address.model.AddressResponse;
import com.service.address.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
    @RequestMapping("/address")
    public AddressResponse getAddresses() {
        return addressService.getAllAddress();
    }
}
