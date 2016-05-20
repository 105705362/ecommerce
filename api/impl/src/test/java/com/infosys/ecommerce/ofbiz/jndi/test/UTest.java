package com.infosys.ecommerce.ofbiz.jndi.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:contexts/jndi/jndi.xml" })
public class UTest extends AbstractJUnit4SpringContextTests {
	final protected Log log = LogFactory.getLog(this.getClass());

	@Test
	public void testJNDI(){
		log.debug("testJNDI");
	}
}
