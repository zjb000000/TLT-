package com.gg.tlt.mapper;

import com.gg.tlt.model.Role;
import com.gg.tlt.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserInfoMapper {

    public List<User> selectAllUsers();

    public Integer insertUser(User user);


    public User selectUserPassword(@Param("nickname") String nickname);

    public User isUserExist(String nickname);
    public Role selectRoleFunc(String roleName);

    public Integer updateUserById(@Param("nickname")String nickname,
                                  @Param("sex")Integer sex,
                                  @Param("password")String password,
                                  @Param("id")Integer id);
}
