package ztr.com.clientest;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class GetStatus {



	@SerializedName("channel")
	private Channel channel;

	@SerializedName("feeds")
	private List<FeedsItem> feeds;

	public void setChannel(Channel channel){
		this.channel = channel;
	}

	public Channel getChannel(){
		return channel;
	}

	public void setFeeds(List<FeedsItem> feeds){
		this.feeds = feeds;
	}

	public List<FeedsItem> getFeeds(){
		return feeds;
	}

	@Override
 	public String toString(){
		return 
			"TSGetStatusResponse{" + 
			"channel = '" + channel + '\'' + 
			",feeds = '" + feeds + '\'' + 
			"}";
		}
}