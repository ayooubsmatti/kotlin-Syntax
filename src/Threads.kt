import java.lang.Exception

class MyThred: Thread {
    var d:String="hola"
    constructor(m:String):super(){
        this.d=m
    }
    override fun run() {
        var count = 0
        while (count<10){
            println("${this.d}count: $count")
            try {
                Thread.sleep(1000)
            }catch (ex:Exception){
                println(ex.message)
            }
            count+=1
        }
    }

}

fun main(args:Array<String>){
//threads 1
  var a = MyThred("hello1 ")
    a.start()
//threads 2
    var b = MyThred("hello2 ")
    b.start()
//threads 3
    var c = MyThred("hello3 ")
    c.start()
}