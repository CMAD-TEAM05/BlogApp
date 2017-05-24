package com.blog.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class BlogApplication extends ResourceConfig {
	public BlogApplication() {
		packages("com.blog.rest");
	}
}