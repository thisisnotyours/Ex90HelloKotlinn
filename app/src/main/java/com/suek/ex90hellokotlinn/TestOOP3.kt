package com.suek.ex90hellokotlinn

fun main(){
    //안드로이드에서 가장 많이 사용되는
    //이너클래스 & 인터페이스 & 익명클래스

    //1. 이너클래스는 아웃터객체만 생성할 수 있음
    val obj= AAA()
    val b= obj.getBBBInstance()
    b.show()


    //2. 인터페이스 [ 추상메소드만 보유한 클래스 ]
    //val obj3= ClickListener()   //인터페이스는 직접 객체생성 불가
    //인터페이스를 사용하려면 인터페이스를 구현한 클래스를 만들어서
    //그 클래스안에서 인터페이스의 추상메소드를 오버라이드 해야만함
    val obj3= Clicker()
    obj3.onclick()


    //3. 익명클래스 [ Java 문법이 완전 다름 : object 키워드 사용 ]
    val obj4= object : ClickListener{  // ()없음   //object(객체) : ClickListener(자료형? )
        override fun onclick() {
            println("Anonymous class onClick!!!")
        }
    }
    obj4.onclick()
}



//보통 모든 리스너가 인터페이스로 이루어져잇음..
//인터페이스는 특별할 것이 없음
interface  ClickListener{
    //추상메소드
    fun onclick()
}


//인터페이스를 구현한 클래스
class Clicker : ClickListener{
    override fun onclick() {
        println("click!!!")
        println()
    }
}




//클래스안에 클래스 : inner class
class AAA{
    var a:Int=0

    fun show(){
        println("AAA의 show")
        println()
    }

    //이너클래스 객체를 생성하여 리턴해주는 메소드
    fun getBBBInstance() : BBB{
        val obj= BBB()   //아웃터는 이너클래스 객체 생성가능
        return obj
    }

    //이너클래스 [ 자바와 다르게 inner 키워드가 없으면 아웃터클래스의 멤버를 내 것인양 사용할 수 없음- 오버라이드 된 것이 아님. ]
    inner class BBB{
        fun show(){
            println("아웃터 클래스의 프로퍼티 a : $a")

            //이너 안에서 아웃터의 this 사용
            this@AAA.show()
        }
    }
}