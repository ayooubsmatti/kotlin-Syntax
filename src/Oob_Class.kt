import sun.misc.Version.init

class Device{
    var nameDevice:String?=null
    var androidVersion:Double?=null
    var cameraSelfie:Int?=null
    constructor (namedevice:String,androidversion:Double,cameraselfie:Int){

         this.nameDevice=namedevice
//        println("nameDevice " + this.nameDevice)
         this.androidVersion=androidversion
//        println("androidVersion " + this.androidVersion)
         this.cameraSelfie = cameraselfie
//         println("camera${this.cameraSelfie}")
    }
    fun GetCameraSelfie():Int? {
        return this.cameraSelfie
    }
    fun GetAndroidversion():Double? {
        return this.androidVersion
    }

}
fun main(args:Array<String>){

    var mobileDevice = Device("redmi Not 8T",9.0,48)
    var ab = mobileDevice.GetCameraSelfie()
    println(ab)
}

