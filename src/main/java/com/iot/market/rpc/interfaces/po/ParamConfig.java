package com.iot.market.rpc.interfaces.po;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 */
@Table(name = "param_config")
public class ParamConfig implements Serializable{

    private static final long serialVersionUID = 5884953452469224288L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "facility_code")
    private String facilityCode;

    private String name;

    private Integer type;

    @Column(name = "store_code")
    private String storeCode;

    private String des;

    private String creator;

    private String updator;

    private String created;

    private String updated;

    private Integer yn;

    private Integer sms;

    private String kw;

    @Column(name = "facility_url")
    private String facilityUrl;

    private Integer sort;

    @Transient
    private String orderString;

    @Transient
    private String storeName;//门店名称

    @Transient
    private String equCode;//设备编码

    @Transient
    private String startTime;//开始时间

    @Transient
    private String endTime;//结束时间

    @Transient
    private String centigrade;//摄氏度

    public String getFacilityUrl() {
        return facilityUrl;
    }

    public void setFacilityUrl(String facilityUrl) {
        this.facilityUrl = facilityUrl;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getOrderString() {
        return orderString;
    }

    public void setOrderString(String orderString) {
        this.orderString = orderString;
    }

    public String getCentigrade() {
        return centigrade;
    }

    public void setCentigrade(String centigrade) {
        this.centigrade = centigrade;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getKw() {
        return kw;
    }

    public void setKw(String kw) {
        this.kw = kw;
    }

    public Integer getSms() {
        return sms;
    }

    public void setSms(Integer sms) {
        this.sms = sms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getEquCode() {
        return equCode;
    }

    public void setEquCode(String equCode) {
        this.equCode = equCode;
    }
}