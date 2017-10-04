package my.com.clientest;

import com.google.gson.annotations.SerializedName;


public class FeedsItem{

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("entry_id")
	private int entryId;

	@SerializedName("status")
	private String status;

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setEntryId(int entryId){
		this.entryId = entryId;
	}

	public int getEntryId(){
		return entryId;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"FeedsItem{" + 
			"created_at = '" + createdAt + '\'' + 
			",entry_id = '" + entryId + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}