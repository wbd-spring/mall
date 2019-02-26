package com.wbd.mall.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wbd.mall.common.pageutil.Page;
import com.wbd.mall.common.util.format.DateFormatHelper;
import com.wbd.mall.common.util.json.JsonHelper;
import com.wbd.mall.customer.service.ICustomerService;
import com.wbd.mall.customer.vo.CustomerModel;
import com.wbd.mall.customer.vo.CustomerQueryModel;

/**
 * spring mvc : web.xml添加spring mvc的dispatchServelt，指定spring mvc的 配置文件
 * springmvc在集成mybatis框架
 * 
 * @ModelAttribute 表示用户请求的参数绑定到一个对象中
 * Model model 表示，查询之后或者出来之后， 把值放到model中， 然后传递给页面或者其他的请求
 * 
 * @author jwh
 *
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

	// 注入业务层接口
	@Autowired
	private ICustomerService ics;

	// 添加， 跳转到页面
	@RequestMapping(value = "toAdd", method = RequestMethod.GET)
	public String toAdd() {

		return "customer/add";
	}

	// 添加，提交添加页面， @ModelAttribute绑定参数，把传过来的参数绑定到ModelAttribute 成功之后(跳转到另外页面)可以从绑定的参数中获取值
	// @ModelAttribute绑定参数 ,到下一个页面获取
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(@ModelAttribute("cm") CustomerModel cm) {
		cm.setRegisterTime(DateFormatHelper.long2str(System.currentTimeMillis()));
		ics.create(cm);
		return "redirect:toList";
	}

	// 更新，跳转到页面,通过restful形式，利用uuid查询之后进行跳转到更新页面
	// @PathVariable 绑定url中的变量customerUuid，变量必须与url中一致
	@RequestMapping(value = "toUpdate/{customerUuid}", method = RequestMethod.GET)
	public String toUpdate(Model model, @PathVariable("customerUuid") int customerUuid) {
		// 通过restful形式查询到cm对象，
		CustomerModel cm = ics.getByUuid(customerUuid);
		// 然后添加到model中,传递到update页面
		model.addAttribute("cm", cm);
		return "customer/update";
	}

	// 更新 ，把更新页面的参数绑定到@ModelAttribute中的cm对象
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@ModelAttribute("cm") CustomerModel cm) {
		ics.update(cm);
		return "redirect:toList";
	}

	// 删除，跳转到页面,通过restful形式，利用uuid查询之后进行跳转到更新页面
	// @PathVariable 绑定url中的变量customerUuid，变量必须与url中一致
	@RequestMapping(value = "toDelete/{customerUuid}", method = RequestMethod.GET)
	public String toDelete(Model model, @PathVariable("customerUuid") int customerUuid) {
		// 通过restful形式查询到cm对象，
		CustomerModel cm = ics.getByUuid(customerUuid);
		// 然后添加到model中,传递到update页面
		model.addAttribute("cm", cm);
		return "customer/delete";
	}

	// 删除
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String delete(@RequestParam("uuid") int customerUuid) {
		ics.delete(customerUuid);
		return "redirect:toList";
	}
	
	//查询
  @RequestMapping(value = "toList", method = RequestMethod.GET)
   public String toList(@ModelAttribute("wm") CustomerWebModel wm,Model model) {
	  CustomerQueryModel cqm = null;
	  if(wm.getQueryJsonStr()==null || wm.getQueryJsonStr().trim().length()==0) {
		  
		  cqm = new CustomerQueryModel();
	  }else {
		  //将queryJsonStr转换为 cqm对象
		  cqm = (CustomerQueryModel) JsonHelper.str2Object(wm.getQueryJsonStr(), CustomerQueryModel.class);
	  }
	  
	  //设置每页显示多少条
	  cqm.getPage().setNowPage(wm.getNowPage());
	  //设置页码
	  if(wm.getPageShow()>0) {
		  
		  cqm.getPage().setPageShow(wm.getPageShow());
	  }
	  
	  //调用业务层 ，查询分页
	  Page<CustomerModel> dbPage = ics.getByConditionPage(cqm);
	  
	  //把查询条件传入到页面
	  model.addAttribute("wm", wm);
	  model.addAttribute("page", dbPage);
	  
	  return "customer/list";
  }
  
  @RequestMapping(value="toQuery",method=RequestMethod.GET)
	public String toQuery(){
		return "customer/query";
	}	
}
