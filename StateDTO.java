package com.xworkz.hospitalapp.dto;

public class StateDTO {
	private int stateId;
	private String stateName;
	private DistrictDTO districtDto;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public DistrictDTO getDistrictDto() {
		return districtDto;
	}

	public void setDistrictDto(DistrictDTO districtDto) {
		this.districtDto = districtDto;
	}

	@Override
	public String toString() {
		return "StateDTO [stateId=" + stateId + ", stateName=" + stateName + ", districtDto=" + districtDto + "]";
	}

}
