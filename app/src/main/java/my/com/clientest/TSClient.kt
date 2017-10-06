package my.com.clientest

import okhttp3.OkHttpClient
import okhttp3.Request


class TSClient{

    var client = OkHttpClient()
    val KEY: String? = "3JPYOWT00TJD5T86"

    var request = Request.Builder()
            .url("https://api.thingspeak.com/channels/341741/fields/1.json?results=2&api_key="+KEY)
            .get()
            .build()

    var response = client.newCall(request).execute()
}