package com.geoLoc.dto;

import lombok.Data;

@Data
public class PincodeRequestDto {
private int pincode;

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}


}
