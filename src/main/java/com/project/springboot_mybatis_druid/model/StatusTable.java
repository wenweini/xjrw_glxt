package com.project.springboot_mybatis_druid.model;

import java.util.Date;

public class StatusTable {
    private Integer id;

    private Date dates;

    private String clusterId;

    private String syncStatus;

    private String free;

    private Integer mpool;

    private Float postb;

    private Integer nvda;

    private String nvdaXh;

    private Integer allround;

    private Integer nowRound;

    private Integer winRound;

    private Integer lostRound;

    private Integer wateRound;

    private Integer status;

    private String startime;

    private String endtime;

    private Date times;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId == null ? null : clusterId.trim();
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus == null ? null : syncStatus.trim();
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free == null ? null : free.trim();
    }

    public Integer getMpool() {
        return mpool;
    }

    public void setMpool(Integer mpool) {
        this.mpool = mpool;
    }

    public Float getPostb() {
        return postb;
    }

    public void setPostb(Float postb) {
        this.postb = postb;
    }

    public Integer getNvda() {
        return nvda;
    }

    public void setNvda(Integer nvda) {
        this.nvda = nvda;
    }

    public String getNvdaXh() {
        return nvdaXh;
    }

    public void setNvdaXh(String nvdaXh) {
        this.nvdaXh = nvdaXh == null ? null : nvdaXh.trim();
    }

    public Integer getAllround() {
        return allround;
    }

    public void setAllround(Integer allround) {
        this.allround = allround;
    }

    public Integer getNowRound() {
        return nowRound;
    }

    public void setNowRound(Integer nowRound) {
        this.nowRound = nowRound;
    }

    public Integer getWinRound() {
        return winRound;
    }

    public void setWinRound(Integer winRound) {
        this.winRound = winRound;
    }

    public Integer getLostRound() {
        return lostRound;
    }

    public void setLostRound(Integer lostRound) {
        this.lostRound = lostRound;
    }

    public Integer getWateRound() {
        return wateRound;
    }

    public void setWateRound(Integer wateRound) {
        this.wateRound = wateRound;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime == null ? null : startime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public Date getTimes() {
        return times;
    }

    public void setTimes(Date times) {
        this.times = times;
    }
}