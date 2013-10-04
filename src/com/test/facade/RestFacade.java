package com.test.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.entity.TvChannel;
import com.test.service.ProductService;

@Path("products")
@Stateless
public class RestFacade {

	@EJB
	private ProductService service;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<TvChannel> getAllChannels() {
		return service.getAllTvChannels();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("{tcmId}")
	public Response getProductById(@PathParam("tcmId") String id) {
		return Response.status(200).entity(service.getProductWithId(id))
				.build();
	}
}