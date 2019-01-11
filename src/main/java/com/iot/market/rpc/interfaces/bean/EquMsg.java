package com.iot.market.rpc.interfaces.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 设备消息
 */
@Table(name = "equ_msg")
public class EquMsg implements Serializable{

    private static final long serialVersionUID = 5884953452469224288L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "facility_code")
    private String facilityCode;

    private String status;

    private Integer type;

    @Column(name = "store_code")
    private String storeCode;

    @Column(name = "equ_id")
    private Integer equId;

    private String creator;

    private String updator;

    private String created;

    private String updated;

    private Integer yn;

    @Transient
    private String storeName;//门店名称

    @Transient
    private String equCode;//设备编码

    @Transient
    private String des;//设备消息状态描述


    @Transient
    private String facilityName;//设施名称


    @Transient
    private String startTime;//开始时间

    @Transient
    private String endTime;//结束时间

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

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Integer getEquId() {
        return equId;
    }

    public void setEquId(Integer equId) {
        this.equId = equId;
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
}