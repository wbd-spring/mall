package com.wbd.mall.ordermgr.dao;

import org.springframework.stereotype.Repository;

import com.wbd.mall.common.dao.BaseDAO;
import com.wbd.mall.ordermgr.vo.OrderModel;
import com.wbd.mall.ordermgr.vo.OrderQueryModel;

@Repository
public interface OrderDAO extends BaseDAO<OrderModel,OrderQueryModel>{
	
}
