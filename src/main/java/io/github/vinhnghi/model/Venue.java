package io.github.vinhnghi.model;

public class Venue {

	private String id;
	private String address;
	private String url;
	private String phone;
	
	public Venue(String id, String address, String url, String phone) {
		this.id  = id;
		this.address = address;
		this.url = url;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
