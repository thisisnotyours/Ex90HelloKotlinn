package com.suek.ex90hellokotlinn

fun main(){
    //코틀린의 상속
    var obj= Second()
    obj.show()    //오버라이드된 Second 의 show()가 실행됨

    //상속의 최종연습
    var p= Person("Sam", 20)
    p.show()

    val s= Student("Robin", 25, "Android")
    s.show()
    println()

    val pro= Professor("Hong", 50, "Optimization")
    pro.show()
    println()

    val alba= AlbaStudent("Kim", 28, "Web", "Management")
    alba.show()
    println()

}


//상속해줄 부모클래스는 반드시 open 이라는 키워드가 추가되어야함
//즉, open 이 없으면 자바의 final class 와 같은것임(상수)    (ex; final method-는 더이상 override 할수없다는 것임)
open class First{
    var a:Int= 10

    //오버라이드 해줄 메소드는 반드시 open 키워드 필요
    //즉, 만약 open 이 없으면 자바의 final method 와 같은것임
    open fun show(){
        println(" a : $a ")
    }
}



//상속의 문법 [ 클래스명 뒤에 : 후에 부모클래스명() 작성 <- 부모클래스명 뒤에 주생성자 호출() 주의!! ]
class Second : First(){  //second 가 first 를 상속받아 그 기능을 가지고있음
    var b:Int= 20

    //상속받은 메소드의 기능을 변경 : Override
    //기존 메소드와 같은 이름과 파라미터로 만든 메소드
    //오버라이드를 하려면 반드시 Override 하겠다는 키워드를 추가해야함
    override fun show(){
        //println(" a : $a")
        super.show()   //부모출력은 부모가 알아서..
        println(" b : $a ")
        println()
    }

}