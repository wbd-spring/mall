package com.wbd.mall.storemgr.service;


import com.wbd.mall.common.service.IBaseService;
import com.wbd.mall.storemgr.vo.StoreModel;
import com.wbd.mall.storemgr.vo.StoreQueryModel;

public interface IStoreService extends IBaseService<StoreModel,StoreQueryModel>{
	public StoreModel getByGoodsUuid(int goodsUuid);
}

