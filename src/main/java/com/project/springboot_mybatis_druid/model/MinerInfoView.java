package com.project.springboot_mybatis_druid.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class MinerInfoView {
	private String minerNo;
	private BigDecimal yxslP;
	private BigDecimal yxslT;
	private BigDecimal kyye;
	private BigDecimal slzl;
	private BigDecimal sqdy;
	private BigDecimal wksc;
	private BigDecimal workerBalance;
	private int allSectors;
	private int availableSectors;
	private int errorSectors;
	private BigDecimal balance;
	private BigDecimal totalRewards;
	private BigDecimal preCommitDeposits;
	private BigDecimal controlBalance;
	private Timestamp inserttime;
	public String getMinerNo() {
		return minerNo;
	}
	public void setMinerNo(String minerNo) {
		this.minerNo = minerNo;
	}
	public BigDecimal getYxslP() {
		return yxslP;
	}
	public void setYxslP(BigDecimal yxslP) {
		this.yxslP = yxslP;
	}
	public BigDecimal getYxslT() {
		return yxslT;
	}
	public void setYxslT(BigDecimal yxslT) {
		this.yxslT = yxslT;
	}
	public BigDecimal getKyye() {
		return kyye;
	}
	public void setKyye(BigDecimal kyye) {
		this.kyye = kyye;
	}
	public BigDecimal getSlzl() {
		return slzl;
	}
	public void setSlzl(BigDecimal slzl) {
		this.slzl = slzl;
	}
	public BigDecimal getSqdy() {
		return sqdy;
	}
	public void setSqdy(BigDecimal sqdy) {
		this.sqdy = sqdy;
	}
	public BigDecimal getWksc() {
		return wksc;
	}
	public void setWksc(BigDecimal wksc) {
		this.wksc = wksc;
	}
	public BigDecimal getWorkerBalance() {
		return workerBalance;
	}
	public void setWorkerBalance(BigDecimal workerBalance) {
		this.workerBalance = workerBalance;
	}
	public int getAllSectors() {
		return allSectors;
	}
	public void setAllSectors(int allSectors) {
		this.allSectors = allSectors;
	}
	public int getAvailableSectors() {
		return availableSectors;
	}
	public void setAvailableSectors(int availableSectors) {
		this.availableSectors = availableSectors;
	}
	public int getErrorSectors() {
		return errorSectors;
	}
	public void setErrorSectors(int errorSectors) {
		this.errorSectors = errorSectors;
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
	public Timestamp getInserttime() {
		return inserttime;
	}
	public void setInserttime(Timestamp inserttime) {
		this.inserttime = inserttime;
	}
}
