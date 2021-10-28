package com.xworkz.cityapp.dto;

public class CompaniesDTO {
	private int id;
	private String cName;
	private String headQuarter;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getHeadQuarter() {
		return headQuarter;
	}
	public void setHeadQuarter(String headQuarter) {
		this.headQuarter = headQuarter;
	}
	@Override
	public String toString() {
		return "CompaniesDTO [id=" + id + ", cName=" + cName + ", headQuarter=" + headQuarter + "]";
	}
	
	

}
