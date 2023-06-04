class Dog(food:String, location:String) : Animal(food, location){

    override fun eat() {
        println("Пёс кушает")
    }

    override fun makeNoise() {
        println("Пес лает")
    }

    override fun sleep() {
        println("Пёс спит")
    }
}