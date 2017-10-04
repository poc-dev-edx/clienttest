

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CreateChannel {

	@SerializedName("elevation")
	private Object elevation;

	@SerializedName("metadata")
	private Object metadata;

	@SerializedName("last_entry_id")
	private Object lastEntryId;

	@SerializedName("latitude")
	private Object latitude;

	@SerializedName("description")
	private Object description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("tags")
	private List<Object> tags;

	@SerializedName("name")
	private String name;

	@SerializedName("ranking")
	private int ranking;

	@SerializedName("id")
	private int id;

	@SerializedName("api_keys")
	private List<ApiKeysItem> apiKeys;

	@SerializedName("longitude")
	private Object longitude;

	@SerializedName("username")
	private String username;

	public void setElevation(Object elevation){
		this.elevation = elevation;
	}

	public Object getElevation(){
		return elevation;
	}

	public void setMetadata(Object metadata){
		this.metadata = metadata;
	}

	public Object getMetadata(){
		return metadata;
	}

	public void setLastEntryId(Object lastEntryId){
		this.lastEntryId = lastEntryId;
	}

	public Object getLastEntryId(){
		return lastEntryId;
	}

	public void setLatitude(Object latitude){
		this.latitude = latitude;
	}

	public Object getLatitude(){
		return latitude;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setApiKeys(List<ApiKeysItem> apiKeys){
		this.apiKeys = apiKeys;
	}

	public List<ApiKeysItem> getApiKeys(){
		return apiKeys;
	}

	public void setLongitude(Object longitude){
		this.longitude = longitude;
	}

	public Object getLongitude(){
		return longitude;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"elevation = '" + elevation + '\'' + 
			",metadata = '" + metadata + '\'' + 
			",last_entry_id = '" + lastEntryId + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",description = '" + description + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",tags = '" + tags + '\'' + 
			",name = '" + name + '\'' + 
			",ranking = '" + ranking + '\'' + 
			",id = '" + id + '\'' + 
			",api_keys = '" + apiKeys + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}