package com.gg.tlt.service;

import com.gg.tlt.model.Role;
import com.gg.tlt.model.User;

import java.util.List;

public interface UserInfoService {

    public List<User> queryAllUsers();

    public Integer addUser(User user);
    
    public User selectUserPassword(String nickname);

    public User isUserExist(String nickname);

    public Integer updateUserById(String nickname,Integer sex,String password,Integer id);

    public Role selectRoleFunc(String roleName);
}
