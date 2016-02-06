package io.github.vinhnghi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Photo {
	class User{
		class UserPhoto{
			String prefix;
			public String getPrefix() {
				return prefix;
			}
			public void setPrefix(String prefix) {
				this.prefix = prefix;
			}
			public String getSuffix() {
				return suffix;
			}
			public void setSuffix(String suffix) {
				this.suffix = suffix;
			}
			String suffix;
		}
		
		@JsonProperty("photo")
		private UserPhoto userPhoto;

		public UserPhoto getUserPhoto() {
			return userPhoto;
		}

		public void setUserPhoto(UserPhoto userPhoto) {
			this.userPhoto = userPhoto;
		}
		public User(){}
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private User user;
	private String url;
	public Photo(){}
}
