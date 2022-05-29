package com.hackathon.research.seagullsdiversitycrawler.model;

public class DiversityMasterResponse {

    String companyName;

    Boolean minorityOwnedIndicator;

    Boolean femaleOwnedIndicator;

    String OwnershipEthnicity;

    String status;

    String identificationProcess;

    String certificationType;

    public String getCertificationType() {
        return certificationType;
    }

    public void setCertificationType(String certificationType) {
        this.certificationType = certificationType;
    }

    public String getIdentificationProcess() {
        return identificationProcess;
    }

    public void setIdentificationProcess(String identificationProcess) {
        this.identificationProcess = identificationProcess;
    }

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
