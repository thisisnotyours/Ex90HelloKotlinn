package com.suek.ex90hellokotlinn

fun main(){

    //1. 클래스 선언 및 객체 생성 : new 키워드 없음
    var obj= MyClass()
    obj.show()

    //1.1) 다른 .kt 파일에 class 만들기 [당연히 확장자 .kt]
    var obj2= MyKtClass()
    obj2.show()





//생성자의 목적: 멤버변수의 값들을 초기화 시키기 위해- 전달받으려는 목적- 파라미터를 전달받아 초기화시키려는 목적
    //2. 생성자- 이건 좀 특이함..
    //코틀린에서는 생성자가 두 종류가있음 -주생성자, 보조생성자
    //2.1) 주생성자 [ Primary Constructor ]
    var s= Simple()  //생성자 호출

    //2.2) 주생성자에 값 전달하기 [ 오버로딩이 안됨 ]
    var s2= Simple2(10, 20)
    s2.show()


    //2.3) 만약 생성자 오버로딩을 구현하고 싶다면
    //보조생성자 활용 [ C, 또는 Java 와 흡사한 방식 ]
    var s3= Simple3()
    var s4= Simple3(100)  //오버로딩 생성자 호출


    //2.4) 주생성자와 보조생성자 동시사용 [ 주생성자를 만들어 놓고 나중에 오버로딩할때 ]
    var s5= Simple4()          //주생성자 호출
    var s6= Simple4(200)  //오버로딩된 보조생성자 호출


    //참고
    var s7= Simple5()
}

//2.4) 주생성자 + 보조생성자
class Simple4 constructor(){  //주생성자
    init {
        println("Simple4 init")
    }
    //보조생성자를 추가하고 싶다면... 명시적으로 주 생성자를 호출하는 코드가 옆에 있으면 됨
    constructor(num:Int):this(){
        println("Simple4 Secondary Constructor!!!")
        println()
    }
}


//2.3) 보조생성자 [ 클래스 안에 construct()블럭 구현 ]
//보조생성자만 구현해도 주 생성자는 원래부터 존재하고 있는 것임
class  Simple3{
    //init
    init {
        println("여기는 객체 처음 만들때 무조건 실행")
    }

    //보조생성자
    constructor(){
        println("Simple3의 Secondary 생성자")
        println()
    }

    //보조생성자는 Overloading 이 가능함 [ 보조생성자는 var 키워드로 한번에 멤버변수 만들기 불가 ]
    constructor(num: Int){
        println("Simple3의 Secondary 생성자 : $num")
        println()
    }
}




//2.2) 주생성자 파라미터 받기 [ 주생성자는 오버로딩 불가 ]  //코틀린은 유일하게 생성자만 멤버변수를 파라미터자리에 사용가능
class Simple2 constructor(var num:Int, num2:Int){   //var 키워드를 사용하면 '멤버변수'임- 여기서는 매개변수가 아님 [num2는 var 이 없으므로 매개변수(지역변수)]
    init {
        println("Simple2 생성")
        println("num : $num")  //멤버변수(클래스 안에서는 다 알아들음)
        println("num2 : $num2")  //매개변수(생성자에만 사용가능)
    }

    fun show(){
        println(" show method num : $num ")  //즉, num 은 이미 멤버변수- 메소드에 구애받지 않고 사용가능
        //println(" show method num2 : $num2 ") //num2는 주 생성자의 지역변수임- 그래서 ERROR
    }

    //멤버변수에 매개변수값 대입을 생성자 블럭에서 안해도 됨
    var n:Int= num2  //변수 대입하듯이 주생성자의 매개변수 대입가능
}




//2.1) 주생성자 : 클래스명 옆에 constructor() 라고 명시
class Simple constructor(){
    //주생성자는 {}가 없기에 코드 작성할 곳이 없음
    //주생성자를 위한 별도의 초기화 블럭이 존재
    init {
        println("Simple 주생성자 실행!!!!")
        println()
    }
}








//1. 클래스 선언 [ 멤버변수(Field)를 Property(속성)라고 부름 ]
class MyClass{
    //멤버변수[Property] - 반드시 초기화 해야함
    var a:Int= 10

    //메소드 : Method
    fun show(){   //멤버메소드
        println("show : ${a}")
        println()
    }
}


//참고로 constructor 키워드 접근제한자나 어노테이션이 없다면 생략가능
class Simple5 (){
    init {
        println("Simple5 주생성자")
    }
}