package io.github.vinhnghi.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.github.vinhnghi.model.FourSquareResponse;
import io.github.vinhnghi.model.Venue;

import javax.ws.rs.core.UriBuilder;

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
	
	public List<Venue> getVenues(String query){
		RestTemplate restTemplate = new RestTemplate();
	
		UriBuilder uriBuilder = UriBuilder.fromPath(baseUrl)
				.path("")
				.queryParam("client_id",client_id)
				.queryParam("client_secret",client_secret)
				.queryParam("ll",ll)
				.queryParam("query",query)
				.queryParam("v",version);
				
		FourSquareResponse fSResponse = restTemplate.getForObject(uriBuilder.build(), FourSquareResponse.class);
		List<Venue> venues = fSResponse.getResponse().getVenues();
		
		return venues;
	
	}
}
