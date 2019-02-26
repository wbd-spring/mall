package com.wbd.mall.ordermgr.dao;

import org.springframework.stereotype.Repository;

import com.wbd.mall.common.dao.BaseDAO;
import com.wbd.mall.ordermgr.vo.OrderDetailModel;
import com.wbd.mall.ordermgr.vo.OrderDetailQueryModel;

@Repository
public interface OrderDetailDAO extends BaseDAO<OrderDetailModel,OrderDetailQueryModel>{
	
}
