package com.inkitjobs.exercise.controller;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

import com.inkitjobs.exercise.bean.User;

public class GenerateInvoice {
	private static DecimalFormat df = new DecimalFormat(".##");
	public static User generateInvoiceBill(User userDtls){
		double totalBillAfterDisc = 0.0;
		double totalBill = userDtls.getTotalBillAmountBeforeDisc();
		if(totalBill > 100){
			int remainder = (int)totalBill/100;
			int discountApplicable = remainder * 5;
			userDtls.setDiscountAmount(Double.valueOf(df.format(userDtls.getDiscountAmount() + discountApplicable)));
			totalBillAfterDisc = totalBill - discountApplicable;
			totalBillAfterDisc = Double.valueOf(df.format((totalBillAfterDisc)));
			userDtls.setTotalBillAmountAfterDisc(totalBillAfterDisc);
		}
		double discPercentage = 0.0;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -2);
		Date dateBefore2Years = cal.getTime();
		if(userDtls.getUserType().equalsIgnoreCase("employee")){
			discPercentage = 30.0;
		}else if(userDtls.getUserType().equalsIgnoreCase("affiliate")){
			discPercentage = 20.0;
		}else if(userDtls.getUserAddedDt().before(dateBefore2Years)){
			discPercentage = 5.0;
		}
		if(discPercentage > 0){
			totalBillAfterDisc = totalBillAfterDisc - userDtls.getGroceriesBillAmount();
			double discountApplicable = (double) ((discPercentage * 100)/totalBillAfterDisc);
			userDtls.setDiscountAmount(Double.valueOf(df.format(userDtls.getDiscountAmount() + discountApplicable)));
			totalBillAfterDisc = totalBillAfterDisc + userDtls.getGroceriesBillAmount() - discountApplicable;
			totalBillAfterDisc = Double.valueOf(df.format((totalBillAfterDisc)));
			userDtls.setTotalBillAmountAfterDisc(totalBillAfterDisc);
		}
		return userDtls;
	}
}
