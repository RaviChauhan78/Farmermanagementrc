package com.Farmer.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Farmer.main.dto.FarmerDTO;
import com.Farmer.main.service.FarmerService;

@Controller
public class FarmerController {
	@Autowired
	private FarmerService farmerService;

	@GetMapping("/registration")
	public String reg(Map<String, Object> model) {
		model.put("farmer", new FarmerDTO());
		return "Registration";
	}
	
	@PostMapping("/home")
	public String createEmployee(@ModelAttribute("farmer") FarmerDTO farDTO) {
		farmerService.createOrUpdateFarmer(farDTO);
		return "redirect:/list";	
	}
	
	@GetMapping("/list")
	public String listOfFarmer(Model model) {
		List<FarmerDTO> farmerlist = farmerService.getAllFarmer();
		model.addAttribute("farList", farmerlist);
		return "farmerList";
	}
	
	@PostMapping("/delete")
	public String deleteFarmer(@RequestParam("id") String id) {
		farmerService.deleteFarmer(Long.parseLong(id));
		return "redirect:/list";		
	}
	
	@GetMapping("/edit")
	public String editFarmer(@RequestParam("id") String id, Map<String, Object> model) {
		FarmerDTO farDto = farmerService.editFarmer(Long.parseLong(id));
		model.put("farmer", farDto);
		return "Registration";
	}
}
