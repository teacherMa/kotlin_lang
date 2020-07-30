package chapter10_reflectandannotation

@Serialize
data class Chair(val price: Int, val hasWheel: Boolean, val brand: String, @Exclude val remark: String,
                 @SerializeName("nick_name") val alias: String)