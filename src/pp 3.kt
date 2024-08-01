import java.util.*
fun main( args:Array<String>){
    val scan = Scanner(System.`in`)

    var name = scan.nextLine()
    var salary = scan.nextDouble()
    var sales = scan.nextDouble()

    var bonus= sales*0.15
    var totalSalary = salary+ bonus
    println("Total = R$ %.2f".format(totalSalary))
}