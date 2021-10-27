package com.xworkz.hospitalapp.dto;

public class AddressDTO {
	private int addressId;
	private String addressName;
	private CountryDTO countryDto;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public CountryDTO getCountryDto() {
		return countryDto;
	}

	public void setCountryDto(CountryDTO countryDto) {
		this.countryDto = countryDto;
	}

	@Override
	public String toString() {
		return "AddressDTO [addressId=" + addressId + ", addressName=" + addressName + ", countryDto=" + countryDto
				+ "]";
	}

}
