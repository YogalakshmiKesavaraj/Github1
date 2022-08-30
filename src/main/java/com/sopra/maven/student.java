package com.sopra.maven;

import org.springframework.beans.factory.annotation.Autowired;

public class student {
@Autowired
private Address address;


public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public student(Address address) {
	super();
	this.address = address;
}

public student() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "student [address=" + address + "]";
}


}
