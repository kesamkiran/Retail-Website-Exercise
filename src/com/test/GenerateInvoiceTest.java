package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.inkitjobs.exercise.bean.User;
import com.inkitjobs.exercise.controller.GenerateInvoice;

public class GenerateInvoiceTest {
	GenerateInvoice genInvoice = new GenerateInvoice();
	@Test
	public void testUserEmployee(){
		try {
			User user = new User();
			user.setGroceriesBillAmount(100.12);
			user.setName("ABC");
			user.setTotalBillAmountBeforeDisc(245.34);
			user.setUserType("employee");
			Date dt = null;
			String userAddedDt = "2015-03-31";
			DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
			dt = dateFormatter.parse(userAddedDt);
			user.setUserAddedDt(dt);
			double actual = 32.19;
			Assert.assertEquals(actual, genInvoice.generateInvoiceBill(user).getDiscountAmount(), 0.001);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUserAffiliate(){
		try {
			User user = new User();
			user.setGroceriesBillAmount(100.12);
			user.setName("DEF");
			user.setTotalBillAmountBeforeDisc(245.34);
			user.setUserType("affiliate");
			Date dt = null;
			String userAddedDt = "2015-03-31";
			DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
			dt = dateFormatter.parse(userAddedDt);
			user.setUserAddedDt(dt);
			double actual = 24.79;
			Assert.assertEquals(actual, genInvoice.generateInvoiceBill(user).getDiscountAmount(), 0.001);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUserOverTwoYears(){
		try {
			User user = new User();
			user.setGroceriesBillAmount(100.12);
			user.setName("ABC");
			user.setTotalBillAmountBeforeDisc(245.34);
			user.setUserType("");
			Date dt = null;
			String userAddedDt = "2015-03-31";
			DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
			dt = dateFormatter.parse(userAddedDt);
			user.setUserAddedDt(dt);
			double actual = 13.7;
			Assert.assertEquals(actual, genInvoice.generateInvoiceBill(user).getDiscountAmount(), 0.001);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
