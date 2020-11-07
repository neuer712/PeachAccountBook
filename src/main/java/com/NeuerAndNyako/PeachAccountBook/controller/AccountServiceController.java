package com.NeuerAndNyako.PeachAccountBook.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RestController;
import com.NeuerAndNyako.PeachAccountBook.bean.AccountItemPage;

@RestController
public class AccountServiceController {

	private static final Logger logger = LoggerFactory.getLogger(AccountServiceController.class);
	
	public AccountItemPage getAccountItemPage() {
		logger.info("GetAccountItemPage:");
		return null;
		
	}
}
