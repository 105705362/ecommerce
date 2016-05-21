package com.infosys.ecommerce.ofbiz.soap.test;

import javax.xml.ws.Holder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.infosys.ecommerce.ofbiz.soapclient.MapEntry;
import com.infosys.ecommerce.ofbiz.soapclient.MapKey;
import com.infosys.ecommerce.ofbiz.soapclient.MapMap;
import com.infosys.ecommerce.ofbiz.soapclient.MapValue;
import com.infosys.ecommerce.ofbiz.soapclient.ShowDemoPortType;
import com.infosys.ecommerce.ofbiz.soapclient.StdString;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:contexts/ws-client-context.xml" })
public class SoapClientTest extends AbstractJUnit4SpringContextTests {
	final protected Log log = LogFactory.getLog(this.getClass());

	@Autowired
	private ShowDemoPortType client;


	@Test
	public void testSoap() {
		log.debug("testSoap");
		Holder<MapMap> params = new Holder<MapMap>();
		MapEntry entry = new MapEntry();
		
		MapKey key = new MapKey();
		StdString stdString = new StdString();
		stdString.setValue("greeting");
		key.setStdString(stdString);
		entry.setMapKey(key);
		
		MapValue value= new MapValue();
		StdString valueString = new StdString();
		valueString.setValue("greeting");
		value.setStdString(valueString);
		entry.setMapValue(value);
		
		
		MapMap mm = new MapMap();
		mm.getMapEntry().add(entry);
		params.value = mm;
		client.showDemo(params);
	}
}
