package com.atoproduction.demo_kotlin

import android.util.Log

/**
 * Created by : Thinhvh on 5/11/2021
 * Phone      : 0962890153 - 0398477967
 * Facebook   : https://www.facebook.com/thinh.super22
 * Skype      : https://join.skype.com/invite/fvfRTDLcGPJN
 * Mail       : thinhvhph04204@gmail.com
 */
class Dog(var name:String, var age:Int) {
    infix fun eat(food: String) {
        Log.d("thinhvh", "eat: $food")
    }

}