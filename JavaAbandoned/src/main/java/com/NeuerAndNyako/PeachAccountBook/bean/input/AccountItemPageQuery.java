package com.NeuerAndNyako.PeachAccountBook.bean.input;

public class AccountItemPageQuery {
	private Integer limit = 25;
	private Integer page = 1;
	
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	
	
}
