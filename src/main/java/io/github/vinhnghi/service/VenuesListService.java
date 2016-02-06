package io.github.vinhnghi.service;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.github.vinhnghi.model.FourSquareResponse;
import io.github.vinhnghi.model.Photo;
import io.github.vinhnghi.model.Venue;

import javax.ws.rs.core.UriBuilder;

@Component
public class VenuesListService {
	
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
	
	RestTemplate restTemplate;
	UriBuilder uriBuilder;
	
	public VenuesListService(){
		restTemplate = new RestTemplate();
	}

	public List<Venue> getVenues(String query){
	
		uriBuilder = UriBuilder.fromPath(baseUrl)
				.path("search")
				.queryParam("client_id",client_id)
				.queryParam("client_secret",client_secret)
				.queryParam("ll",ll)
				.queryParam("query",query)
				.queryParam("v",version);
				
		FourSquareResponse fSResponse = restTemplate.getForObject(uriBuilder.build(), FourSquareResponse.class);
		List<Venue> venues = fSResponse.getResponse().getVenues();
		
		return venues;
	
	}


	public List<Photo> getPhotosByVenue(String query) {
		uriBuilder = UriBuilder.fromPath(baseUrl)
				.path(query).path("photos")
				.queryParam("client_id",client_id)
				.queryParam("client_secret",client_secret)
				.queryParam("v",version);
				
		FourSquareResponse fSResponse = restTemplate.getForObject(uriBuilder.build(), FourSquareResponse.class);
		List<Photo> photosList = fSResponse.getResponse().getPhotos();
		System.out.println("photosList: "+fSResponse.getResponse());
		return photosList;
	}
}
