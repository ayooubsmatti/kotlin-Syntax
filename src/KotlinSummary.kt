import java.lang.Exception


fun main (args:Array<String>){
//==================================================
    // define var
//    val a = "sa"
//    print(a)
//    var b = 2
//    print(b)
// ==================================================
    // fix type value "optional"
//    var ab:String="kotlin"
//==================================================

    // null safety ex1
//  var b:String?
//  b = null
//  print(b)
    // null safety ex2
//  var a:Double?= null
//  print(a)
    // !! meaning that when the ab value equal to null the program crash
//    var ab:String?=null
//    print(ab !!)

// ==================================================
    // Input format in Kotlin
//    var a:String = readLine()!!
//    var b:Int = readLine()!!.toInt()
//    var c:Double = readLine()!!.toDouble()

// ==================================================
    // print variable
//    var a = 12
//    var b = 15
//    var sum = a + b
//    print(sum)
//    print("sum"+sum)
//    print("sum$sum")
// ==================================================
    //priority rules | operation rules
    // ()
    // ^
    // * /
    // + -
    // =
// ==================================================



// ==================================================
//logical operator : equal == < > <= >= not equal !=   and &&  or||
// ==================================================
    // if / else statement
//    print("enter your grade:")
//    var grd:Int = readLine()!!.toInt()
//    if (grd>=10 && grd <=20){
//        print("great you pass the exam with successful !")
//    }else if (grd<10){
//        print("you fail ")
//    }else {
//        print("you made incorrect value !! ")
//    }
// ==================================================
   // use When statement
//    print("enter you grad: ")
//    var a : Int = readLine()!!.toInt()
//    when(a){
//        20,19->{
//            print("super great")
//        }
//        in 15..18->{
//            print("excellent")
//        }
//         12,13,14->{
//            print("good")
//        }
//        11->{
//            print("cum lud distinction")
//        }
//        10->{
//            print("medium")
//        }
//
//        in 1..9->{
//            print("you fail")
//        }
//        else->{
//            print("you grad out of range")
//        }
//
//    }

// ==================================================
// for =====   while  ======  do while

//    println("==========for result============")
//    for (countFor in 1..5  ){
//        println(countFor)
//    }
//    println("==========while result============")
//    var countWhile = 0
//    while (countWhile < 5){
//        println(countWhile)
//        countWhile += 1
//    }
//
//    println("==========do while result============")
//
//    var countDoWhile = 0
//   do{
//        println(countDoWhile)
//        countDoWhile += 1
//    } while (countDoWhile < 5)

// ==================================================
    // control loop continue "ignore actual step" break
//    for (item in 1..6)
//    {
//        if (item == 3){
//           continue
//        }
//        if (item == 5 ){
//            break
//        }
//    }
    //============== control with label break
//         for (item in 1..6)
//    {
//        loop@ for (item2 in 1..6) {
//            println("item2 $item2")
//                if (item2 == 5){
//                println("item2 $item2")
//                break@loop }
//        }
//    }

// ==================================================
    //String
//    var msg:String = " Welcome Home"
//    for (count in 0..msg.length -1){
//        println("msg[$count]= "+msg[count])
//    }
//
//    var msg1:String = " Welcome Home"
//    for (count in msg1.indices){
//        println("msg1[$count]= "+msg1[count])
//    }
//
//
//    val ayoub:String = "Ayoub"
//    var mesageWelcome = ayoub + msg
//    println(mesageWelcome)
//
//    println(msg.toUpperCase())
//    println(msg.toLowerCase())
//    println(msg.trim())
//    println(msg.split(" "))
// ==================================================
//    var arrayint = Array<Int>(5){0}
//    for (index in 0..4){
//        println(arrayint[index])
//    }
//    println("=========================")
//    for (item in arrayint){
//        println(item)
//    }
//    println("=========== fil array ==============")
//    for (index in 0..4){
//        arrayint[index] = readLine()!!.toInt()
//    }
//    println("=========== print all item in arrayint ==============")
//    for (item in arrayint){
//        println(item)
//    }
// ==================================================
    //ArrayList
//    var arrayList = ArrayList<String>()
//    arrayList.add("a1")
//    arrayList.add("a2")
//    arrayList.add("b1")
//    arrayList.add("b2")
//    arrayList.add("c1")
//    arrayList.add("c2")
//    println("======with in ======")
//    for (item in arrayList){
//        println(item)
//    }
//    println("======with index ======")
//    for (index in 0..arrayList.size-1){
//        println(arrayList[index])
//    }
//    println("======with until ======")
//    for (index in 0 until arrayList.size){
//        println(arrayList[index])
//    }
//    arrayList.set(2,"a1")
//    arrayList[3] = "a3"
//
//    println("======with until ======")
//    for (index in 0 until arrayList.size){
//        println(arrayList[index])
//    }
//
//    println("search name")
//    var searchName = readLine()!!.toString()
//    if (arrayList.contains(searchName)){
//        println("existed")
//    }else{
//        println("dose not existed")
//    }
// ==================================================
    //HashMap
//    var map= HashMap<Int,String>()
//    map.put(1,"a")
//    map.put(2,"b")
//    map.put(3,"c")
//
//    for (key in map.keys){
//        println(map[key])
//    }
// ==================================================
    // function
//    var a=2
//    var b=3
//    show(sum(a,b))
// ==================================================
    //try & catch

    try {
        var a =1
        var b =0
        print(a/b)
    }catch (ex:Exception){
        println(ex.message)
    }
// ==================================================
}

// ==================================================
fun sum(a:Int , b:Int):Int{
    var s:Int = a + b
    return s
}
fun show(int:Int){
    println("a + b = $int")
}