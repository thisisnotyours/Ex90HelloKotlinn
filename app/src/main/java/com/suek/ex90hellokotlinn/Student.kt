package com.suek.ex90hellokotlinn


open class Student constructor(name:String, age:Int, var major:String) : Person(name, age) {
    init {
        println("Student 클래스 만들어졌다!!")
    }

    //override 키워드 주의 [ override 는 자동 open 임 ]
    override fun show() {
        println("name: $name   age: $age  major: $major")
    }
}