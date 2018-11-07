package com.iot.market.rpc.interfaces.service;



import com.iot.market.rpc.interfaces.po.User;
import com.iot.market.rpc.interfaces.util.ResMsg;
import com.iot.market.rpc.interfaces.vo.CustomerVo;

import java.text.ParseException;
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


    /**
     * 顾客人数
     * @param storeCode
     * @return
     */
    ResMsg<List<CustomerVo>> querypeople(String storeCode) throws ParseException;



}
