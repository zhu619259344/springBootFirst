package com.forezp.sbf;

import com.forezp.sbf.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootFirstApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(SpringBootFirstApplicationTests.class);
	@Test
	public void contextLoads() {
	}

	@Autowired
	RedisDao redisDao;
	@Test
	public void testRedis(){
		redisDao.setKey("name","forezp");
		redisDao.setKey("age","11");
		logger.info(redisDao.getValue("name"));
		logger.info(redisDao.getValue("age"));
	}

}
