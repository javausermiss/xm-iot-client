package com.iot.market.rpc.interfaces;


import com.iot.market.rpc.interfaces.bean.GatewayInfo;
import com.iot.market.rpc.interfaces.bean.MarketInfo;
import com.iot.market.rpc.interfaces.bean.RpcCommandResult;

public interface RpcBindService {

    RpcCommandResult bindgateway(GatewayInfo gatewayInfo, MarketInfo marketInfo);

    RpcCommandResult unBindgateway(String gatewayId, String marketId);
}
