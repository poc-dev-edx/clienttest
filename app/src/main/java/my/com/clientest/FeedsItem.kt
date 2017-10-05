package my.com.clientest

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class FeedsItem(

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("entry_id")
	val entryId: Int? = null,

	@field:SerializedName("status")
	val status: String? = null
)