package com.service.address.model;

import java.util.ArrayList;
import java.util.List;

public class AddressResponse {
	
	List<Address> addresses = new ArrayList<Address>();
	
	public void add(Address address) {
		addresses.add(address);
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
