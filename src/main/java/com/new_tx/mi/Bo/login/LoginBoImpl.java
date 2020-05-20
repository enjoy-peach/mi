package com.new_tx.mi.Bo.login;

import com.new_tx.mi.Dao.login.LoginDao;
import com.new_tx.mi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginBoImpl implements LoginBo {

    @Autowired
    LoginDao loginDao;

    @Override
    public User finduser(User user) {
        return loginDao.finduser(user);
    }
}
