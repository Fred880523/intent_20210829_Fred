package com.neppplus.intent_20210829_fred

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        otherActivityTxt.setOnClickListener {

            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

            //지금 보고있는 화면을 종료처리

            finish()

        }


    }
}