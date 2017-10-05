package my.com.clientest

data class ListPublicChannelsResponse(
	val pagination: Pagination? = null,
	val channels: List<ChannelsItem?>? = null
)
