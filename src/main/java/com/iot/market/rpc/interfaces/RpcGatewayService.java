package com.iot.market.rpc.interfaces;

import com.iot.market.rpc.interfaces.bean.RpcCommandResult;

public interface RpcGatewayService {

    RpcCommandResult gatewayUpdate(String sessionId, String oldVersion, String currentVersion);
}
