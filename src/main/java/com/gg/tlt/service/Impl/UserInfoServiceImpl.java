package com.gg.tlt.service.Impl;

import com.gg.tlt.mapper.RoleMapper;
import com.gg.tlt.mapper.UserInfoMapper;
import com.gg.tlt.model.Role;
import com.gg.tlt.model.User;
import com.gg.tlt.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    UserInfoMapper userInfoMapper;

    @Resource
    RoleMapper roleMapper;

    @Override
    public List<User> queryAllUsers() {
        return userInfoMapper.selectAllUsers();
    }

    @Override
    public Integer addUser(User user) {
        return userInfoMapper.insertUser(user);
    }
    

    public User selectUserPassword(String nickname){

        return userInfoMapper.selectUserPassword(nickname);
    }

    public User isUserExist(String nickname){
     return userInfoMapper.isUserExist(nickname);
    }

    public Integer updateUserById(String nickname, Integer sex, String password, Integer id){
        return userInfoMapper.updateUserById(nickname,sex,password,id);}

    public Role selectRoleFunc(String roleName){
        return userInfoMapper.selectRoleFunc(roleName);
    }
}
