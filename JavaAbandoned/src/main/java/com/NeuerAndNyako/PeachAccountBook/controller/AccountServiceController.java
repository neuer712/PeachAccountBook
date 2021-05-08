package com.NeuerAndNyako.PeachAccountBook.controller;

import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.NeuerAndNyako.PeachAccountBook.bean.AccountItemPage;
import com.NeuerAndNyako.PeachAccountBook.service.AccountService;

@RestController
@RequestMapping("/accountBook")
public class AccountServiceController {

	private static final Logger logger = LoggerFactory.getLogger(AccountServiceController.class);
	
	@Resource
	AccountService accountService;
	
	@RequestMapping("/all")
	public AccountItemPage getAccountItemPage(int page, int size) {
		logger.info("GetAccountItemPage:");
		return accountService.getAccountItemPage(page, size);
	}
}
