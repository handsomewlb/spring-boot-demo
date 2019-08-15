package com.wlb.springbootssm.service;

import com.wlb.springbootssm.entity.User;

import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author wlb
 * @version 1.0
 * Company:Mopon
 * @name IUserService
 * @date 2019/8/15 15:09
 */
public interface IUserService {

    /**
     * 查询User列表
     * @return
     */
    List<User> getUserList();

    /**
     * 根据id查找User
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 增加User
     * @param user
     * @return
     */
    Integer addUser(User user);

    /**
     * 通过id修改User
     * @param user
     * @return
     */
    Integer updateUserById(User user);

    /**
     * 根据id删除User
     */
    void deleteUserById(Long id);
}
