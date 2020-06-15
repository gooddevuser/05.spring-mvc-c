package com.example.springmvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.springmvc.config.WebConfig;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { WebConfig.class })
//@ContextConfiguration(locations = { "file:path-for-bean-config.xml" })
@Log4j // Log4j 媛앹껜瑜� �옄�룞�쑝濡� 留뚮뱶�뒗 annotation (蹂��닔�씠由� : log)
public class DemoTest {
	
	@Test
	public void testOne() {
		
		//int x = 10 / 0;
		
		//System.out.println("Test Method");
		
		
	}

}








