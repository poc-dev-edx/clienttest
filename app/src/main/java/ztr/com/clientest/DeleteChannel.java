package ztr.com.clientest;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DeleteChannel{

	@SerializedName("elevation")
	private Object elevation;

	@SerializedName("last_entry_id")
	private Object lastEntryId;

	@SerializedName("latitude")
	private Object latitude;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private Object description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("ranking")
	private int ranking;

	@SerializedName("id")
	private int id;

	@SerializedName("longitude")
	private Object longitude;

	@SerializedName("username")
	private String username;

	@SerializedName("tags")
	private List<Object> tags;

	public void setElevation(Object elevation){
		this.elevation = elevation;
	}

	public Object getElevation(){
		return elevation;
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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"DeleteChannel{" + 
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