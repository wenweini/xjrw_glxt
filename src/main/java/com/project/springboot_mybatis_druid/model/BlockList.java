package com.project.springboot_mybatis_druid.model;

import java.math.BigDecimal;
import java.util.Date;

public class BlockList {
    private String blockId;

    private Integer blockHeight;

    private BigDecimal reward;

    private Date datetime;

    private Integer messageNum;

    private String minerNo;

    private Integer blockSize;

    private Date updatetime;

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId == null ? null : blockId.trim();
    }

    public Integer getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(Integer blockHeight) {
        this.blockHeight = blockHeight;
    }

    public BigDecimal getReward() {
        return reward;
    }

    public void setReward(BigDecimal reward) {
        this.reward = reward;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getMessageNum() {
        return messageNum;
    }

    public void setMessageNum(Integer messageNum) {
        this.messageNum = messageNum;
    }

    public String getMinerNo() {
        return minerNo;
    }

    public void setMinerNo(String minerNo) {
        this.minerNo = minerNo == null ? null : minerNo.trim();
    }

    public Integer getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}