package com.project.springboot_mybatis_druid.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class MinerInfoView {
	private String minerNo;
	private String yxslP;
	private String yxslT;
	private String kyye;
	private String slzl;
	private String sqdy;
	private String wksc;
	private String workerBalance;
	private int allSectors;
	private int availableSectors;
	private int errorSectors;
	private String balance;
	private String totalRewards;
	private String preCommitDeposits;
	private String controlBalance;
	private Timestamp inserttime;
	public String getMinerNo() {
		return minerNo;
	}
	public void setMinerNo(String minerNo) {
		this.minerNo = minerNo;
	}
	public String getYxslP() {
		return yxslP;
	}
	public void setYxslP(String yxslP) {
		this.yxslP = yxslP;
	}
	public String getYxslT() {
		return yxslT;
	}
	public void setYxslT(String yxslT) {
		this.yxslT = yxslT;
	}
	public String getKyye() {
		return kyye;
	}
	public void setKyye(String kyye) {
		this.kyye = kyye;
	}
	public String getSlzl() {
		return slzl;
	}
	public void setSlzl(String slzl) {
		this.slzl = slzl;
	}
	public String getSqdy() {
		return sqdy;
	}
	public void setSqdy(String sqdy) {
		this.sqdy = sqdy;
	}
	public String getWksc() {
		return wksc;
	}
	public void setWksc(String wksc) {
		this.wksc = wksc;
	}
	public String getWorkerBalance() {
		return workerBalance;
	}
	public void setWorkerBalance(String workerBalance) {
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
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getTotalRewards() {
		return totalRewards;
	}
	public void setTotalRewards(String totalRewards) {
		this.totalRewards = totalRewards;
	}
	public String getPreCommitDeposits() {
		return preCommitDeposits;
	}
	public void setPreCommitDeposits(String preCommitDeposits) {
		this.preCommitDeposits = preCommitDeposits;
	}
	public String getControlBalance() {
		return controlBalance;
	}
	public void setControlBalance(String controlBalance) {
		this.controlBalance = controlBalance;
	}
	public Timestamp getInserttime() {
		return inserttime;
	}
	public void setInserttime(Timestamp inserttime) {
		this.inserttime = inserttime;
	}
}
