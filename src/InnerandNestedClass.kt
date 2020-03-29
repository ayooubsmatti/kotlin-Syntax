class Outer{
    var n:String = "outer"

    inner class Inner {
        fun getName():String{
            return n
        }
    }
}

fun main(args:Array<String>){

    var out = Outer().Inner()

}