package com.onlinemall.pojo;

import java.util.Date;

public class PayInfo {
    private Integer id;

    private Integer userId;

    private Long orderId;

    private Integer payPlatform;

    private String platformNumber;

    private String platformCondition;

    private Date createTime;

    private Date updateTime;

    public PayInfo(Integer id, Integer userId, Long orderId, Integer payPlatform, String platformNumber, String platformCondition, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.orderId = orderId;
        this.payPlatform = payPlatform;
        this.platformNumber = platformNumber;
        this.platformCondition = platformCondition;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public PayInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    public String getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(String platformNumber) {
        this.platformNumber = platformNumber == null ? null : platformNumber.trim();
    }

    public String getPlatformCondition() {
        return platformCondition;
    }

    public void setPlatformCondition(String platformCondition) {
        this.platformCondition = platformCondition == null ? null : platformCondition.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}