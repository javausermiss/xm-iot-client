package com.iot.market.rpc.interfaces.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 *语音配置
 */
@Table(name = "voice_config")
public class VoiceConfig implements Serializable{

    private static final long serialVersionUID = 5884953452469224288L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "store_code")
    private String storeCode;


    @Column(name = "store_tv_code")
    private String storeTvCode;

    @Column(name = "facility_code_out")
    private String facilityCodeOut;

    @Column(name = "door_out")
    private String doorOut;

    @Column(name = "door_out_user")
    private String doorOutUser;

    @Column(name = "door_out_status")
    private Integer doorOutStatus;

    @Column(name = "door_out_open")
    private String doorOutOpen;

    @Column(name = "door_out_open_user")
    private String doorOutOpenUser;

    @Column(name = "door_out_open_status")
    private Integer doorOutOpenStatus;

    @Column(name = "facility_code_inner")
    private String facilityCodeInner;

    @Column(name = "door_inner_open")
    private String doorInnerOpen;

    @Column(name = "door_inner_open_user")
    private String doorInnerOpenUser;

    @Column(name = "door_inner_open_status")
    private Integer doorInnerOpenStatus;

    private String promotion;

    @Column(name = "promotion_user")
    private String promotionUser;

    @Column(name = "promotion_status")
    private Integer promotionStatus;

    private String creator;

    private String updator;

    private String created;

    private String updated;

    private Integer yn;

    public String getStoreTvCode() {
        return storeTvCode;
    }

    public void setStoreTvCode(String storeTvCode) {
        this.storeTvCode = storeTvCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getFacilityCodeOut() {
        return facilityCodeOut;
    }

    public void setFacilityCodeOut(String facilityCodeOut) {
        this.facilityCodeOut = facilityCodeOut;
    }

    public String getDoorOut() {
        return doorOut;
    }

    public void setDoorOut(String doorOut) {
        this.doorOut = doorOut;
    }

    public String getDoorOutUser() {
        return doorOutUser;
    }

    public void setDoorOutUser(String doorOutUser) {
        this.doorOutUser = doorOutUser;
    }

    public Integer getDoorOutStatus() {
        return doorOutStatus;
    }

    public void setDoorOutStatus(Integer doorOutStatus) {
        this.doorOutStatus = doorOutStatus;
    }

    public String getDoorOutOpen() {
        return doorOutOpen;
    }

    public void setDoorOutOpen(String doorOutOpen) {
        this.doorOutOpen = doorOutOpen;
    }

    public String getDoorOutOpenUser() {
        return doorOutOpenUser;
    }

    public void setDoorOutOpenUser(String doorOutOpenUser) {
        this.doorOutOpenUser = doorOutOpenUser;
    }

    public Integer getDoorOutOpenStatus() {
        return doorOutOpenStatus;
    }

    public void setDoorOutOpenStatus(Integer doorOutOpenStatus) {
        this.doorOutOpenStatus = doorOutOpenStatus;
    }

    public String getFacilityCodeInner() {
        return facilityCodeInner;
    }

    public void setFacilityCodeInner(String facilityCodeInner) {
        this.facilityCodeInner = facilityCodeInner;
    }

    public String getDoorInnerOpen() {
        return doorInnerOpen;
    }

    public void setDoorInnerOpen(String doorInnerOpen) {
        this.doorInnerOpen = doorInnerOpen;
    }

    public String getDoorInnerOpenUser() {
        return doorInnerOpenUser;
    }

    public void setDoorInnerOpenUser(String doorInnerOpenUser) {
        this.doorInnerOpenUser = doorInnerOpenUser;
    }

    public Integer getDoorInnerOpenStatus() {
        return doorInnerOpenStatus;
    }

    public void setDoorInnerOpenStatus(Integer doorInnerOpenStatus) {
        this.doorInnerOpenStatus = doorInnerOpenStatus;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getPromotionUser() {
        return promotionUser;
    }

    public void setPromotionUser(String promotionUser) {
        this.promotionUser = promotionUser;
    }

    public Integer getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(Integer promotionStatus) {
        this.promotionStatus = promotionStatus;
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