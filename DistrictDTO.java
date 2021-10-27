package com.xworkz.hospitalapp.dto;

public class DistrictDTO {
	private int districtId;
	private String districtName;
	private AreaDTO areaDto;

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public AreaDTO getAreaDto() {
		return areaDto;
	}

	public void setAreaDto(AreaDTO areaDto) {
		this.areaDto = areaDto;
	}

	@Override
	public String toString() {
		return "DistrictDTO [districtId=" + districtId + ", districtName=" + districtName + ", areaDto=" + areaDto
				+ "]";
	}

}
