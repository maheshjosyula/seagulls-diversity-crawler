package com.hackathon.research.seagullsdiversitycrawler.service;

import com.hackathon.research.seagullsdiversitycrawler.model.DiversityMasterRequest;
import com.hackathon.research.seagullsdiversitycrawler.model.DiversityMasterResponse;

public interface DiversityMasterService {
    public DiversityMasterResponse getDiversityData(DiversityMasterRequest diversityMasterRequest);
}
