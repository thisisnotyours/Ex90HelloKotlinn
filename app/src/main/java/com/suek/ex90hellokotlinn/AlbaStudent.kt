package com.suek.ex90hellokotlinn

//주 생성자는 constructor 키워드 생략가능
class AlbaStudent (name:String, age:Int, major:String, var task:String) : Student(name, age, major) {
    init {
        println("AlbaStudent 생성")
    }

    override fun show() {
        println("name: $name  age: $age  major: $major  task: $task")
    }
}