fun main() {
    println("Задание 1:")
    val start =Words()
    println("Задание 2:")
    var userName = "Виталий"
    val mes =Message(userName)
    mes.introduce()
    println("Задание 3:")
    var animals = arrayListOf<Animal>(Cat("рыбу", "под столом"), Dog("сырое мясо", "во дворе"), Horse("овес", "в конюшне"))

    println("   Животные кушают:")
    animals.forEach{
        it.eat()
    }
    println("   Животные общаются:")
    animals.forEach{
        it.makeNoise()
    }
    println("   Животные спят:")
    animals.forEach{
        it.sleep()
    }
    println("   Животные у ветеринара:")
    var vet = Vet()
    animals.forEach {
        vet.treatAnimal(it)
    }

}

