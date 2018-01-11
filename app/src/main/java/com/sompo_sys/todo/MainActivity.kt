package com.sompo_sys.todo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.io.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val file = File("$filesDir/journal.txt")
            val filereader = FileReader(file)
            var rd: String = filereader.readText()
            while (rd != "") {
                rd = filereader.readText()
            }


        val addBtn = findViewById<Button>(R.id.button)

        addBtn.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }





    }
}
