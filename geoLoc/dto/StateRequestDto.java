package com.geoLoc.dto;

import lombok.Data;
@Data
public class StateRequestDto {
	private String stateCode;

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	} 
	
	
}
