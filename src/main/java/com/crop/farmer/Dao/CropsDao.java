package com.crop.farmer.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crop.farmer.Entity.Crops;
import com.crop.farmer.Repository.CropsRepository;
import com.crop.farmer.Service.CropsService;

@Service
public class CropsDao implements CropsService {
 
//	All implementation of methods created in service
	
	@Autowired
	CropsRepository cr;
	
	@Override
	public Crops addcrops(Crops c1) {
		
		return cr.save(c1);
	}
	
	

	@Override
	public List<Crops> getAllCrops() {
		return cr.findAll();
	}
	
	@Override
	public List<Crops> searchcrop(String name) {
		
		return  cr.findByCname(name);
	}
	
	@Override
	public List<Crops> serchbyprice(float price) {
		
		return cr.findByCprice(price);
	}

	@Override
	public Crops getSingleCrop(int id) {
		
		return cr.findById(id).orElse(null);
	}

	@Override
	public List<Crops> delCrop(int id) {
		
		 cr.deleteById(id);
		 return cr.findAll();
	}


	@Override
	public String delCropbyname(String name) {
		
		return cr.deleteByCname(name);
	}


	@Override
	public Crops getSingleCropUpdate(int id) {
		
		return cr.findById(id).orElse(null);
	}

	


	

	


	
	

}
