package com.wbd.mall.customer.dao;

import org.springframework.stereotype.Repository;

import com.wbd.mall.common.dao.BaseDAO;
import com.wbd.mall.customer.vo.CustomerModel;
import com.wbd.mall.customer.vo.CustomerQueryModel;
@Repository
public interface CustomerDAO extends BaseDAO<CustomerModel,CustomerQueryModel> {

	public CustomerModel getByCustomerId(String customerId);
}
