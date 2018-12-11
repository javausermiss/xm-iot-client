package com.iot.market.rpc.interfaces.service;


import com.iot.market.rpc.interfaces.bean.Instant;
import com.iot.market.rpc.interfaces.util.ResMsg;

import java.util.List;

/**
 * Created by lvsheng on 2018/12/11.
 */
public interface InstantService {

    /**
     * 获取速食列表
     * @return
     */
    List<Instant> queyrinstant(Instant param) throws Exception;


    /**
     * 修改冷藏参数
     * @return
     */
    ResMsg<String> upinstant(Instant param) throws Exception;


}