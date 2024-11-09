package com.JRTP.DC_API.service;

import com.JRTP.DC_API.binding.*;

import java.util.Map;

public interface DcService {

    public Map<Integer,String> getPlans();
    public boolean savePlanSelection(PlanSelection planSelection);
    public boolean saveIncome(Income income);
    public boolean saveEducation(Education education);
    public boolean saveKids(Kids kids);
    public DcSummary fetchSummaryInfo(Long caseNum);

}
