package com.iot.market.rpc.interfaces.service;

import com.iot.market.rpc.interfaces.bean.ContextualModel;
import com.iot.market.rpc.interfaces.util.ResMsg;

import java.text.ParseException;

/**
 * @ClassName ContextualModelService
 * @Description TODO
 * @Author weijunyong
 * @Date 2019/4/1 16:54
 * @Version 1.0
 **/
public interface ContextualModelService {
    /**
     *情景模式--状态查询
     * @param storeCode
     * @return
     * @throws Exception
     */
    ContextualModel  querymodel(String storeCode) throws Exception;

    /**
     * 智能情景模式—控制
     * @param contextualModel
     * @param type
     * @param offon
     * @return
     * @throws Exception
     */
    ResMsg<String> abnormalmodel (ContextualModel contextualModel, Integer type,String offon) throws Exception;

}
