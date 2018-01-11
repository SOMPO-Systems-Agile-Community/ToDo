package com.sompo_sys.todo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

/**
 * Created by agile03 on 2018/01/11.
 */
class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)


        val backBtn = findViewById<Button>(R.id.button2)

        backBtn.setOnClickListener {
            finish()
        }


    }
}