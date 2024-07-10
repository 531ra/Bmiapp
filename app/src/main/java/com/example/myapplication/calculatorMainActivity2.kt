package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class calculatorMainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText1:EditText=findViewById(R.id.enter)
        val edittext2:EditText=findViewById(R.id.enter1)
        val buttonadd:Button=findViewById(R.id.add)
        val buttonsub:Button=findViewById(R.id.sub)
        val buttonmult:Button=findViewById(R.id.mult)
        val buttondiv:Button=findViewById(R.id.div)
        val textans:TextView=findViewById(R.id.ans)



     fun showToast(){

            Toast.makeText(this, "please enter valid number", Toast.LENGTH_SHORT).show()
        }


        buttonadd.setOnClickListener{
val n1=editText1.text.toString().toDoubleOrNull()

            val n2=edittext2.text.toString().toDoubleOrNull()
            if(n1!=null &&n2!=null){
                val result=n1+n2
                textans.text="result: $result"

            }
            else{
                showToast()
            }



        }
        buttonsub.setOnClickListener{
            val n1=editText1.text.toString().toDoubleOrNull()

            val n2=edittext2.text.toString().toDoubleOrNull()
            if(n1!=null &&n2!=null){
                val result=n1-n2
                textans.text="result: $result"

            }
            else{
                showToast()
            }



        }
        buttonmult.setOnClickListener{
            val n1=editText1.text.toString().toDoubleOrNull()

            val n2=edittext2.text.toString().toDoubleOrNull()
            if(n1!=null &&n2!=null){
                val result=n1*n2
                textans.text="result: $result"

            }
            else{
                showToast()
            }



        }


        buttondiv.setOnClickListener{
            val n1=editText1.text.toString().toDoubleOrNull()

            val n2=edittext2.text.toString().toDoubleOrNull()

            if(n1!=null &&n2!=null){
             if(n2!=0.0)   {
                    val result = n1/ n2
                    textans.text = "result: $result"
                }
                else{
                 Toast.makeText(this, "zero can be used as a divisor", Toast.LENGTH_SHORT).show()

             }

            }
            else{
                showToast()
            }



        }




    }
}