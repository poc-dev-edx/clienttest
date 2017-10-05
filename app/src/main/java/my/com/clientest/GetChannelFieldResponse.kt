package my.com.clientest

data class GetChannelFieldResponse(
	val channel: Channel? = null,
	val feeds: List<FeedsItem?>? = null
)
