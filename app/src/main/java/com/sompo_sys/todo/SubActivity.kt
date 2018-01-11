package com.sompo_sys.todo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_sub.*
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.PrintWriter

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

        val registBtn = findViewById<Button>(R.id.buttonRegist)

        registBtn.setOnClickListener {
            val fil = FileWriter("$filesDir/journal.txt")
            val pw = PrintWriter(BufferedWriter(fil))

            pw.println(editText.text)
            pw.close()
            editText.text.clear()
        }

    }
}