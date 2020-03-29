
open class Operations{
    fun sum(a:Int,b:Int){
        var s = a+b
        println("a+b $s")
    }
    fun sub(a:Int,b:Int){
        var s = a-b
        println("a-b $s")
    }
}
class MultiOperators():Operations(){
    fun mul(a:Int,b:Int){
        var s = a*b
        println("a*b $s")
    }
}
fun main(args:Array<String>){
    var multiOperators = MultiOperators()
    println(multiOperators.sub(2,1))
}