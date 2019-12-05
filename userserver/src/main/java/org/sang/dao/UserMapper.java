package org.sang.dao;

import org.sang.pojo.User;

import java.util.List;

public interface UserMapper {
    User login(String username,String password);
}
