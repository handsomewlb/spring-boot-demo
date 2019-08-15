package com.wlb.springbootssm.service.impl;

import com.wlb.springbootssm.config.LogConfig;
import com.wlb.springbootssm.dao.IUserDao;
import com.wlb.springbootssm.entity.User;
import com.wlb.springbootssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author 王林博
 * @version 1.0
 * Company:Mopon
 * @name UserServiceImpl
 * @date 2019/8/15 15:11
 */
@Service
public class UserServiceImpl extends LogConfig implements IUserService {
    
    @Autowired
    private IUserDao userDao;
    
    @Override
    public List<User> getUserList() {
        logger.debug("Process in UserServiceImpl.getUserList method");
        return userDao.getUserList() == null ? new ArrayList<User>() : userDao.getUserList();
    }

    @Override
    public User getUserById(Long id) {
        logger.debug("Process in UserServiceImpl.getUserById method param.id : {}", id);
        return userDao.getUserById(id);
    }

    @Override
    public Integer addUser(User user) {
        logger.debug("Process in UserServiceImpl.addUser method param.user.toString() : {}", user.toString());
        return userDao.addUser(user);
    }

    @Override
    public Integer updateUserById(User user) {
        logger.debug("Process in UserServiceImpl.updateUserById method param.user.toString() : {}", user.toString());
        return userDao.updateUserById(user);
    }

    @Override
    public void deleteUserById(Long id) {
        logger.debug("Process in UserServiceImpl.deleteUserById method param.id : {}", id);
        userDao.deleteUserById(id);
    }
}
