package com.autoDeploy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.autoDeploy.dao.adminUserDao;
import com.autoDeploy.entity.adminUserModel;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutoDeployApplicationTests {
	@Autowired
	private adminUserDao adminUserDao;
	@Test
	public void contextLoads() {
		adminUserDao.selectList(new EntityWrapper<>());
		
	}

}
