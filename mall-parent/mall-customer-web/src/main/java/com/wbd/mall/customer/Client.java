package com.wbd.mall.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.wbd.mall.common.pageutil.Page;
import com.wbd.mall.customer.service.ICustomerService;
import com.wbd.mall.customer.vo.CustomerModel;
import com.wbd.mall.customer.vo.CustomerQueryModel;

@Service
public class Client {
	
	@Autowired
	private ICustomerService s; 
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Client t = (Client)ctx.getBean("client");
		
		CustomerModel cm = new CustomerModel();
		cm.setCustomerId("c1");
		cm.setPwd("c1");
		cm.setRegisterTime("111");
		cm.setShowName("c1");
		cm.setTrueName("张三");

		t.s.create(cm);
		
		//
		CustomerQueryModel cqm = new CustomerQueryModel();
		cqm.getPage().setNowPage(1);
		cqm.getPage().setPageShow(7);
		Page<CustomerModel> p = t.s.getByConditionPage(cqm);
		
		
		System.out.println("p1===="+p);
		
		
		Page<CustomerModel> p2 = t.s.getByConditionPage(cqm);
		
		System.out.println("p2===="+p2);
		
		
		
		
	}
}
