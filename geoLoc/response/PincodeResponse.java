package com.geoLoc.response;

public class PincodeResponse {
	
    private int pincode;
    private String  districtCode;
    private String  districtName;
    private String  stateCode;
    private String  stateNameCaps;
	private String countryCode;
	
	
	
	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public String getDistrictCode() {
		return districtCode;
	}



	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}



	public String getDistrictName() {
		return districtName;
	}



	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}



	public String getStateCode() {
		return stateCode;
	}



	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}



	public String getStateNameCaps() {
		return stateNameCaps;
	}



	public void setStateNameCaps(String stateNameCaps) {
		this.stateNameCaps = stateNameCaps;
	}



	public String getCountryCode() {
		return countryCode;
	}



	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}



	public PincodeResponse(int pincode, String districtCode, String districtName, String stateCode,
			String stateNameCaps, String countryCode) {
		super();
		this.pincode = pincode;
		this.districtCode = districtCode;
		this.districtName = districtName;
		this.stateCode = stateCode;
		this.stateNameCaps = stateNameCaps;
		this.countryCode = countryCode;
	}



	public PincodeResponse(int pincode) {
		
	}
    






}
