class Message(userName: String) {
    val userName = userName

    fun introduce(){
        println("Привет, меня зовут $userName")
    }
}