package io.github.vinhnghi.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.github.vinhnghi.client.VenuesClient;
import io.github.vinhnghi.model.Venue;

@Component
@Path("/venues")
public class VenuesResources {
	
	@Autowired
	VenuesClient venuesClient;
	
	@GET
	@Produces("application/json")
    public List<Venue> getAll(){
        List<Venue> products = new ArrayList<Venue>();
        products.add(new Venue("ID", "Address", "Url", "Phone"));
        return products;
    }
	
	@GET
	@Path("{query}")
	@Produces("application/json")
	public String getVenues(@PathParam("query") String query){
		return venuesClient.getVenues(query);
	}
	
}
