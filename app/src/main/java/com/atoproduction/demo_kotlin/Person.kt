package com.atoproduction.demo_kotlin

/**
<<<<<<< HEAD
 * Created by : Thinhvh on 5/13/2021
=======
 * Created by : Thinhvh on 5/11/2021
>>>>>>> origin/master
 * Phone      : 0962890153 - 0398477967
 * Facebook   : https://www.facebook.com/thinh.super22
 * Skype      : https://join.skype.com/invite/fvfRTDLcGPJN
 * Mail       : thinhvhph04204@gmail.com
 */
class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}