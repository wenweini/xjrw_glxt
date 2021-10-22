package com.project.springboot_mybatis_druid.model;

import java.util.Date;

public class Wini {
    private Integer id;

    private String clusterId;

    private String blockId;

    private String cochain;

    private String minerId;

    private String overview;

    private String cochainTime;

    private Date blockTime;

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

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId == null ? null : blockId.trim();
    }

    public String getCochain() {
        return cochain;
    }

    public void setCochain(String cochain) {
        this.cochain = cochain == null ? null : cochain.trim();
    }

    public String getMinerId() {
        return minerId;
    }

    public void setMinerId(String minerId) {
        this.minerId = minerId == null ? null : minerId.trim();
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    public String getCochainTime() {
        return cochainTime;
    }

    public void setCochainTime(String cochainTime) {
        this.cochainTime = cochainTime == null ? null : cochainTime.trim();
    }

    public Date getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Date blockTime) {
        this.blockTime = blockTime;
    }
}