package com.gg.tlt.service.Impl;

import com.gg.tlt.mapper.RoleMapper;
import com.gg.tlt.service.RoleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;


//    @Override
//    public List<Role> selectRoleFunc(String roleName){
//
//        return roleMapper.selectRoleFunc(roleName);
//    }

}
