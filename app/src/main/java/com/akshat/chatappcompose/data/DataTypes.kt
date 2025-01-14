package com.akshat.chatappcompose.data

data class UserData(
    val userId : String = "",
    val name : String = "",
    val number : String = "",
    val imageUrl : String = ""
)
{
    fun toMap() = mapOf(
        "userId" to userId,
        "name" to name,
        "number" to number,
        "imageUrl" to imageUrl
    )
    constructor() : this("", "", "","")

    // Optionally, you can provide a secondary constructor for convenience
    constructor(userId: String) : this(userId, "", "","")
}
data class ChatData(
    val chatId : String?="",
    val user1 : ChatUser = ChatUser(),
    val user2 : ChatUser = ChatUser()
)
data class ChatUser(
    val userId : String?="",
    val name : String?="",
    val imageUrl: String?="",
    val number : String?=""
)
data class Message(
    val sendBy : String?="",
    val message : String?="",
    val timeStamp : String ?=""
)
data class Status(
    val user : ChatUser = ChatUser(),
    val imageUrl: String?="",
    val timeStamp: Long?=null
)
