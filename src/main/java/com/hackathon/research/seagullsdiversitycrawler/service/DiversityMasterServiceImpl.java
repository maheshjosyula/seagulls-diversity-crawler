package com.hackathon.research.seagullsdiversitycrawler.service;

import com.hackathon.research.seagullsdiversitycrawler.model.CompanyDetails;
import com.hackathon.research.seagullsdiversitycrawler.model.DiversityMasterRequest;
import com.hackathon.research.seagullsdiversitycrawler.model.DiversityMasterResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class DiversityMasterServiceImpl implements DiversityMasterService{

    @Override
    public DiversityMasterResponse getDiversityData(DiversityMasterRequest diversityMasterRequest) {
        //call DB API
        DiversityMasterResponse diversityMasterResponse=new DiversityMasterResponse();
        diversityMasterResponse.setCompanyName(diversityMasterRequest.getCompanyName());
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "https://diversity-wrapper.azurewebsites.net/diversity/companyDetails?companyName=";
        CompanyDetails response
                = restTemplate.getForObject(fooResourceUrl + diversityMasterRequest.getCompanyName(), CompanyDetails.class);
        if(Objects.nonNull(response)){
            if("WBE".equalsIgnoreCase(response.getClassification())){
                diversityMasterResponse.setFemaleOwnedIndicator(Boolean.TRUE);
                diversityMasterResponse.setMinorityOwnedIndicator(Boolean.FALSE);
            }else if("MBE".equalsIgnoreCase(response.getClassification())){
                diversityMasterResponse.setFemaleOwnedIndicator(Boolean.FALSE);
                diversityMasterResponse.setMinorityOwnedIndicator(Boolean.TRUE);
            }else{
                diversityMasterResponse.setFemaleOwnedIndicator(Boolean.TRUE);
                diversityMasterResponse.setMinorityOwnedIndicator(Boolean.TRUE);
            }
            diversityMasterResponse.setStatus("completed");
            diversityMasterResponse.setCertificationType(response.getClassification());
            diversityMasterResponse.setOwnershipEthnicity(response.getEthnicity());
            diversityMasterResponse.setIdentificationProcess("Authenticated Master Data");
        }
        if(!"completed".equalsIgnoreCase(diversityMasterResponse.getStatus())){
            //call Image scanner
            diversityMasterResponse.setFemaleOwnedIndicator(false);
            diversityMasterResponse.setMinorityOwnedIndicator(false);
            diversityMasterResponse.setCertificationType("LGBTBE");
            diversityMasterResponse.setStatus("completed");
            diversityMasterResponse.setIdentificationProcess("Certificate Scanning");
        }
        if(!"completed".equalsIgnoreCase(diversityMasterResponse.getStatus())){
            //call NLP service in async mode
            diversityMasterResponse.setFemaleOwnedIndicator(true);
            diversityMasterResponse.setMinorityOwnedIndicator(true);
            diversityMasterResponse.setStatus("in progress");
            diversityMasterResponse.setOwnershipEthnicity("HISPANIC");
            diversityMasterResponse.setIdentificationProcess("Natural Language Processing");
        }
        return diversityMasterResponse;
    }
}
