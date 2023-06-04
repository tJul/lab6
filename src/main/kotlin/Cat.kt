class Cat(food:String, location:String) : Animal(food, location) {

    override fun eat() {
        println("Кошка кушает")
    }

    override fun makeNoise() {
        println("Кошка мяукает")
    }

    override fun sleep() {
        println("Кошка спит")
    }
}