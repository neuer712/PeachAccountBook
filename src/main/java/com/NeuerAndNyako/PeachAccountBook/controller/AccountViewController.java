package com.NeuerAndNyako.PeachAccountBook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.NeuerAndNyako.PeachAccountBook.bean.AccountItemPage;

@Controller

public class AccountViewController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountViewController.class);
	
	@RequestMapping("/index")
	public String getAccountItemPage() {
		return "FrontEnd/index";
	}
}
