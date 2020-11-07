package com.NeuerAndNyako.PeachAccountBook.bean;

import java.util.List;

import com.NeuerAndNyako.PeachAccountBook.entity.AccountItem;

public class AccountItemPage {
	private List<AccountItem> pageAccounts;
	private Integer pageNum;
	private Integer totalPageNum;
	private Integer totalAccountNum;
	public List<AccountItem> getPageAccounts() {
		return pageAccounts;
	}
	public void setPageAccounts(List<AccountItem> pageAccounts) {
		this.pageAccounts = pageAccounts;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getTotalPageNum() {
		return totalPageNum;
	}
	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public Integer getTotalAccountNum() {
		return totalAccountNum;
	}
	public void setTotalAccountNum(Integer totalAccountNum) {
		this.totalAccountNum = totalAccountNum;
	}
	
	
}
