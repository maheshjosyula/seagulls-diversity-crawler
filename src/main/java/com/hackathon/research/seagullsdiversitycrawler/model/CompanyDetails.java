package com.hackathon.research.seagullsdiversitycrawler.model;

public class CompanyDetails {

	private String dunsName;

	private Long dunsNum;

	@Override
	public String toString() {
		return "CompanyDetails{" +
				"dunsName='" + dunsName + '\'' +
				", dunsNum=" + dunsNum +
				", country='" + country + '\'' +
				", streetAddress='" + streetAddress + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zip='" + zip + '\'' +
				", phone='" + phone + '\'' +
				", executiveContact1='" + executiveContact1 + '\'' +
				", executiveContact2='" + executiveContact2 + '\'' +
				", isWomanOwned='" + isWomanOwned + '\'' +
				", minorityOwnedDesc='" + minorityOwnedDesc + '\'' +
				", classification='" + classification + '\'' +
				", ethnicity='" + ethnicity + '\'' +
				'}';
	}

	private String country;

	private String streetAddress;

	private String city;

	private String state;

	private String zip;

	private String phone;

	private String executiveContact1;

	private String executiveContact2;

	private String isWomanOwned;

	private String minorityOwnedDesc;

	private String classification;

	private String ethnicity;

	public String getDunsName() {
		return dunsName;
	}

	public void setDunsName(String dunsName) {
		this.dunsName = dunsName;
	}

	public Long getDunsNum() {
		return dunsNum;
	}

	public void setDunsNum(Long dunsNum) {
		this.dunsNum = dunsNum;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getExecutiveContact1() {
		return executiveContact1;
	}

	public void setExecutiveContact1(String executiveContact1) {
		this.executiveContact1 = executiveContact1;
	}

	public String getExecutiveContact2() {
		return executiveContact2;
	}

	public void setExecutiveContact2(String executiveContact2) {
		this.executiveContact2 = executiveContact2;
	}

	public String getIsWomanOwned() {
		return isWomanOwned;
	}

	public void setIsWomanOwned(String isWomanOwned) {
		this.isWomanOwned = isWomanOwned;
	}

	public String getMinorityOwnedDesc() {
		return minorityOwnedDesc;
	}

	public void setMinorityOwnedDesc(String minorityOwnedDesc) {
		this.minorityOwnedDesc = minorityOwnedDesc;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
}
