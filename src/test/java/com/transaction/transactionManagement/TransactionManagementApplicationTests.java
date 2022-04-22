package com.transaction.transactionManagement;

import com.transaction.transactionManagement.service.BankRepoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
class TransactionManagementApplicationTests {

	@Autowired
	BankRepoServiceImpl bankRepoService;

	@Test
	@Transactional
	public void test(){
		System.out.println(bankRepoService == null);
		bankRepoService.transfer(1000);
	}
	@Test
	void contextLoads() {
	}

}
