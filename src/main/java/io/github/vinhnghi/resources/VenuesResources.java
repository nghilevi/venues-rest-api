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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.github.vinhnghi.model.Venue;

@Component
@Path("/venues")
public class VenuesResources {
	
	private Client client;
	
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
		String url = baseUrl+client_id + client_secret + ll + query+"&" + version;
		//return client.target(baseUrl).path(client_id + client_secret + ll + "Saigon&" + version).request().get();
		return url;
	}
	
	//TODO put these somewhere else
	@Value("${baseUrl}")
	String	baseUrl;
	
	@Value("${client_id}")
	String	client_id;
	
	@Value("${client_secret}")
	String	client_secret;
	
	@Value("${ll}")
	String	ll;
	
	@Value("${version}")
	String version;
}
