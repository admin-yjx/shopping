package org.sang.service;

import org.sang.dao.UserMapper;
import org.sang.pojo.User;
import org.sang.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public RespBean login(String username, String password){
        User user=userMapper.login(username, password);
        if(user!=null){
            return RespBean.ok("登录成功！",200);
        }else{
            return RespBean.error("登录失败！",500);
        }
    }
}
