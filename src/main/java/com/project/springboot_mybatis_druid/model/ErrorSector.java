package com.project.springboot_mybatis_druid.model;

import java.util.Date;

public class ErrorSector {
    private Integer id;

    private String clusterId;

    private Integer sectorNumber;

    private String errorTime;

    private Date times;

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

    public Integer getSectorNumber() {
        return sectorNumber;
    }

    public void setSectorNumber(Integer sectorNumber) {
        this.sectorNumber = sectorNumber;
    }

    public String getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(String errorTime) {
        this.errorTime = errorTime == null ? null : errorTime.trim();
    }

    public Date getTimes() {
        return times;
    }

    public void setTimes(Date times) {
        this.times = times;
    }
}