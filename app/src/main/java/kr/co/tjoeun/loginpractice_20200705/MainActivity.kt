package kr.co.tjoeun.loginpractice_20200705

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

//            이메일 / PW 입력값 받아오기
            val email = emailEdt.text.toString()
            val pw = pwEdt.text.toString()

//            if문으로 확인.
            if (email == "admin@test.com" && pw == "qwer1234") {
                Toast.makeText(this, "관리자 입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }

        }

    }
}