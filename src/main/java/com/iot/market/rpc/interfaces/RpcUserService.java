package com.iot.market.rpc.interfaces;

import com.iot.market.rpc.interfaces.bean.RpcCommandResult;

public interface RpcUserService {

    RpcCommandResult checkGatewaySession(String sessionId);

    RpcCommandResult checkUserSession(String sessionId);
}
