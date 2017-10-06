package my.com.clientest;



public class UrlConstants {
    //Channels
    public final static String LIST_PUBLIC_CHANNNELS = "https://api.thingspeak.com/channels/public.json";
    public final static String GET_STATUS_UPDATES = "https://api.thingspeak.com/channels/1417/status.json";
    public final static String LIST_ALL_USERS_CAHNNELS = "https://api.thingspeak.com/channels?api_key=XXXXXXXXXXXXXXXX";
    public final static String LIST_ALL_PUBLIC_CHANNELS = "https://api.thingspeak.com/users/iothans/channels.json";
    public final static String VIEW_CHANNEL ="https://api.thingspeak.com/channels/9.json";
    public final static String UPDATE_CHANNEL_URL = "https://api.thingspeak.com/channels/CHANNEL_ID";
    public final static String CLEAR_CHANNEL_URL = "https://api.thingspeak.com/channels/4/feeds.json";// api_key=XXXXXXXXXXXXXXXX
    public final static String DELETE_CHANNEL_URL = "https://api.thingspeak.com/channels/4.json";//api_key=XXXXXXXXXXXXXXXX

    //Channel Feeds
    public final static String BULK_UPDATE_CHANNEL_URL ="https://api.thingspeak.com/channels/CHANNEL_ID/bulk_update.json";
    public final static String UPDATE_CHANNEL_FEED = "https://api.thingspeak.com/update.json";//api_key=XXXXXXXXXXXXXXXX field1=73
    public final static String GET_CHANNEL_FEED = "https://api.thingspeak.com/channels/9/feeds.json?results=2";
    public final static String GET_CHANNEL_FIELD_FEED = "https://api.thingspeak.com/channels/9/fields/1.json?results=2";
    
    OkHttpClient client = new OkHttpClient();

Request request = new Request.Builder()
  .url("https://api.thingspeak.com/channels/1417/status.json")
  .get()
  .build();

Response response = client.newCall(request).execute();

}
