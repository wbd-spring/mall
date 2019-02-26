package com.wbd.mall.goodsmgr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wbd.mall.common.service.BaseService;
import com.wbd.mall.goodsmgr.dao.GoodsMapperDAO;
import com.wbd.mall.goodsmgr.vo.GoodsModel;
import com.wbd.mall.goodsmgr.vo.GoodsQueryModel;

@Service
@Transactional
public class GoodsService extends BaseService<GoodsModel,GoodsQueryModel> implements IGoodsService{
	
	private GoodsMapperDAO dao = null;
	
	@Autowired
	private void setDao(GoodsMapperDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	
}