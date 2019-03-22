package com.gg.tlt.mapper;

import com.gg.tlt.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMapper {
    public Role selectRoleFunc(String roleName);

}
