package com.hackathon.research.seagullsdiversitycrawler.service;

import com.hackathon.research.seagullsdiversitycrawler.model.CompanyDetails;
import com.hackathon.research.seagullsdiversitycrawler.model.DiversityMasterRequest;
import com.hackathon.research.seagullsdiversitycrawler.model.DiversityMasterResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
        System.out.println("@@@@@test@@@@@@@@@");
        System.out.println("@@@@@test body@@@@@@@@@:"+response.getDunsNum());
        diversityMasterResponse.setFemaleOwnedIndicator(true);
        diversityMasterResponse.setMinorityOwnedIndicator(true);
        diversityMasterResponse.setStatus("completed");
        diversityMasterResponse.setOwnershipEthnicity("HISPANIC");
        if(!"completed".equalsIgnoreCase(diversityMasterResponse.getStatus())){
            //call Image scanner
            diversityMasterResponse.setFemaleOwnedIndicator(true);
            diversityMasterResponse.setMinorityOwnedIndicator(true);
            diversityMasterResponse.setStatus("completed");
            diversityMasterResponse.setOwnershipEthnicity("HISPANIC");
        }
        if(!"completed".equalsIgnoreCase(diversityMasterResponse.getStatus())){
            //call NLP service
            diversityMasterResponse.setFemaleOwnedIndicator(true);
            diversityMasterResponse.setMinorityOwnedIndicator(true);
            diversityMasterResponse.setStatus("in progress");
            diversityMasterResponse.setOwnershipEthnicity("HISPANIC");
        }
        return diversityMasterResponse;
    }
}
