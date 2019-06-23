package com.service.addresss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.addresss.model.AddressResponse;
import com.service.addresss.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
    @RequestMapping("/address")
    public AddressResponse getAddresses() {
        return addressService.getAllAddress();
    }
}
