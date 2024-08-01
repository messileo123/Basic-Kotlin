fun main(args:Array<String>){
    var year:Int=2050

    if(year%400==0||(year%100!=0 && year%4==0) ){
        println("$ {year}is a leep Year")
    }else{
        println("$ {year}isn't a leep Year")
    }
}
