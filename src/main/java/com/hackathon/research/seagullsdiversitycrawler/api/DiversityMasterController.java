package com.hackathon.research.seagullsdiversitycrawler.api;

import com.hackathon.research.seagullsdiversitycrawler.model.DiversityMasterRequest;
import com.hackathon.research.seagullsdiversitycrawler.model.DiversityMasterResponse;
import com.hackathon.research.seagullsdiversitycrawler.service.DiversityMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiversityMasterController {
    @Autowired
    DiversityMasterService diversityMasterService;
    @GetMapping("/api/diversityData/{companyName}")
    public DiversityMasterResponse getDiversityData(@PathVariable String companyName){
        DiversityMasterRequest diversityMasterRequest=new DiversityMasterRequest();
        diversityMasterRequest.setCompanyName(companyName);
        return diversityMasterService.getDiversityData(diversityMasterRequest);
    }
}
