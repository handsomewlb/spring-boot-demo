package com.wlb.springbootssm.dao;

import com.wlb.springbootssm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>Description: </p>
 *
 * @author wlb
 * @version 1.0
 * Company:Mopon
 * @name IUserDao
 * @date 2019/8/15 14:50
 */
@Mapper
public interface IUserDao {

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
    Integer addUser(@Param("user") User user);

    /**
     * 通过id修改User
     * @param user
     * @return
     */
    Integer updateUserById(@Param("user") User user);

    /**
     * 根据id删除User
     */
    void deleteUserById(Long id);
}
