package com.project.springboot_mybatis_druid.model;

import java.util.Date;

public class Report {
    private Integer id;

    private String clusterId;

    private String minerId;

    private Integer winpost;

    private String slzs;

    private String overview;

    private String lucky;

    private String blockLost;

    private Integer cochainSuccess;

    private Integer winnipostWin;

    private String yxsl;

    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId == null ? null : clusterId.trim();
    }

    public String getMinerId() {
        return minerId;
    }

    public void setMinerId(String minerId) {
        this.minerId = minerId == null ? null : minerId.trim();
    }

    public Integer getWinpost() {
        return winpost;
    }

    public void setWinpost(Integer winpost) {
        this.winpost = winpost;
    }

    public String getSlzs() {
        return slzs;
    }

    public void setSlzs(String slzs) {
        this.slzs = slzs == null ? null : slzs.trim();
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    public String getLucky() {
        return lucky;
    }

    public void setLucky(String lucky) {
        this.lucky = lucky == null ? null : lucky.trim();
    }

    public String getBlockLost() {
        return blockLost;
    }

    public void setBlockLost(String blockLost) {
        this.blockLost = blockLost == null ? null : blockLost.trim();
    }

    public Integer getCochainSuccess() {
        return cochainSuccess;
    }

    public void setCochainSuccess(Integer cochainSuccess) {
        this.cochainSuccess = cochainSuccess;
    }

    public Integer getWinnipostWin() {
        return winnipostWin;
    }

    public void setWinnipostWin(Integer winnipostWin) {
        this.winnipostWin = winnipostWin;
    }

    public String getYxsl() {
        return yxsl;
    }

    public void setYxsl(String yxsl) {
        this.yxsl = yxsl == null ? null : yxsl.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}