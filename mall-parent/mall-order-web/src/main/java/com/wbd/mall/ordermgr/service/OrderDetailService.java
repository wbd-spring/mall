package com.wbd.mall.ordermgr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wbd.mall.common.service.BaseService;
import com.wbd.mall.ordermgr.dao.OrderDetailDAO;
import com.wbd.mall.ordermgr.vo.OrderDetailModel;
import com.wbd.mall.ordermgr.vo.OrderDetailQueryModel;

@Service
@Transactional
public class OrderDetailService extends BaseService<OrderDetailModel,OrderDetailQueryModel> implements IOrderDetailService{
	private OrderDetailDAO dao = null;
	@Autowired
	private void setDao(OrderDetailDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	
}