package my.com.clientest

import com.google.gson.annotations.SerializedName


data class FeedsItem(

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("entry_id")
	val entryId: Int? = null,

	@field:SerializedName("status")
	val status: String? = null
)