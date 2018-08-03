package com.iot.market.rpc.interfaces.bean;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@Data
public class MarketInfo implements Serializable {

	/***
	 * 门店ID
	 */
	private String id;

	/***
	 * 门店名称
	 */
	private String name;

	/***
	 * 门店地址
	 */
	private String addr;
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
