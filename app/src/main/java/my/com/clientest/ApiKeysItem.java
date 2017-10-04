package my.com.clientest;

import com.google.gson.annotations.SerializedName;


public class ApiKeysItem{

	@SerializedName("write_flag")
	private boolean writeFlag;

	@SerializedName("api_key")
	private String apiKey;

	public void setWriteFlag(boolean writeFlag){
		this.writeFlag = writeFlag;
	}

	public boolean isWriteFlag(){
		return writeFlag;
	}

	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}

	public String getApiKey(){
		return apiKey;
	}

	@Override
 	public String toString(){
		return 
			"ApiKeysItem{" + 
			"write_flag = '" + writeFlag + '\'' + 
			",api_key = '" + apiKey + '\'' + 
			"}";
		}
}