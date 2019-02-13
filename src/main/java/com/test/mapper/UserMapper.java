package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2017/3/26.
 */
public interface UserMapper {

    List<User> getUserList();

    User getUserById(@Param("userId") int userId);

    void updateUserEmailById(@Param("userId") String userId, @Param("sex") String sex);

    void deleteUserById(@Param("userId") String userId);

    void insertUser(User user);
}
