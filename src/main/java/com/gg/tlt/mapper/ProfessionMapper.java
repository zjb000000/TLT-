package com.gg.tlt.mapper;

import com.gg.tlt.model.Profession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProfessionMapper {
    public List<Profession> selectOrderedSalary();
    public List<Profession> selectEducation();
    public List<Profession> selectArea();
    public List<Profession> To404();
    public List<Profession> selectPosition();
    public List<Profession> searchAre(@Param("profProv") String profProv,
                                       @Param("profCity") String profCity);
    public List<Profession> searchArean(String profProOrCity);
    public List<Profession> searchPosition(String jobTitle);
    public List<Profession> searchSalary(Integer minSalary,Integer maxSalary);
}
