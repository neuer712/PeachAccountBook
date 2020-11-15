package com.NeuerAndNyako.PeachAccountBook.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.NeuerAndNyako.PeachAccountBook.bean.AccountItemPage;
import com.NeuerAndNyako.PeachAccountBook.dao.AccountDao;
import com.NeuerAndNyako.PeachAccountBook.entity.AccountItem;

@Service(value= "accountService")
public class AccountService {
	
	@Resource
	private AccountDao accountDao;
	
	public AccountItemPage getAccountItemPage(int page, int size) {
		AccountItemPage resultPage = new AccountItemPage();
		List<AccountItem> resultList = accountDao.getAccounts(page, size);
		int totalCount = accountDao.getAccountTotalNum();
		Map<Integer,String> itemTypeMap = accountDao.getAllItemType();
		resultPage.setItemTypeMap(itemTypeMap);
		resultPage.setPageAccounts(resultList);
		resultPage.setPageNum(page);
		resultPage.setTotalAccountNum(totalCount);
		resultPage.setTotalPageNum((totalCount + size -1)/size);
		return resultPage;
	}
}
