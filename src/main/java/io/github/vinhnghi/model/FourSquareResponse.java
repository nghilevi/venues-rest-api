package io.github.vinhnghi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FourSquareResponse {

	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public class Response {
		List<Venue> venues;
		public Response(){
		}
		public List<Venue> getVenues() {
			return venues;
		}

		public void setVenues(List<Venue> venues) {
			this.venues = venues;
		}
	}

	Response response;
	
	public FourSquareResponse(){
	}
	
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	
	public String toString(){
		return "FourSquareResponse{"+"response="+response +'}';
	}
}
