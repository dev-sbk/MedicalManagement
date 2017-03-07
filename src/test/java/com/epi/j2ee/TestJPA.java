package com.epi.j2ee;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epi.j2ee.domain.Docteur;
import com.epi.j2ee.service.IGenericService;

public class TestJPA {
   private ClassPathXmlApplicationContext app;
	@Before
	public void setUp() throws Exception {
		app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		IGenericService<Docteur> metier=(IGenericService<Docteur>) app.getBean("metier");
		metier.insert(new Docteur("Ben Khalifa","Saber","Sidi El Hani - Sousse", "+21654666787"));
	}

}
