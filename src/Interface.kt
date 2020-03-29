
interface Op{
    fun sub(a:Int,b:Int)
    fun mul(a:Int,b:Int)
}

class Au: Op {
    override fun sub(a: Int, b: Int) {
        println("${a+b}")
    }

    override fun mul(a: Int, b: Int) {
        println("${a*b}")
    }

}
fun main(args:Array<String>){
    var au = Au()
    au.mul(2,5)
}