package com.infy.world.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="country4")
public class Country {

	@Id
	private int no;
	private String code;
	private String name;
	private String continent;
	@Override
	public String toString() {
		return "Country [no=" + no + ", code=" + code + ", name=" + name + ", continent=" + continent + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	
	
	
}