package com.project.springboot_mybatis_druid.model;

import java.math.BigDecimal;
import java.util.Date;

public class MessageList {
    private String id;

    private Integer height;

    private Date inserttime;

    private String sendAddr;

    private String receiveMinerNo;

    private String method;

    private BigDecimal filNumber;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
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

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public BigDecimal getFilNumber() {
        return filNumber;
    }

    public void setFilNumber(BigDecimal filNumber) {
        this.filNumber = filNumber;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}