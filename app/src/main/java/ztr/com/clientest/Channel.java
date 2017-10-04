package ztr.com.clientest;

import com.google.gson.annotations.SerializedName;


public class Channel{

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("name")
	private String name;

	@SerializedName("longitude")
	private String longitude;

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"Channel{" + 
			"latitude = '" + latitude + '\'' + 
			",name = '" + name + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}