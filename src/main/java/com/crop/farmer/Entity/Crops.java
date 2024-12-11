package com.crop.farmer.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.context.properties.bind.Name;

@Entity
public class Crops {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int cid;
	private String cname;
	private float cprice;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getCprice() {
		return cprice;
	}
	public void setCprice(float cprice) {
		this.cprice = cprice;
	}
	@Override
	public String toString() {
		return "Crops [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + "]";
	}
	
	
	
	
	
	
	
}
