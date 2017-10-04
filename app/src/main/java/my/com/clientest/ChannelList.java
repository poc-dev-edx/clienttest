package my.com.clientest;


import com.google.gson.annotations.SerializedName;


public class ChannelList {

	@SerializedName("pagination")
	private Pagination pagination;

	@SerializedName("channels")
	private ChannelList<ChannelsItem> channels;

	public void setPagination(Pagination pagination){
		this.pagination = pagination;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public void setChannels(ChannelList<ChannelsItem> channels){
		this.channels = channels;
	}

	public ChannelList<ChannelsItem> getChannels(){
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