package com.crop.farmer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crop.farmer.Entity.Crops;
import com.crop.farmer.Repository.CropsRepository;
import com.crop.farmer.Service.CropsService;

@RestController
@RequestMapping("/rate")
public class FarmerController {
	
	@Autowired
	CropsService cs;
	
	@Autowired
	CropsRepository cp;

	
	//Testing API 
	@GetMapping("/test")
	public String Test()
	{
		return"Test API working";
	}
	
	
	//Adding crop in database
	
	@PostMapping("/addcrop")
	public ResponseEntity<Crops> addcrop(@RequestBody Crops c1)
	{
		Crops cy = cs.addcrops(c1);
		return ResponseEntity.ok(cy);
		
	}
	
	
	//Get all crops details
	
	@GetMapping("/getallcrops")
	public List<Crops> AllCrops()
	{
		List<Crops> l1 = cs.getAllCrops();
		return l1;
	}
	
	//Get crop by name
	
	@GetMapping("/getCropByname/{name}")
	public List<Crops> searchCrop(@PathVariable String name)
	{
		List<Crops> ck = cs.searchcrop(name);
		return ck;
	}
	
   //Get crop by price
	
	@GetMapping("/getCropbyPrice/{price}")
	public List<Crops> searchbyprice(@PathVariable float price)
	{
		List<Crops> cd = cs.serchbyprice(price);
		return cd;
	}
	
	
	//Get all crops by id
	
	@GetMapping("/getcropbyid/{id}")
	public Crops CropbyID(@PathVariable int id)
	{
		Crops ct = cs.getSingleCrop(id);
		return ct;
		
	}
	
	//Delete crop by id
	@DeleteMapping("/deletebyid/{id}")
	public List<Crops> DeleteCrop(@PathVariable int id)
	{
		List<Crops> x = cs.delCrop(id);
		return x;
		
	}
	
	
	//Delete crop by name
	@DeleteMapping("/deletebyname/{name}")
	public String deletebyname(@PathVariable String name)
	{
		cs.delCropbyname(name);
		return "Record Deleted successfully" ;
	}
	
	
	
	//Update crop by id
	@PutMapping("/updateCropbyId/{id}")
	public String updateCrops(@PathVariable int id,@RequestBody Crops c1)
	{
		Crops cn = cs.getSingleCrop(id);
		if(c1.getCname()!= null) cn.setCname(c1.getCname());
		if(c1.getCprice()!= 0)cn.setCprice(c1.getCprice());
		 
		cs.addcrops(cn);
	
		return"Record Updated";
	}
	
	
	

}
