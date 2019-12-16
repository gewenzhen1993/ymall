package com.yilianjiaju.ymall.service.impl;

import com.yilianjiaju.ymall.bean.UserInfo;
import com.yilianjiaju.ymall.mapper.UserInfoMapper;
import com.yilianjiaju.ymall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserInfoServiceImpl class
 *
 * @author gwz
 * @date 2019/12/16
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserInfoList(UserInfo userInfoQuery) {
        return userInfoMapper.selectAll();
    }

    public UserInfo getUserInfo(UserInfo userInfoQuery) {
        return userInfoMapper.selectOne(userInfoQuery);
    }

    public void delete(UserInfo userInfoQuery) {
        userInfoMapper.delete(userInfoQuery);
    }

    public void addUserInfo(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    public void updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }
}
