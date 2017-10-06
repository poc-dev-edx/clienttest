package my.com.clientest

import com.google.gson.annotations.SerializedName


data class Channel(

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
)