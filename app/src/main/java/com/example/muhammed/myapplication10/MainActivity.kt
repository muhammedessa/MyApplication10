package com.example.muhammed.myapplication10

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var cbox : CheckBox
    lateinit var cbox2 : CheckBox
    lateinit var cbox3 : CheckBox
    lateinit var textView : TextView
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cbox = findViewById(R.id.chbox)
        cbox2 = findViewById(R.id.checkBox2)
        cbox3 = findViewById(R.id.checkBox3)
        textView = findViewById(R.id.textView)
        btn =   findViewById(R.id.button)

        btn.setOnClickListener {

            var myResult = ""

            if (cbox.isChecked){
                myResult += "apple "
            }
            if (cbox2.isChecked){
                myResult += " banana "
            }
            if (cbox3.isChecked){
                myResult += " orange "
            }

            textView.text = myResult
            Toast.makeText(this,"you checked : "+myResult,Toast.LENGTH_LONG ).show()
        }

    }
}
