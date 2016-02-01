package io.github.vinhnghi.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VenuesClient {
	private Client client;
	
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
	
	public VenuesClient(){
		client = ClientBuilder.newClient();
	}
	
	public String getVenues(String query){
		String response = client.target(baseUrl)
				.queryParam("client_id",client_id)
				.queryParam("client_secret",client_secret)
				.queryParam("ll",ll)
				.queryParam("query",query)
				.queryParam("v",version)
				.request(MediaType.APPLICATION_JSON).get(String.class);
		return response;
	
	}
}
