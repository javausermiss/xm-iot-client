package com.iot.market.rpc.interfaces.service;



import com.iot.market.rpc.interfaces.bean.Store;
import com.iot.market.rpc.interfaces.bean.StoreUser;

import java.util.List;

/**
 * Created by lvsheng on 2018/5/9.
 */
public interface WebAppUserService {

    /**
     * 用户门店
     * @param param
     * @return
     */
    List<Store> queryStoreByUser(StoreUser param) throws Exception;



}
