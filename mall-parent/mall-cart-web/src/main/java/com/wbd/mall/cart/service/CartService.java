package com.wbd.mall.cart.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wbd.mall.cart.dao.CartDAO;
import com.wbd.mall.cart.vo.CartModel;
import com.wbd.mall.cart.vo.CartQueryModel;
import com.wbd.mall.common.service.BaseService;

@Service
@Transactional
public class CartService extends BaseService<CartModel,CartQueryModel> implements ICartService{
	private CartDAO dao = null;
	@Autowired
	private void setDao(CartDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	
}