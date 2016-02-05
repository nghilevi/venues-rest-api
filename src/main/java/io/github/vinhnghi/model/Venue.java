package io.github.vinhnghi.model;


import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Venue {

	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	class Contact{
		String formattedPhone;
		public String getFormattedPhone() {
			return formattedPhone;
		}
		public void setFormattedPhone(String formattedPhone) {
			this.formattedPhone = formattedPhone;
		}
		public Contact(){}
	}
	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	class Location{
		String[] formattedAddress;
		public String getFormattedAddress() {
			return StringUtils.join(formattedAddress,"");
		}
		public void setFormattedAddress(String[] formattedAddress) {
			this.formattedAddress = formattedAddress;
		}
		public Location(){}
	}
	
	private String id;
	private String url;
	
	private Contact contact;
	private Location location;
	private String phone;
	private String address;

	public Venue() {
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
		this.phone = contact.getFormattedPhone();
	}

	public void setLocation(Location location) {
		this.location = location;
		this.address = location.getFormattedAddress();
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
