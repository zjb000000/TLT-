package com.gg.tlt.service;

import com.gg.tlt.model.Profession;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProfessionService {
    public List<Profession> selectOrderedSalary();
    public List<Profession> selectEducation();
    public List<Profession> selectArea();
    public List<Profession> To404();
    public List<Profession> selectPosition();
    public List<Profession> searchPosition(String jobTitle);
    public List<Profession> searchSalary(Integer minSalary,Integer maxSalary);
    public List<Profession> searchAre(String profProv, String profCity);
    public List<Profession> searchArean(String profProvOrCity);
}
