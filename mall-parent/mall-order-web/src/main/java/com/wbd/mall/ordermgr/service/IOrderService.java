package com.wbd.mall.ordermgr.service;


import com.wbd.mall.common.service.IBaseService;
import com.wbd.mall.ordermgr.vo.OrderModel;
import com.wbd.mall.ordermgr.vo.OrderQueryModel;

public interface IOrderService extends IBaseService<OrderModel,OrderQueryModel>{
	public void order(int customerUuid);
}

