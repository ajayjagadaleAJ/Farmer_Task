package com.crop.farmer.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crop.farmer.Entity.Crops;
@Repository
@Transactional
public interface CropsRepository extends JpaRepository<Crops, Integer> {
	
	public List<Crops> findByCname(String name);  //custom method to find crop by name
	
	public List<Crops> findByCprice(float price); //custom method to find crop by price
	
	public String deleteByCname(String name);  //delete method to delete crop by name


	

}
