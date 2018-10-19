package com.iot.market.rpc.interfaces;

import com.iot.market.rpc.interfaces.bean.RpcCommandResult;

/**
 * Created by dawei on 2018/5/15.
 */
public interface RpcSerial485Service {

    /**
     * dubbo控制网关接口
     * @param marketId   门店ID
     * @param commandType  固定字符串: SwitchControlRequest/TextControlRequest
     * @param addr  地址
     * @param value  取值: ON/OFF/语音播报内容
     * @param from  取值: SCHEDULE/WEB
     * @return
     */
    RpcCommandResult serial485Control(String marketId, String commandType, String addr, String value, String from);

    RpcCommandResult serialSceneControl(String marketId, String type, String value, String from);
}
