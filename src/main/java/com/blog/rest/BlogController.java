package com.blog.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
//import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.blog.api.BlogInterface;
import com.blog.api.User;
import com.blog.service.CiscoBlog;



@Path("/blogapp")
public class BlogController {
	private static BlogInterface team5Blog = new CiscoBlog();

	@POST
	@Path("/user")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(User user) {
		team5Blog.addUser(user);
		return Response.ok().build();
	}

	@GET
	@Path("/user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMsg(@PathParam("id") int id) {

		//String output = "Jersey say : " + id;
		User userInfo = team5Blog.findUser(id);
		return Response.ok().entity(userInfo).build();
	}
}	