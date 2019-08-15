package com.wlb.springbootssm.controller;

import com.wlb.springbootssm.config.LogConfig;
import com.wlb.springbootssm.entity.User;
import com.wlb.springbootssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author wlb
 * @version 1.0
 * Company:Mopon
 * @name UserController
 * @date 2019/8/15 15:20
 */
@RestController
@RequestMapping("/user")
public class UserController extends LogConfig {
    
    @Autowired
    private IUserService userService;
    
    @RequestMapping("/findUser")
    public List<User> findUserList() {
        logger.info("Process in UserController.findUser method");
        List<User> userList = userService.getUserList();
        return userList;
    } 
    
    @RequestMapping("/findUserById")
    public User findUserById(Long id) {
        logger.info("Process in UserController.findUserById method param.id: {}", id);
        User user = userService.getUserById(id);
        return user;
    }
    
    @RequestMapping("/addUser")
    public String addUser(User user) {
        logger.info("Process in UserController.addUser method param.user.toString(): {}", user.toString());
        Integer result = userService.addUser(user);
        return result > 0 ? result.toString() : "新增失败";
    }
    
    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        logger.info("Process in UserController.updateUser method param.user.toString() : {}", user.toString());
        Integer result = userService.updateUserById(user);
        return result > 0 ? "修改成功" : "修改失败";
    }
    
    @RequestMapping("/deleteUser")
    public String deleteUser(Long id) {
        logger.info("Process in UserController.deleteUser method param.id: {}", id);
        userService.deleteUserById(id);
        return "success";
    }
}
