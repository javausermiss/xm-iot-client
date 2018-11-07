package com.iot.market.rpc.interfaces.service;



import com.iot.market.rpc.interfaces.po.User;

import java.util.List;

/**
 * Created by lvsheng on 2018/11/7.
 */
public interface UserLoginService {

    /**
     * 通过手机号查询用户信息
     * @param user
     * @return
     * @throws Exception
     */
    User queryUserByMobile(User user) throws Exception;



}
