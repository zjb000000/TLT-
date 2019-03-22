package com.gg.tlt.controller;

import com.gg.tlt.model.User;
import com.gg.tlt.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RestController("/")//等价于@responseBody
public class TestController {

    @Autowired
    UserInfoService userInfoService;

//    @RequestMapping("/index")
//    public String index(Model mo del) {
//        List<User> users = userInfoService.queryAllUsers();
//        model.addAttribute("user_list", users);
//        return "/index";
//    }
//
//    @RequestMapping("/addUser")
//    @ResponseBody
//    public Integer addUser(@RequestParam("nickname") String nickename,
//                           @RequestParam("id") String id,
//                           @RequestParam("sex") String sex,
//                           @RequestParam("age") String age) {
//        User user = new User(nickename, Integer.parseInt(sex), Integer.parseInt(age), id);
//        try {
//            int result = testService.addUser(user);
//            if (result == 0)
//                return 0;
//            else if (result > 0)
//                return result;
//            else
//                return -1;
//        } catch (Exception e) {
//            return -1;
//        }
//
//    }
//    @RequestMapping("/addUser")
//    @ResponseBody
//    public Integer addUser(String nickname, String password, String sex, String password_again) {
//
//        if(nickname.equals("")||password.equals("")||sex.equals("")||password_again.equals("")){
//            return 3;
//        }
//        int result = 123456;
//        try {
//            if(userInfoService.isUserExist(nickname)!=null){
//                return 2;
//            }
//            if(!password.equals(password_again))
//            {
//                return 4;
//            }
//            result = userInfoService.addUser(new User(nickname, password,Boolean.parseBoolean(sex),false));
//        } catch (Exception e) {
//            e.printStackTrace();
//            result = -1;
//        }
//
//        return result;
//    }

//    @RequestMapping("/deleteUserById")
//    @ResponseBody
//    public Integer deleteUserById(@RequestParam("id") String id) {
//        System.out.println(id);
//        try {
//            int result = testService.removeById(id);
//            System.out.println(result);
//            if (result >= 0)
//                return result;
//            else
//                return -2;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return -1;
//        }
//    }
//
//    @RequestMapping("/updateUserMsg")
//    @ResponseBody
//    public Integer updateUserMsg(@RequestParam("username") String username,
//                                 @RequestParam("sex") String sex,
//                                 @RequestParam("age") String age,
//                                 @RequestParam("id") String id) {
//
//        System.out.println("编号为"+id+"请求用户信息变更");
//
//        try{
//            int result = testService.modifyUser(username,Integer.parseInt(age),id,Integer.parseInt(sex));
//            if(result>=0) {
//                System.out.println("变更成功");
//                return result;
//            }
//            else
//                return -2;
//        }catch (Exception e){
//            e.printStackTrace();
//            return -2;
//        }
//    }
//
//    @RequestMapping("/user/{id}")
//    @ResponseBody
//    public String selectUserNameById(@PathVariable(value = "id") String id) {
//
//        return testService.selectUserNameById(id);
//    }
//

}
