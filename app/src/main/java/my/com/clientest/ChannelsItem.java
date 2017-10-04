package my.com.clientest;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ChannelsItem{

	@SerializedName("elevation")
	private String elevation;

	@SerializedName("last_entry_id")
	private int lastEntryId;

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("ranking")
	private int ranking;

	@SerializedName("id")
	private int id;

	@SerializedName("longitude")
	private String longitude;

	@SerializedName("username")
	private String username;

	@SerializedName("tags")
	private List<TagsItem> tags;

	public void setElevation(String elevation){
		this.elevation = elevation;
	}

	public String getElevation(){
		return elevation;
	}

	public void setLastEntryId(int lastEntryId){
		this.lastEntryId = lastEntryId;
	}

	public int getLastEntryId(){
		return lastEntryId;
	}

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

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setRanking(int ranking){
		this.ranking = ranking;
	}

	public int getRanking(){
		return ranking;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"ChannelsItem{" + 
			"elevation = '" + elevation + '\'' + 
			",last_entry_id = '" + lastEntryId + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",ranking = '" + ranking + '\'' + 
			",id = '" + id + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",username = '" + username + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}