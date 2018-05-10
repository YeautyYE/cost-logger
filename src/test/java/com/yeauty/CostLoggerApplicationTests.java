package com.yeauty;

import com.yeauty.service.ShowService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CostLoggerApplicationTests {

	@Autowired
	ShowService showService;

	@Test
	public void contextLoads() {
		showService.show();
	}

}




