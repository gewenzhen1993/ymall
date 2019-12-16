package com.yilianjiaju.ymall.service;

import com.yilianjiaju.ymall.bean.UserInfo;

import java.util.List;

/**
 * UserInfoService class
 *
 * @author gwz
 * @date 2019/12/16
 */
public interface UserInfoService {

    public List<UserInfo> getUserInfoList(UserInfo userInfoQuery);

    public UserInfo getUserInfo(UserInfo userInfoQuery);

    public void delete(UserInfo userInfoQuery);

    public void addUserInfo(UserInfo userInfo);

    public void updateUserInfo(UserInfo userInfo);
}
