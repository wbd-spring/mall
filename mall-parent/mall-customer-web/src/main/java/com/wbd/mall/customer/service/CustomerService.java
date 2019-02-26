package com.wbd.mall.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wbd.mall.common.service.BaseService;
import com.wbd.mall.customer.dao.CustomerDAO;
import com.wbd.mall.customer.vo.CustomerModel;
import com.wbd.mall.customer.vo.CustomerQueryModel;
@Service
@Transactional
public class CustomerService extends BaseService<CustomerModel, CustomerQueryModel> implements ICustomerService{

	private CustomerDAO dao = null;
	@Autowired
	private void setDao(CustomerDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public CustomerModel getByCustomerId(String customerId) {
		return dao.getByCustomerId(customerId);
	}

}
