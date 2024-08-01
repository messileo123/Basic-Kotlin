fun main(args:Array<String>) {
    var x: Int = 10
    var y: Int = 100
    var z: Int = 150
    if(x>y && x>z){
        println("x is greater then")

    }
        else if(y>x && y>z){
            println("y is greater then")
    }else if(z>y && z>x){
        println("z is greater then")
    }else{
        println("they are equal")
    }


}