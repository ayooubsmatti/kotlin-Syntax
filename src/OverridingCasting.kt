

open class Ope{
    open fun summ(a:Int,b:Int):Int{
       return a+b+1

    }
   open fun suub(a:Int,b:Int):Int{
       return  a-b -1
    }

}

class Mult():Ope(){

    override fun summ(a:Int,b:Int):Int{
        return a+b

    }

    override fun suub(a:Int,b:Int):Int{
        return  a-b
    }

    fun mull(a:Int,b:Int):Int{
        return a*b
    }
}



fun main(args:Array<String>){
    //casting use as
    var multiOperators = Mult()
    println(multiOperators.summ(2,1))
    println(multiOperators.suub(2,1))

    var mu = Ope()
    println(mu.suub(2,1))
    println(mu.summ(2,1))

}