package com.uzzal.helloworldkotlin1

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var listner  : View.OnClickListener = View.OnClickListener { v ->

            var tv :TextView = findViewById<TextView>(R.id.textView_id);
            var bt: Button = v as Button

            when(bt.id){

                R.id.button1 -> tv.text = "Button 1"
                R.id.button2 -> tv.text = "Button 2"
                R.id.button3 -> tv.setText("Button 3")


                else ->{

                    tv.text = "Your Lost"
                }
            }



        }




       /*  statement of if else  in kotlin

       var listner : View.OnClickListener = View.OnClickListener { v ->

            var tv = findViewById<TextView>(R.id.textView_id);
            var button:Button = v as Button



            if(button.id == R.id.button1){

                tv.setText("Click")
            }
            else if(v.id == R.id.button2){

                tv.setText("OnClick")

            }
            else if(v.id == R.id.button3){

                tv.setText("ha ha ")
            }

            else if(v.id == R.id.button4){

                tv.setText("la la ")
            }



        } */


       var btn1  = findViewById<Button>(R.id.button1)
       var btn2  = findViewById<Button>(R.id.button2)
       var btn3  = findViewById<Button>(R.id.button3)
       var btn4  = findViewById<Button>(R.id.button4)

        btn1.setOnClickListener  (listner)
        btn2.setOnClickListener  (listner)
        btn3.setOnClickListener  (listner)
        btn4.setOnClickListener  (listner)


















    }
}
