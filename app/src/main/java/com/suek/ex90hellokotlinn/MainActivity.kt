package com.suek.ex90hellokotlinn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*   //activity_main 안에있는 모든 * 뷰들을 참조변수가 다 만들어짐.(ex: findViewByID..)

class MainActivity : AppCompatActivity() {      //extends 대신에 :

    override fun onCreate(savedInstanceState: Bundle?) { //리턴타입 없음    //변수명 : 자료형
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickBtn(view: View) {     //리턴타입- fun  //view 참조변수 : View 자료형
        //xml 에서 뷰에 지정한 id를 변수명으로 사용!
        //주의 : import kotlinx.android.synthetic.main.activity_main.* 가 되어있어야 함.

        tv.setText("Nice to meet you Kotlin")
    }


    //오버라이드 메소드는 반드시 fun 앞에 'override' 키워드와 있어야 함.
    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }
}
