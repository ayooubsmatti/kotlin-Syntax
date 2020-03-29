import sun.misc.Version.init

class MobileDevice(nameDevice:String,androidVersion:Double,camera:Int){
    init {
        println("nameDevice$nameDevice")
        println("androidVersion$androidVersion")
        println("camera$camera")
    }

}
fun main(args:Array<String>){

    var mobileDevice = MobileDevice("redmi Not 8T",9.0,48)
}

