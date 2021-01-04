package com.Farmer.main.service;

import java.util.List;

import com.Farmer.main.dto.FarmerDTO;

public interface FarmerService {
	
public void createOrUpdateFarmer(FarmerDTO farDTO);
	
	public List<FarmerDTO> getAllFarmer();
	
	public void deleteFarmer(Long id);
	
	public FarmerDTO editFarmer(Long id);
	
}
