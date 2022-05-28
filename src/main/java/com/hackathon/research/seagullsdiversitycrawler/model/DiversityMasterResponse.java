package com.hackathon.research.seagullsdiversitycrawler.model;

public class DiversityMasterResponse {

    String companyName;

    Boolean minorityOwnedIndicator;

    Boolean femaleOwnedIndicator;

    String OwnershipEthnicity;

    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getMinorityOwnedIndicator() {
        return minorityOwnedIndicator;
    }

    public void setMinorityOwnedIndicator(Boolean minorityOwnedIndicator) {
        this.minorityOwnedIndicator = minorityOwnedIndicator;
    }

    public Boolean getFemaleOwnedIndicator() {
        return femaleOwnedIndicator;
    }

    public void setFemaleOwnedIndicator(Boolean femaleOwnedIndicator) {
        this.femaleOwnedIndicator = femaleOwnedIndicator;
    }

    public String getOwnershipEthnicity() {
        return OwnershipEthnicity;
    }

    public void setOwnershipEthnicity(String ownershipEthnicity) {
        OwnershipEthnicity = ownershipEthnicity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
