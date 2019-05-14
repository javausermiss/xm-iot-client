package com.iot.market.rpc.interfaces.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * APP图片业务
 */
@Table(name = "app_image")
public class AppImage implements Serializable{

    private static final long serialVersionUID = 5884953452469224288L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "facility_code")
    private String facilityCode;

    private String name;

    @Column(name = "up_level_code")
    private String upLevelCode;

    private Integer level;

    private String code;

    private String url;

    private String creator;

    private String updator;

    private String created;

    private String updated;

    private Integer yn;

    private String kwh;

    private String storeCode;

    private String power;

    private String tempSet;

    private String tempNow;

    private String stateWork;

    private String swichValue;

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getKwh() {
        return kwh;
    }

    public void setKwh(String kwh) {
        this.kwh = kwh;
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

    public String getUpLevelCode() {
        return upLevelCode;
    }

    public void setUpLevelCode(String upLevelCode) {
        this.upLevelCode = upLevelCode;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getTempSet() {
        return tempSet;
    }

    public void setTempSet(String tempSet) {
        this.tempSet = tempSet;
    }

    public String getTempNow() {
        return tempNow;
    }

    public void setTempNow(String tempNow) {
        this.tempNow = tempNow;
    }

    public String getStateWork() {
        return stateWork;
    }

    public void setStateWork(String stateWork) {
        this.stateWork = stateWork;
    }

    public String getSwichValue() {
        return swichValue;
    }

    public void setSwichValue(String swichValue) {
        this.swichValue = swichValue;
    }
}