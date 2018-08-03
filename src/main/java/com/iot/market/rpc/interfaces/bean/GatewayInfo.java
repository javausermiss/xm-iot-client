package com.iot.market.rpc.interfaces.bean;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@Data
public class GatewayInfo implements Serializable {

	/***
	 * 网关ID
	 */
	private String id;

	/***
	 * 网关名称
	 */
	private String name;

	/***
	 * 网关MAC地址
	 */
	private String macAddr;
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
