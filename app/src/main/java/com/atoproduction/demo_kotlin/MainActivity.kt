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

        printMessageWithPrefix("hihi")

        var st = Student("thinh");
        Log.d(TAG, st.name)

        var dog = Dog("tom",12)
        Log.d(TAG, dog.name)

        var cat = CAT()
        cat.name="vu";


//        textview
        // ? được phép null
        // !! không được phép null
        var myName:String? = "thinh"
        var age = 25
        var male = true
        myName=null
//        myName.toString();

        if (4>3){

        }else{

        }

        var xxx = if(4>3) 1 else 2


        // câu lệnh when
        val a =10;
        when(a){
            1 -> Log.d(TAG, "1: ")
            2-> Log.d(TAG, "3: ")
            in 3..4 -> Log.d(TAG, "3 toi 4 ")
            else -> Log.d(TAG, "else")
        }


        val b:Array<Int> = arrayOf(1,2,3,4)
        for (i in b) {
            Log.d(TAG, "value = $i")
        }

        for (i in b.indices) {
            Log.d(TAG, "value = ${b[i]}")
        }

        // index và value
        for ((index, value) in b.withIndex()){
            Log.d(TAG, "valuex = $value")
        }

        var c=10
        while (c>0){
            c--
            Log.d(TAG, "c = $c")
        }

        for (i in b) {
            if (i==2){
                // bỏ qua khối lệnh này
                continue
            }
            Log.d(TAG, "i = $i ")
        }

        b.forEach {
            Log.d(TAG, "xxx: i = $it")
        }


        labelOne@for (i in 1..10){
            labelTwo@for (y in 1..10){
                Log.d(TAG, "onCreate: i = $i -- y=$y")
                if (i==2 && y ==8){
                    break@labelTwo
                }
            }
        }


        Log.d(TAG, "dientich: ${tinhDientich(4,5)}")
        Log.d(TAG, "dientich: ${tinhDientich(4)}")

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

    fun sum(x: Int, y: Int): Int {                                          // 3
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y                                    // 4

    fun main() {
        printMessage("Hello")                                               // 5
        printMessageWithPrefix("Hello", "Log")                              // 6
        printMessageWithPrefix("Hello")                                     // 7
        printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
        println(sum(1, 2))                                                  // 9
        println(multiply(2, 4))                                             // 10
    }
}