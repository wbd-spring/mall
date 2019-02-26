package com.wbd.mall.storemgr.dao;

import org.springframework.stereotype.Repository;

import com.wbd.mall.common.dao.BaseDAO;
import com.wbd.mall.storemgr.vo.StoreModel;
import com.wbd.mall.storemgr.vo.StoreQueryModel;

@Repository
public interface StoreDAO extends BaseDAO<StoreModel,StoreQueryModel>{
	public StoreModel getByGoodsUuid(int goodsUuid);
}
