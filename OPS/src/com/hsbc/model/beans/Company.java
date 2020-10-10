package com.hsbc.model.beans;

public class Company {
	
	private String companyName;
	private String companyAddress;
	private String companyCity;
	private String companyGSTNumber;
	
	

	public Company(String name, String address, String city, String gstNumber) {
		super();
		this.companyName = name;
		this.companyAddress = address;
		this.companyCity = city;
		this.companyGSTNumber = gstNumber;
	}

	public String getName() {
		return companyName;
	}

	public void setName(String name) {
		this.companyName = name;
	}

	public String getAddress() {
		return companyAddress;
	}

	public void setAddress(String address) {
		this.companyAddress = address;
	}

	public String getCity() {
		return companyCity;
	}

	public void setCity(String city) {
		this.companyCity = city;
	}

	public String getGstNumber() {
		return companyGSTNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.companyGSTNumber = gstNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyAddress == null) ? 0 : companyAddress.hashCode());
		result = prime * result + ((companyCity == null) ? 0 : companyCity.hashCode());
		result = prime * result + ((companyGSTNumber == null) ? 0 : companyGSTNumber.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (companyAddress == null) {
			if (other.companyAddress != null)
				return false;
		} else if (!companyAddress.equals(other.companyAddress))
			return false;
		if (companyCity == null) {
			if (other.companyCity != null)
				return false;
		} else if (!companyCity.equals(other.companyCity))
			return false;
		if (companyGSTNumber == null) {
			if (other.companyGSTNumber != null)
				return false;
		} else if (!companyGSTNumber.equals(other.companyGSTNumber))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company [name=" + companyName + ", address=" + companyAddress + ", city=" + companyCity + ", gstNumber=" + companyGSTNumber + "]";
	}
	
	
	
	

}
