package com.wbd.mall.cart.dao;

import org.springframework.stereotype.Repository;

import com.wbd.mall.cart.vo.CartModel;
import com.wbd.mall.cart.vo.CartQueryModel;
import com.wbd.mall.common.dao.BaseDAO;

@Repository
public interface CartDAO extends BaseDAO<CartModel,CartQueryModel>{
	
}
