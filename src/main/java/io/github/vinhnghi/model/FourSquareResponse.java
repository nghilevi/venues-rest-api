package io.github.vinhnghi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FourSquareResponse {
	
	//Try json property
	MetaData meta;
	Response response;
	
	public FourSquareResponse(){
	}
	
	public MetaData getMeta() {
		return meta;
	}
	public void setMeta(MetaData meta) {
		this.meta = meta;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	
	public String toString(){
		return "FourSquareResponse{"+"metaData='" + meta + '\'' + ", response="+response +'}';
	}
}
