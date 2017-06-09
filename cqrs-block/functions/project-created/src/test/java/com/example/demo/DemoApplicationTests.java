package com.example.demo;

import demo.functions.ProjectCreatedFunction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectCreatedFunction.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}