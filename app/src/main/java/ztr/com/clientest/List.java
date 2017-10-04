package ztr.com.clientest;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class List{

	@SerializedName("pagination")
	private Pagination pagination;

	@SerializedName("channels")
	private List<ChannelsItem> channels;

	public void setPagination(Pagination pagination){
		this.pagination = pagination;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public void setChannels(List<ChannelsItem> channels){
		this.channels = channels;
	}

	public List<ChannelsItem> getChannels(){
		return channels;
	}

	@Override
 	public String toString(){
		return 
			"List{" + 
			"pagination = '" + pagination + '\'' + 
			",channels = '" + channels + '\'' + 
			"}";
		}
}