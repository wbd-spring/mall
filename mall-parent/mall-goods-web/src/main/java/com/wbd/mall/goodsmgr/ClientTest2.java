package com.wbd.mall.goodsmgr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.wbd.mall.common.pageutil.Page;
import com.wbd.mall.goodsmgr.service.IGoodsService;
import com.wbd.mall.goodsmgr.vo.GoodsModel;
import com.wbd.mall.goodsmgr.vo.GoodsQueryModel;


@Service
public class ClientTest2 {
	@Autowired
	private IGoodsService is;
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClientTest2 ct = (ClientTest2)ctx.getBean("clientTest2");
		
		GoodsModel gm1 = new GoodsModel();
		gm1.setName("vovo");
		gm1.setImgPath("11");
		gm1.setDescription("vovo");
		gm1.setUuid(2);
		//ct.is.create(gm1);
		//ct.is.delete(1);
		//ct.is.update(gm1);
		
		GoodsModel gm = ct.is.getByUuid(3);
		System.out.println("gm=="+gm);
		
		GoodsQueryModel gqm = new GoodsQueryModel();
		gqm.getPage().setPageShow(2);
		gqm.getPage().setNowPage(1);

		 Page<GoodsModel> page = ct.is.getByConditionPage(gqm);
		System.out.println("page==="+page);
	}
}
