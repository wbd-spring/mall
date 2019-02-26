package com.wbd.mall.common.web;

import java.io.Serializable;

public class BaseWebModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  String queryJsonStr="";
	private int nowPage=1;
	private int pageShow=0;
	public String getQueryJsonStr() {
		return queryJsonStr;
	}
	public void setQueryJsonStr(String queryJsonStr) {
		this.queryJsonStr = queryJsonStr;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getPageShow() {
		return pageShow;
	}
	public void setPageShow(int pageShow) {
		this.pageShow = pageShow;
	}
}
