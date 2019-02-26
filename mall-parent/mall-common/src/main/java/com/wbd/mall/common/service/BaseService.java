package com.wbd.mall.common.service;

import java.util.List;

import com.wbd.mall.common.dao.BaseDAO;
import com.wbd.mall.common.pageutil.Page;
import com.wbd.mall.common.vo.BaseModel;

public class BaseService<M, QM extends BaseModel> implements IBaseService<M, QM> {

	private BaseDAO dao = null;
	public void setDAO(BaseDAO dao){
		this.dao = dao;
	}
	public void create(M m) {
		
		dao.create(m);
	}

	public void update(M m) {
	
		dao.update(m);
		
	}

	public void delete(int uuid) {
		
		dao.delete(uuid);
	}

	public M getByUuid(int uuid) {
		// TODO Auto-generated method stub
		return (M) dao.getByUuid(uuid);
	}

	public Page<M> getByConditionPage(QM qm) {
		List list = dao.getByConditionPage(qm);
		qm.getPage().setResult(list);
		return qm.getPage();
	}

}
