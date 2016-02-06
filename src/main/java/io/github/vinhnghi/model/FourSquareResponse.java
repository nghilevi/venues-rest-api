package io.github.vinhnghi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FourSquareResponse {

	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public class Response { //TODO
		class Photos{
			int count;
			public int getCount() {
				return count;
			}
			public void setCount(int count) {
				this.count = count;
			}
			public List<Photo> getPhotos() {
				return photos;
			}
			public void setPhotos(List<Photo> photos) {
				this.photos = photos;
			}
			List<Photo> photos;
			public Photos(){}
		}
		
		List<Venue> venues;
		Photos photos; //TODO change name
		
		public List<Photo> getPhotos() {
			return photos.getPhotos();
		}
		public void setPhotos(Photos photos) {
			this.photos = photos;
		}
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
