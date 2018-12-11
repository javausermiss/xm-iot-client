package com.iot.market.rpc.interfaces.service;


import com.iot.market.rpc.interfaces.bean.Coldstorage;
import com.iot.market.rpc.interfaces.util.ResMsg;

import java.util.List;

/**
 * Created by lvsheng on 2018/12/11.
 */
public interface ColdstorageService {

    /**
     * 获取冷藏列表
     * @return
     */
    List<Coldstorage> queyrcoldstorage(Coldstorage param) throws Exception;


    /**
     * 修改冷藏参数
     * @return
     */
    ResMsg<String> upcoldstorage(Coldstorage param) throws Exception;


}