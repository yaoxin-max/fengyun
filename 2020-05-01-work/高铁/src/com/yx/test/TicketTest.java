package com.yx.test;

import com.yx.dao.GetInstance;
import com.yx.dao.HSRTicket;



public class TicketTest {

	public static void main(String[] args) {
		HSRTicket ticket1 = GetInstance.getInstanceof("苏州");
		ticket1.run("一等座");
		ticket1.run("二等座");
	}
}
