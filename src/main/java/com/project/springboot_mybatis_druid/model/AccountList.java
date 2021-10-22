package com.project.springboot_mybatis_druid.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccountList {
    private String id;

    private String messageId;

    private Date datetime;

    private String sendAddr;

    private String receiveMinerNo;

    private BigDecimal filNumber;

    private String messageType;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getSendAddr() {
        return sendAddr;
    }

    public void setSendAddr(String sendAddr) {
        this.sendAddr = sendAddr == null ? null : sendAddr.trim();
    }

    public String getReceiveMinerNo() {
        return receiveMinerNo;
    }

    public void setReceiveMinerNo(String receiveMinerNo) {
        this.receiveMinerNo = receiveMinerNo == null ? null : receiveMinerNo.trim();
    }

    public BigDecimal getFilNumber() {
        return filNumber;
    }

    public void setFilNumber(BigDecimal filNumber) {
        this.filNumber = filNumber;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType == null ? null : messageType.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}