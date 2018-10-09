package com.inkitjobs.exercise.bean;

import java.util.Date;

public class User {
	private String name;
	private String userType;
	private double totalBillAmountBeforeDisc;
	private double totalBillAmountAfterDisc;
	private double discountAmount;
	private double groceriesBillAmount;
	private Date userAddedDt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public double getTotalBillAmountBeforeDisc() {
		return totalBillAmountBeforeDisc;
	}
	public void setTotalBillAmountBeforeDisc(double totalBillAmountBeforeDisc) {
		this.totalBillAmountBeforeDisc = totalBillAmountBeforeDisc;
	}
	public double getTotalBillAmountAfterDisc() {
		return totalBillAmountAfterDisc;
	}
	public void setTotalBillAmountAfterDisc(double totalBillAmountAfterDisc) {
		this.totalBillAmountAfterDisc = totalBillAmountAfterDisc;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public double getGroceriesBillAmount() {
		return groceriesBillAmount;
	}
	public void setGroceriesBillAmount(double groceriesBillAmount) {
		this.groceriesBillAmount = groceriesBillAmount;
	}
	public Date getUserAddedDt() {
		return userAddedDt;
	}
	public void setUserAddedDt(Date userAddedDt) {
		this.userAddedDt = userAddedDt;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", userType=" + userType + ", totalBillAmountBeforeDisc="
				+ totalBillAmountBeforeDisc + ", totalBillAmountAfterDisc=" + totalBillAmountAfterDisc
				+ ", discountAmount=" + discountAmount + ", groceriesBillAmount=" + groceriesBillAmount
				+ ", userAddedDt=" + userAddedDt + "]";
	}
}
