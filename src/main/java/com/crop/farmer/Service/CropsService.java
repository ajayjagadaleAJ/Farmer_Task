package com.crop.farmer.Service;

import java.util.List;

import com.crop.farmer.Entity.Crops;

public interface CropsService {
	
	public Crops addcrops(Crops c1);  //adding crops 
	
	public List<Crops> getAllCrops();  //display all records
	
	public  List<Crops> searchcrop(String name);  //search crop by name
	
	public List<Crops> serchbyprice(float price);  //search crop by price
	
	public Crops getSingleCrop(int id );     //search crop by id
	
	public List<Crops> delCrop(int id);           //delete crop by id
	
	public String delCropbyname(String name);   //delete crop by name
	
	public Crops getSingleCropUpdate(int id);  //update crop by id
	

	

	

}
