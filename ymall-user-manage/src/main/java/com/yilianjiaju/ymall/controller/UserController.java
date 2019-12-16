package com.yilianjiaju.ymall.controller;

import com.yilianjiaju.ymall.bean.UserInfo;
import com.yilianjiaju.ymall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController class
 *
 * @author gwz
 * @date 2019/12/16
 */
@RestController
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/users")
    public ResponseEntity<List<UserInfo>> getUserList(UserInfo userInfo){
        List<UserInfo> userInfoList = userInfoService.getUserInfoList(userInfo);
        return ResponseEntity.ok().body(userInfoList);
    }


    @RequestMapping(value = "/user" ,method = RequestMethod.POST)
    public ResponseEntity<Void> add(UserInfo userInfo){ ;

        userInfoService.addUserInfo(userInfo);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/user" ,method = RequestMethod.PUT)
    public    ResponseEntity<Void> update(UserInfo userInfo){
        userInfoService.updateUserInfo(userInfo);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/user" ,method = RequestMethod.DELETE)
    public    ResponseEntity<Void> delete(UserInfo userInfo){
        userInfoService.delete(userInfo);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/user" ,method = RequestMethod.GET)
    public ResponseEntity<UserInfo> getUserInfo(UserInfo userInfoQuery){
        UserInfo userInfo = userInfoService.getUserInfo(userInfoQuery);
        return ResponseEntity.ok().body(userInfo);
    }
}
