class Horse(food:String, location:String) : Animal(food, location){

    override fun eat() {
        println("Конь кушаает")
    }
    override fun makeNoise() {
        println("Конь фыркает")
    }

    override fun sleep() {
        println("Конь спит")
    }
}