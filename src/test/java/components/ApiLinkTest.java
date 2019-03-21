package components;


import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.x5.components.ApiLink;
import com.x5.components.impl.ApiLinkImplementation;
import com.x5.configuration.ApplicationConfig;

import entity.Place;
import entity.Weather;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApiLinkImplementation.class, ApplicationConfig.class})
@TestPropertySource(properties = {
	    "forecast-3h-by-coord=testValue",
	    "forecast-6h-by-coord=testValue",
	    "forecast-24h-by-coord=testValue",
	    "current-weather-by-object=testValue",	    
	    "search-cities-by-coord=testValue",
	    "search-cities-by-name=testValue",
	    "search-cities-by-ip: testValue",
	    "eureka.client.enabled=false"
	})

public class ApiLinkTest {
	
	@Autowired
	ApiLink apiLink;

	@MockBean
	RestTemplate restTemplate;

	
	@Test
	public void testSearchPlace() {		
		Assert.isTrue((apiLink.loadPlaceByName(StringUtils.EMPTY) instanceof Place), "Result must be String");
	}

	@Test
	public void testGetWeather() {
		Assert.isTrue(apiLink.getWeather(StringUtils.EMPTY) instanceof Weather, "Result must be String");
	}

}
