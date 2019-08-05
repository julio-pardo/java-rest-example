package com.mkyong.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.mkyong.rest.RestService;

public class RestApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public RestApplication() {
		singletons.add(new RestService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
