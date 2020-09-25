package com.suek.ex90hellokotlinn

//Kotlin 언어 기초 문법

//문법적 주요 특징
//1. 문장의 끝을 나타내는 ; 을 사용하지 않음. 써도 되지만 무시됨
//2. 변수를 만들 때 자료형을 사용하지 않고 var 키워드 사용함. 단, 자료형이 없는것이 아니라 존재함!
//   자동 형변환 안됨. 즉, 정적타입 언어(타입이 고정된 변수다)
//3. 코틀린은 함수형 언어 : 함수를 객체처럼 생각해서 변수에 저장/참조하고 파라미터로 넘겨주는 등의 작업가능 [객체지향언어가 아님!!]

//1) 프로그램의 시작함수인 main 함수가 반드시 있어야함.
//2) 함수를 정의할 때 리턴타입 위치에 'fun' 키워드(function 약자) 사용
fun main(){
    //3) 화면출력
    println("Hello Kotlin")
    println(10)
    println(10.5)
    println('A')
    println(true)
    println(5+3)
    println("===============")

    //4) 자료형과 변수
    //4.1) 기본자료형 : Boolean, Char, Byte, Short, Int, Long, Float, Double, String, Any(Java 의 Object 와 비슷)
    //               [ 기본적으로 코틀린은 모든 변수가 '객체'임. 즉, 모두 '참조변수'임 ]

    //4.2) 변수선언 문법 [ var 키워드 ] ;이 없으므로 변수의 초기화가 없으면 에러임.
    //var a   //error! 초기화를 해야함- 무조건 값을 넣어야함
    var a= 10
    var b= 10.5  //double
    var c= 3.14f  //float
    var d= true
    var e= 'A'
    var f= "Hello"
    //자료형이 없는 것이 아니라 대입될때/값을 넣을 때 자료형이 결정됨!

    //변수이므로 값 변경이 가능
    a= 20
    b= 20.5
    println(a)
    println(b)
    println()

    //자료형이 있으므로 다른 자료형 대입 불가
    //a= 3.14  //ERROR! double 형은 int 에 넣을수 없다
    //b= 50    //ERROR! int 형을 double 형으로도 넣을 수 없다.- 자바와는 다르게 자동형변환 없음

    //그럼에도 자료형을 바꾸고 싶다면..
    //명시적 형변환 하는 방법 [ 앞에 형변환하는 (Int)문법 없음 : .toXXX()로 변환 ]
    a= 3.14.toInt()
    b= 50.toDouble()
    println(a)
    println(b)
    println()


    //자료형을 변수 선언시에 명시할 수도 있음
    var a2:Int= 10
    var b2:Double= 3.14
    var c2:Boolean     //자료형을 명시하면 초기화를 안해도됨.
    println(a2)
    println(b2)
    //println(c2)   //초기화가 없으면 에러- 사용도 안됨
    println()

    //좀 특별한 정수 표현식
    var a3= 10_000_000    // _ 자리수 표기법

    //화면 출력의 format 만들기
    println("이름" + "나이")
    //println(10 + "aaa")  //자바와는 다르게 정수형이 자동변환 String 으로 안됨
    println(10.toString() + "aaa")

    //위에가 정식방법인데 좀 불편하죠..
    println("aaa" + 10)   //순선적으로 문자열이 먼저 있으면 가능함!
    //10 aaa 를 쓰고싶다면..
    println(""+10+"aaa")

    //즉, 이런 특징으로 인해 정수 숫자 2개 덧셈 식 출력
    var num1= 50
    var num2= 30
    //println( num1 + "+" +num2 + "=" + (num1+num2) )  -에러! 숫자 + 문자열이 안됨
    println(num1.toString()+ "+" + num2.toString() + "=" + (num1+num2))
    //좀더 쉽게하려면
    println(""+num1 + "+" +num2 + "=" + (num1+num2))

    //위의 2가지 방법 모두 짜증!! [ 마치 php 처럼 ]
    println( " $num1 + $num2 = ${num1+num2} " )
    println()

    //종합하면
    var name= "sam"
    var age= 20
    println("이름 : $name \n나이 :$age")
    println()


    //Any 타입 자료형[ 타입이 없다는 표현식 ]
    var v: Any
    v= 10
    println(v)

    v= 10.5
    println(v)

    v= 'A'
    println(v)

    v= true
    println(v)

    v= "Hello"
    println(v)
    //가급적 Any 사용은 자제.. 자료형을 특정하기 어려울때만 사용! -나중에 자료형 구분이 어렵기때문
    println()




    //null 값에 대한 특이점
    var n= null
    println(n)

    //자료형을 명시하면 null 값 저장불가
    //var n2:Int = null   //ERROR - 고정값으로 int 로 주고 null 값을 주어도 에러가남- null 을 자료형으로 보기 때문
    //var s:String= null  //ERROR

    //null 저장도 가능하다는 명시적 표기 [? 를 넣으면 null 값도 가능한. 이라는 의미]
    var n3:Int? = null
    var s2:String? = null
    println(n3)
    println(s2)

    //상수 [변할수없는 값- CONST(C언어), Final(java 언어)]
    //M= 50  //ERROR
    val M= 10  //val= value

    //상수값 지정할 때 명시적 자료형을 사용하면
    val K:Int
    K=50




    //5. 연산자 특이점
    //숫자 타입간에는 자동형변환 됨 [ 작은값을 큰값으로 ]
    println( 10 + 3.14 )
    println()
    //숫자타입이 나닌 자료형과는 자동형변환 안됨
    //println(10+true) //ERROR
    //println(10+'A')  //ERROR

    //새로운 연산자 is (자료형 검사)
    var n4= 10
    if(n4 is Int){
        println("n4는 정수입니다.")
    }

    //다른자료형 검사는 에러
   /* if(n4 is String){
    }*/

    //의미없어 보이지만 유일하게 Any 타입일때..
    var obj:Any
    obj=10
    if(obj is Int) println(" $obj 는 Int ")
    if(obj is Double)  println( "$obj 는 Double" )

    //자바의 instanceof 처럼

    //사용자 정의 클래스
    class Person{
        //코틀린에서는 멤버변수를 '속성'[Property] 이라고 명명함
        //주의!!!! 프로퍼티는 반드시 초기화가 되어있어야함. -null 값을 가질 수 없기 때문
        var name= "sam"
        var age:Int= 20
    }

    var p= Person()    //new 키워드 없음  //객체 만드는 법
    if(p is Person){
        println( p.name + " " + p.age )
        println( "이름 : ${p.name} 나이 : ${p.age} " )
        println()
    }

    obj= Person()   //객체생성
    if(obj is Person){

    }




    //6. 제어문에서 특이한 점!!
    //var str= (10>5)? "aaa" : "bbb"    //삼항연산자가 없음
    //대신에 if 문이 삼항연산자 처럼
    var str= if(10>5) "aaa" else "bbb"
    println(str)

    str= if(10>5){
        "aaa"
        "kkk"    //여러줄 있으면 마지막 값이 들어감
    }else{
        "bbb"
    }
    println(str)

    //이런특징 때문에 if 문을 코틀린에서는 제어문이 아니라 if 표현식 이라고 부름

    //Switch 문법이 없어졌음.. break 도 쓰지않음 [ 비슷한 녀석이 있음! ]
    var h:Any?= null

    var n5=30

    h=35
    when(h){
        10-> println("aaa")
        20-> println("bbb")
        //자료형이 다른것도 동시 체크가능
        "hello" -> println("ccc")
        true-> println("ddd")
        //코틀린에서는 변수면으로 값 비교 가능
        n5-> println("eee")

        //2개 이상의 조건을 묶을 수도 있음
        40, 50-> println("fff")

        //그 밖의 상황 Default 같은 역할 [여러줄이면 중괄호안에 사용]
        else-> {
            println("ggg")
            println("hhh")
        }
    }

    //when 을 특정수식으로 제어 가능  [수식비교할때는 ()없어야함]
    h= 85
    when{
        h>=90 && h<=100 -> println("A학점")
        h>=80 -> println("B학점")
        h>=70 -> println("C학점")
        h>=60 -> println("D학점")
        else -> println("F학점")
    }


    //when 도 if 문처럼 변수에 저장 가능함  [반드시 else 도 사용해야함!]
    h=20
    var result= when(h){
        10->"Hello"
        20->"Nice"
        else-> "BAD"
    }
    println(result)

    //when 에서 is 연산자 사용가능
    when(h){
        is Int-> println("Int 타입입니다.")
        is Double-> println("Double 타입입니다.")
        is Person-> println("Person 타입입니다.")
        else-> println("아무타입도 아님")
    }
    println()

    //반복문도 변화
    //마치 for each 문과 비슷
    for(i in 0..5){
        println(i)
    }
    println()


    // i는 제어변수임 for 문의 '지역변수' -저 위에있는 a 아님
    for( a in 3..10 ){
        println(a)
    }
    println()


    //이 반복문을 마지막 숙자 전까지 하고싶다면
    for( i in 0 until 10 ){    //0~9 까지
        println(i)
    }
    println()


    //2씩 증가 (step)
    for( i in 0..10 step 2){   //2단계씩 거치기
        println(i)
    }
    println()


    //값의 감소
    for( i in 10 downTo 0){
        println(i)
    }
    println()

    //값을 2씩 감소 (downTo + step)
    for( i in 10 downTo 0 step 2){
        println(i)
    }
    println()






    //7. 배열 Array - 사용하는 법은 똑같은데 생성방법이 달라짐
    var arr= arrayOf(10,20,30)
    println(arr[0])
    println(arr[1])
    println(arr[2])
    //println(arr[3])   //실행중 예외 Exception 발생

    //값 변경도 특별할 것 없음
    arr[0]= 100
    println(arr[0])

    println()


    //배열의 특별한 점...
    //마치 ArrayList 처럼 get(), set() 메소드를 보유
    arr.set(1, 200)    //1번방에 200넣기/설정
    println(arr.get(0))
    println(arr.get(1))
    println(arr.get(2))
    println()

    //배열길이
    println("배열의 길이 ${arr.size}")   //size 로 통일(length 말고)

    //출력 반복문
    for( n in arr ){  //요소값들 반복
        println(n)
    }
    println()

    //반복문을 인덱스 값으로..
    for( i in arr.indices ){  //인덱스 번호로 나옴
        //println(i)
        println("" + i + ":" + arr[i])
    }
    println()


    //인덱스와 값을 같이 나오도록..
    for( (i,v) in arr.withIndex() ) {  //index 는 i , 값은 v (i, v 는 변수명임- 의미없음)
        println( " [$i] : $v " )
    }
    println()

    //배열값 넣을 때 자료형을 명시하지 않으면
    //자동 Any 타입
    var arr2= arrayOf(10, "Hello", 3.14)   //Any 타입이기 때문에 아무 자료형을 넣어도 됨
    //Any 타입이므로 다른 자료형 대입 가능
    arr2[1]= 20
    for (t in arr2){
        println(t)
    }
    println()

    //단, 배열에 타입지정도 가능함
    var arr3= arrayOf<Int>(10,20,30)

    //이렇게 타입을 지정하면 다른 자료형과 함께 사용불가
    //var arr4= arrayOf<Int>(10, "Hello")     //ERROR

    //명시적 배열을 만드는 다른 방법 -<Generic>말고..
    var arr5= intArrayOf(10,20,30)
    //var arr5= intArrayOf(10,20,true)   //ERROR
    var arr6= doubleArrayOf(3.14, 1.52)

    //Boolean 부터 Double 까지 기초자료형만 xxxArrayof()
    //주의!! String 은 없음-  기초자료형 아닌 자료형은 <Generic>이용

    //처음에 초기값없이 null 값으로 배열 만들기
    var arr7= arrayOfNulls<Any>(5)
    for (t in arr7){
        println(t)
    }
    println()


    //배열 변수를 상수로 만들기  *********
    val arr8= arrayOf(10,20,30)
    arr8[0]= 100  //값을 못바꾸는 것이 아님  **********
    //arr8= arrayOf(100,200,300)  //다른 배열참조 불가  **********

    //ArrayList 만들기  [ 배열요소의 추가,삭제 가능 ]
    val arrList= arrayListOf(10, "Hello", true)
    for (e in arrList){
        println(e)
    }
    println()


    //특정 위치에 추가하기
    arrList.add(0, "Nice")
    for (e in arrList){
        println(e)
    }
    println()


    //add 시킬때 주의할점! - 기존에 처음에 넣었던 자료형 외에는 추가 불가
    arrList.add(100)
    arrList.add(false)
    arrList.add("Good")
    //arrList.add(3.14)   //ERROR- 처음에 없었어서 에러


    //삭제하기
    arrList.removeAt(0)
    for (e in arrList){
        println(e)
    }
    println()


    //요소값 삭제
    arrList.remove(100)
    for (e in arrList){
        println(e)
    }
    println()


    //set, get 도 있음
    println("요소개수 : ${arrList.size}")
    arrList.set(0, 20)    //0번방에 20 넣기
    println("0번요소 값 : ${arrList.get(0)}")
    println()


    //2차원 배열
    val arrays= arrayOf( arrayOf(10,20,30), arrayOf("aa","bb"), arrayOf(true, false) )
    for (ar in arrays){
        for (e in ar){
            print(e)
            print(", ")
        }
        println()
    }
    println()





    //8. 함수
    //8.1) 가장기본함수 호출 (리턴 X, 파라미터 X)
    show()

    //8.2) 파라미터 전달하면서 함수호출
    output(100, "Hello")

    //8.3) 리턴받기
    var sum= add(5,3)
    println("sum : ${sum}")

    //8.4) **참고
    var x= display()
    println(x)



}//Main 함수

//8.1) 에서 호출하는 함수
//함수정의 시에는 무조건 fun 키워드 사용
fun show(){
    println("show function")
    println()
}


//8.2) 파라미터 전달 : 매개변수에는 var 키워드 사용금지 [ 변수명 : 자료형 ]
fun output( a:Int, b:String ){
    println(a)
    println(b)
    println()
}


//8.3) 리턴하기 [리턴타입을 함수() 다음에 { 사이에 : 하고 작성 } ]
fun add( x:Int, y:Int ):Int{   //함수명 : 자료형  //리턴타입 Int
    return x+y
}


//8.4) **참고 [리턴타입이 없으면 void 가 아니라 Unit 타입]
fun display(){
    println("display")
}
