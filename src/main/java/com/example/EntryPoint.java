package com.example;

import java.util.ArrayList;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;


@Path("/")
@ApplicationScoped
public class EntryPoint {

	@GET
	@Produces({ "text/html" })
	/**
	 * Here we return a object of call 'Demo'
	 * In webapp/WEB-INF/resources.xml there is a mapping between this class and /test.jsp
	 * 
	 * @return
	 */
	public Demo getTest() {
		Demo d = new Demo();
		DemoItem di2 = new DemoItem();
		DemoItem di3 = new DemoItem();
		d.text = "foo";
		di2.label="bar";
		di3.label="burn";
		d.list = new ArrayList<DemoItem>();
		d.list.add(di2);
		d.list.add(di3);
		return d;
	}
	
}

