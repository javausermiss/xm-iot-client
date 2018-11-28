package com.iot.market.rpc.interfaces.service;


import com.iot.market.rpc.interfaces.po.ParamConfig;
import com.iot.market.rpc.interfaces.util.ResMsg;

import java.util.List;

/**
 * Created by lvsheng on 2018/11/28.
 */
public interface StoreParamService {

    /**
     * 获取门店参数
     * @return
     */
    List<ParamConfig> queyrparam(ParamConfig param) throws Exception;


    /**
     * 修改参数
     * @return
     */
    ResMsg<String> upparam(ParamConfig param) throws Exception;


}