package com.new_tx.mi.Controller.login;


import com.new_tx.mi.Bo.login.LoginBoImpl;
import com.new_tx.mi.entity.User;

import com.new_tx.mi.pojo.Activity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginBoImpl loginBo;

    /****
     * @Author 刘俊楠
     * @Description //TODO  登录验证
     * @Date 15:26 2020/5/19
     * @Param []
     * @return java.lang.String
     **/
    @PostMapping("/check")
    @ResponseBody
    public Activity loginCheck(User user) {

        Activity activity = new Activity();

        try {
            User iuser = loginBo.finduser(user);
            if (StringUtils.isNotBlank(iuser.getId())) {
                if ("0".equals(iuser.getUserIsdel())) {
                    if ("0".equals(iuser.getUserState())) {
                        if(iuser.getUserLoginPassword().equals(user.getUserLoginPassword())){
                            activity.setData(iuser);
                            activity.setState("0");
                        }else {
                            activity.setMsg("密码错误");
                            activity.setState("1");
                        }

                    } else {
                        activity.setMsg("该账号处于封禁状态请与管理员联系");
                        activity.setState("1");
                    }
                } else {
                    activity.setMsg("该账号不存在");
                    activity.setState("1");
                }
            }else {
                activity.setMsg("该账号不存在");
                activity.setState("1");
            }
        } catch (Exception e) {
            activity.setMsg("该账号不存在");
            activity.setState("1");
            System.out.println(e);
        }


        return activity;
    }
}
