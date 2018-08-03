package com.iot.market.rpc.interfaces.rpcweb;


import com.iot.market.rpc.interfaces.bean.RpcCommandResult;

public interface RpcEquipmentService {

    /**
     * 门店设施状态
     * @param addr   地址
     * @param status  状态码
     * @param gatewaiId  网关ID
     * @return
     */
    RpcCommandResult addequmsg(String addr, String status,String gatewaiId);


}
