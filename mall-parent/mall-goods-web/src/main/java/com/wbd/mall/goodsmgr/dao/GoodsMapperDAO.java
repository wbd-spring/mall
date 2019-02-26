package com.wbd.mall.goodsmgr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wbd.mall.goodsmgr.vo.GoodsModel;
import com.wbd.mall.goodsmgr.vo.GoodsQueryModel;

@Repository
public interface GoodsMapperDAO extends GoodsDAO{
	public List<Integer> getIdsByConditionPage(GoodsQueryModel gqm);
	public List<GoodsModel> getByIds(String ids);
}
