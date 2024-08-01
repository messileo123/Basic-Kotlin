fun main() {
    var car1 = Car()

    car1.name = "kawsar"
    car1.color = "blue"
    car1.model = "lamborghini"

    println(car1.name)
    println(car1.color)
    println(car1.model)

    car1.start()
    car1.stop()
}

class Car {
    var name: String = ""
    var color: String = ""
    var model: String = ""

    fun start() {
        println("car start")
    }

    fun stop() {
        println("car stop")
    }
}
