package com.bhaskar.core;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.bhaskar.core.dao.services.PaymentService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringCoreApplicationTests 
{
	@Autowired
	PaymentService service;
	
	@Test
	public void testDependency() 
	{
		assertNotNull(service);
	}

}
