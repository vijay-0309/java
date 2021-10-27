package com.xworkz.hospitalapp.dto;

public class CountryDTO {
	private int countryId;
	private String countryName;
	private StateDTO stateDto;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public StateDTO getStateDto() {
		return stateDto;
	}

	public void setStateDto(StateDTO stateDto) {
		this.stateDto = stateDto;
	}

	@Override
	public String toString() {
		return "CountryDTO [countryId=" + countryId + ", countryName=" + countryName + ", stateDto=" + stateDto + "]";
	}

}
