package com.wbd.mall.goodsmgr.dao;

import org.springframework.stereotype.Repository;

import com.wbd.mall.common.dao.BaseDAO;
import com.wbd.mall.common.pageutil.Page;
import com.wbd.mall.goodsmgr.vo.GoodsModel;
import com.wbd.mall.goodsmgr.vo.GoodsQueryModel;

//@Repository
public interface GoodsDAO extends BaseDAO<GoodsModel,GoodsQueryModel>{
	public Page<GoodsModel> getByCondition(GoodsQueryModel gqm);
}
