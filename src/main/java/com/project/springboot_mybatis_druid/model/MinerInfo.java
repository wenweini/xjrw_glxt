package com.project.springboot_mybatis_druid.model;

public class MinerInfo {
    private String clusterId;

    private String minerNum;

    private String minerName;

    private String sykh;

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId == null ? null : clusterId.trim();
    }

    public String getMinerNum() {
        return minerNum;
    }

    public void setMinerNum(String minerNum) {
        this.minerNum = minerNum == null ? null : minerNum.trim();
    }

    public String getMinerName() {
        return minerName;
    }

    public void setMinerName(String minerName) {
        this.minerName = minerName == null ? null : minerName.trim();
    }

    public String getSykh() {
        return sykh;
    }

    public void setSykh(String sykh) {
        this.sykh = sykh == null ? null : sykh.trim();
    }
}