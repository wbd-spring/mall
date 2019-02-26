package com.wbd.mall.customer.service;

import com.wbd.mall.common.service.IBaseService;
import com.wbd.mall.customer.vo.CustomerModel;
import com.wbd.mall.customer.vo.CustomerQueryModel;

public interface ICustomerService extends IBaseService<CustomerModel, CustomerQueryModel>{
	public CustomerModel getByCustomerId(String customerId);
}
