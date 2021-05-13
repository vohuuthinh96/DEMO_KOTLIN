package com.atoproduction.demo_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View


class MainActivity : AppCompatActivity() {
    private val TAG ="thinhvh";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges
        val empty = "test".let {
            // trả về value
            println(it)                    // 2
        }

        // truy cập tới các thành phần của đối tượng
        with("thinhvh") {
            println("thinhvh $length")
        }

        fun getNullableLength(ns: String) {
            ns.run {
                // trả về đối tượng => có thể gọi tới các phương thức của đối tượng// 1
                println("\tlength = $length")
                length                                                 // 3
            }
        }


        val jake = Person()
        // trả về đối tượng jake // 1
        //áp dụng thực thi một khối mã trên một đối tượng và trả về chính đối tượng đó
        val stringDescription = jake.apply {                    // 2
            name = "Jake"                                       // 3
            age = 30
            about = "Android developer"
            hello()
        }

        println("thinhvh ${stringDescription.name}")
        val jake2 = Person()   // 1
            .also {                                          // 2
                println("thinhvh ${it.name}") // 3
            }

        var dog = Dog("tom",12)
        dog eat "com"

        operator fun Int.times(str: String) = str.repeat(this)       // 1
        println("Bye")                                          // 2

        operator fun String.get(range: IntRange) = substring(range)  // 3
        val str = "Always forgive your enemies; nothing annoys them so much."
        println(str[0..14])

//        printMessageWithPrefix("hihi")
//
//        var st = Student("thinh");
//        Log.d(TAG, st.name)
//
//        var dog = Dog("tom",12)
//        Log.d(TAG, dog.name)
//
//        var cat = CAT()
//        cat.name="vu";
//
//
////        textview
//        // ? được phép null
//        // !! không được phép null
//        var myName:String? = "thinh"
//        var age = 25
//        var male = true
//        myName=null
////        myName.toString();
//
//        if (4>3){
//
//        }else{
//
//        }
//
//        var xxx = if(4>3) 1 else 2
//
//
//        // câu lệnh when
//        val a =10;
//        when(a){
//            1 -> Log.d(TAG, "1: ")
//            2-> Log.d(TAG, "3: ")
//            in 3..4 -> Log.d(TAG, "3 toi 4 ")
//            else -> Log.d(TAG, "else")
//        }
//
//
//        val b:Array<Int> = arrayOf(1,2,3,4)
//        for (i in b) {
//            Log.d(TAG, "value = $i")
//        }
//
//        for (i in b.indices) {
//            Log.d(TAG, "value = ${b[i]}")
//        }
//
//        // index và value
//        for ((index, value) in b.withIndex()){
//            Log.d(TAG, "valuex = $value")
//        }
//
//        var c=10
//        while (c>0){
//            c--
//            Log.d(TAG, "c = $c")
//        }
//
//        for (i in b) {
//            if (i==2){
//                // bỏ qua khối lệnh này
//                continue
//            }
//            Log.d(TAG, "i = $i ")
//        }
//
//        b.forEach {
//            Log.d(TAG, "xxx: i = $it")
//        }
//
//
//        labelOne@for (i in 1..10){
//            labelTwo@for (y in 1..10){
//                Log.d(TAG, "onCreate: i = $i -- y=$y")
//                if (i==2 && y ==8){
//                    break@labelTwo
//                }
//            }
//        }
//
//
//        Log.d(TAG, "dientich: ${tinhDientich(4,5)}")
//        Log.d(TAG, "dientich: ${tinhDientich(4)}")

    }

    fun println(ms:String){
        Log.d(TAG, ms)
    }

    fun tinhDientich(chieuDai:Int, chieuRong:Int = chieuDai):Int{
        return chieuDai*chieuRong
    }

    fun onClick(view: View) {
        Log.d("thinhvh", "onClick: ")
    }


    fun printMessage(message:String):Unit{
        Log.d("thinhvh", message)
    }

    //hihi la defaule value
    fun printMessageWithPrefix(message:String, prefix:String ="hihi"):Unit{
        Log.d("thinhvh", prefix + message)
    }
}