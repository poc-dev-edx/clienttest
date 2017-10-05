package my.com.clientest

data class GetChannelFeed(
	val channel: Channel? = null,
	val feeds: List<FeedsItem?>? = null
)
