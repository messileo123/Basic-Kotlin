import kotlin.contracts.contract

fun main() {
    for (i in 1..10) {

        if (i == 6) {
            continue
        }
        println(i)

    }
    for (i in 1..10) {

        if (i == 6) {
            break
        }
        println(i)


    }
}