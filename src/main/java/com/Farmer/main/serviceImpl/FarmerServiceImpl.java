package com.Farmer.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Farmer.main.dto.FarmerDTO;
import com.Farmer.main.model.Farmer;
import com.Farmer.main.repository.FarmerRepository;
import com.Farmer.main.service.FarmerService;
@Service
public class FarmerServiceImpl implements FarmerService{
@Autowired
private FarmerRepository farmerRepository;


@Override
public void createOrUpdateFarmer(FarmerDTO farDTO) {
	Farmer far = convertDtoToModel(farDTO);
	farmerRepository.save(far);
	
}
	private Farmer convertDtoToModel(FarmerDTO farDTO) {
		Farmer far = new Farmer();
		if (farDTO.getId() != null) {
			far.setId(farDTO.getId());
		}
		far.setItemtype(farDTO.getItemtype());
		far.setItemname(farDTO.getItemname());
		far.setEmail(farDTO.getEmail());
		far.setMobilenumber(farDTO.getMobilenumber());
		far.setPrice(farDTO.getPrice());
	
		return far;
	}
	@Override
	public List<FarmerDTO> getAllFarmer() {
		List<Farmer> list = farmerRepository.findAll();
		List<FarmerDTO> farmerlist = list.stream()
	            .map(FarmerDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		return farmerlist;
	}
	
	@Override
	public void deleteFarmer(Long id) {
		farmerRepository.deleteById(id);
		
	}

	@Override
	public FarmerDTO editFarmer(Long id) {
		Farmer far = farmerRepository.getOne(id);
		return convertModelToDTO(far);
		
	}
	private FarmerDTO convertModelToDTO(Farmer far) {
		

		FarmerDTO farDto = new FarmerDTO();
		farDto.setItemtype(far.getItemtype());
		farDto.setItemname(far.getItemname());
		farDto.setId(far.getId());
		farDto.setEmail(far.getEmail());
		farDto.setMobilenumber(far.getMobilenumber());
		farDto.setPrice(far.getPrice());
		return farDto;
	}
	
	
	

	

	

}
