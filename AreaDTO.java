package com.xworkz.hospitalapp.dto;

public class AreaDTO {
	private int areaId;
	private String areaName;
	private StreetDTO streetDto;

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public StreetDTO getStreetDto() {
		return streetDto;
	}

	public void setStreetDto(StreetDTO streetDto) {
		this.streetDto = streetDto;
	}

	@Override
	public String toString() {
		return "AreaDTO [areaId=" + areaId + ", areaName=" + areaName + ", streetDto=" + streetDto + "]";
	}

}
