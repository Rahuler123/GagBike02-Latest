package com.geoLoc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.geoLoc.model.PincodeMaster;
import com.geoLoc.response.PincodeResponse;
@Repository
public interface PincodeRepo extends JpaRepository<PincodeMaster,Integer> {
//	@Query("SELECT new com.geoLoc.response.PincodeResponse(p.pincode,d.districtCode,d.districtName,s.stateCode,s.stateNameCaps,p.countryCode) FROM PincodeMaster p JOIN DistrictMaster d ON p.districtCode = d.districtCode JOIN StateMaster s ON p.stateCode = s.stateCode where p.pincode = 686011 ")
//	public List<PincodeResponse> findByPincode(int pincode);
	
	public List<PincodeMaster> findByPincode(int pincode);
	
}

