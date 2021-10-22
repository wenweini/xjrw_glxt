package com.project.springboot_mybatis_druid.model;

import java.math.BigDecimal;
import java.util.Date;

public class NodeInfo {
    private String id;

    private String minerNo;

    private BigDecimal yxsl;

    private BigDecimal zb;

    private BigDecimal availableBalance;

    /**
     * 质押
     */
    private BigDecimal mortgage;

    /**
     * 锁仓
     */
    private BigDecimal vestingFunds;

    
    private BigDecimal workerBalance;

    private Integer totalSectors;

    private Integer availableSectors;

    private Integer errorSectors;

    private Date inserttime;
    
    private BigDecimal balance;
    
    private BigDecimal totalRewards;
    
    private BigDecimal preCommitDeposits;
    
    private BigDecimal controlBalance;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMinerNo() {
        return minerNo;
    }

    public void setMinerNo(String minerNo) {
        this.minerNo = minerNo == null ? null : minerNo.trim();
    }

    public BigDecimal getYxsl() {
        return yxsl;
    }

    public void setYxsl(BigDecimal yxsl) {
        this.yxsl = yxsl;
    }

    public BigDecimal getZb() {
        return zb;
    }

    public void setZb(BigDecimal zb) {
        this.zb = zb;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getMortgage() {
        return mortgage;
    }

    public void setMortgage(BigDecimal mortgage) {
        this.mortgage = mortgage;
    }

    public BigDecimal getVestingFunds() {
        return vestingFunds;
    }

    public void setVestingFunds(BigDecimal vestingFunds) {
        this.vestingFunds = vestingFunds;
    }

    public BigDecimal getWorkerBalance() {
        return workerBalance;
    }

    public void setWorkerBalance(BigDecimal workerBalance) {
        this.workerBalance = workerBalance;
    }

    public Integer getTotalSectors() {
        return totalSectors;
    }

    public void setTotalSectors(Integer totalSectors) {
        this.totalSectors = totalSectors;
    }

    public Integer getAvailableSectors() {
        return availableSectors;
    }

    public void setAvailableSectors(Integer availableSectors) {
        this.availableSectors = availableSectors;
    }

    public Integer getErrorSectors() {
        return errorSectors;
    }

    public void setErrorSectors(Integer errorSectors) {
        this.errorSectors = errorSectors;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getTotalRewards() {
		return totalRewards;
	}

	public void setTotalRewards(BigDecimal totalRewards) {
		this.totalRewards = totalRewards;
	}

	public BigDecimal getPreCommitDeposits() {
		return preCommitDeposits;
	}

	public void setPreCommitDeposits(BigDecimal preCommitDeposits) {
		this.preCommitDeposits = preCommitDeposits;
	}

	public BigDecimal getControlBalance() {
		return controlBalance;
	}

	public void setControlBalance(BigDecimal controlBalance) {
		this.controlBalance = controlBalance;
	}
}