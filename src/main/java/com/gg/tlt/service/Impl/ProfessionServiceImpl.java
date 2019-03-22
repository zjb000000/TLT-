package com.gg.tlt.service.Impl;

import com.gg.tlt.mapper.ProfessionMapper;
import com.gg.tlt.model.Profession;
import com.gg.tlt.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService {

    @Autowired
    ProfessionMapper professionMapper;

    @Override
    public List<Profession> selectOrderedSalary() {
        return professionMapper.selectOrderedSalary();
    }

    @Override
    public List<Profession> selectEducation(){
        return professionMapper.selectEducation();
    }
    @Override
    public List<Profession> selectArea(){
        return professionMapper.selectArea();
    }
    @Override
    public List<Profession> To404(){
        return professionMapper.To404();
    }


    public List<Profession> selectPosition(){
        return professionMapper.selectPosition();
    }

    public List<Profession> searchPosition(String jobTitle){
        return professionMapper.searchPosition(jobTitle);
    }

    public List<Profession> searchAre(String profProv, String profCity){
        return professionMapper.searchAre(profProv, profCity);
    }

    public List<Profession> searchArean(String profProOrCity){
        return professionMapper.searchArean(profProOrCity);
    }

    public List<Profession> searchSalary(Integer minSalary,Integer maxSalary){
        return professionMapper.searchSalary(minSalary,maxSalary);
    }
}

