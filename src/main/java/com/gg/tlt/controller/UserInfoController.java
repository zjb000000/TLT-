package com.gg.tlt.controller;

import com.gg.tlt.mapper.RoleMapper;
import com.gg.tlt.mapper.UserInfoMapper;
import com.gg.tlt.model.Role;
import com.gg.tlt.model.User;
import com.gg.tlt.service.RoleService;
import com.gg.tlt.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;
//
//    @Autowired
//    RoleService roleService;

    @Resource
    UserInfoMapper userInfoMapper;


    @RequestMapping("/index")
    public String index(Model model) {
        return "/index";
    }

    @RequestMapping("/jumpToIndex")
    public ModelAndView jumpToIndex() {
        ModelAndView modelAndView = new ModelAndView();

        List<User> users = userInfoService.queryAllUsers();
        modelAndView.addObject("users", users);
        modelAndView.setViewName("index1");
        return modelAndView;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public Integer addUser(@RequestParam("nickname") String nickname,
                           @RequestParam("password") String password,
                           @RequestParam("sex") String sex)
                            {
        int result = 123456;
        try {
            if (userInfoService.isUserExist(nickname) != null) {
                return 2;
            }
            result = userInfoService.addUser(new User(nickname, password, Boolean.parseBoolean(sex),null,null));
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }

        return result;
    }

    @RequestMapping("/updateUserById")
    @ResponseBody
    public Integer updateUserById(@RequestParam("nickname") String nickname,
                                 @RequestParam("sex") String sex,
                                 @RequestParam("password") String password,
                                 @RequestParam("id") String id,
                                  HttpServletRequest request) {


        System.out.println("编号为"+id+"请求用户信息变更");

        try{
            int result = userInfoService.updateUserById(nickname,Integer.parseInt(sex),password,Integer.parseInt(id));
            if(result>=0) {
                User user = userInfoMapper.selectUserPassword(nickname);
                request.getSession().setAttribute("user",user);
                System.out.println("变更成功");
                return result;
            }
            else
                return -2;
        }catch (Exception e){
            e.printStackTrace();
            return -2;
        }
    }

    @RequestMapping("/loginUserById")
    @ResponseBody
    public Integer loginUserById(@RequestParam("nickname") String nickname,
                                 @RequestParam("password") String password,
                                 HttpServletRequest request) throws IOException {
        User user;
        System.out.println(nickname+":请求登陆");

        try {
            System.out.println("验证身份");
            user = userInfoMapper.selectUserPassword(nickname);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        //System.out.println(user.getPassword()+" "+password);
        if (user.getPassword().equals(password)) {
            request.getSession().setAttribute("user",user);
            Role role = userInfoMapper.selectRoleFunc(user.getRoleName());
            request.getSession().setAttribute("role",role);

            return 1;
        } else
            return 0;
    }

    @RequestMapping("/pageHome")
    public String pageHome() {
        return "homePage";
    }

    @RequestMapping("/editUserInfo")
    public ModelAndView editUserInfo(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editUserInfo");
        return modelAndView;
    }
}