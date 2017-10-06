package my.com.clientest

import com.google.gson.annotations.SerializedName


data class GetStatusResponse
(

	@field:SerializedName("channel")
	val channel: Channel? = null,

	@field:SerializedName("feeds")
	val feeds: List<FeedsItem?>? = null
)