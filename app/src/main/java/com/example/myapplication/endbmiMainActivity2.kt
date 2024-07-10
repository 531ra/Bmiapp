package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class endbmiMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "i am created", Toast.LENGTH_SHORT).show()
        enableEdgeToEdge()
        setContentView(R.layout.activity_endbmi_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fun show(){

            Toast.makeText(this, " please enter height or weight ", Toast.LENGTH_SHORT).show()
        }



        val w:EditText=findViewById(R.id.weight1)
        val h:EditText=findViewById(R.id.heigth1)
        val but:AppCompatButton=findViewById(R.id.click1)

        val Answer:TextView=findViewById(R.id.ans1)




      but.setOnClickListener()  {
          val weight=w.text.toString().toDoubleOrNull()
          val heigth=h.text.toString().toDoubleOrNull()
            if (weight != null && heigth != null&&heigth>0) {
                val result = calculate(weight, heigth)
                 val category=cat(result)

                changecolor(result,Answer)
                Answer.text = "  % $result  " +category


            } else {
                show()
            }


        }
    }

    fun calculate(a:Double,b:Double):Double{


        return (a)/(b*b*0.305*0.305)
    }
fun changecolor(a:Double,Answer:TextView){


    when{
        a<18.5-> Answer.setBackgroundColor(Color.YELLOW)
         a in 18.5..25.0 -> Answer.setBackgroundColor(Color.GREEN)

        a in 25.0..30.0-> Answer.setBackgroundColor(Color.RED)
        a  >30.0 ->Answer.setBackgroundColor(Color.BLACK)

    }



}
fun cat(result:Double):String{

    val cate=when{
        result<18.5-> "Bhagwan ka liya kuch kha liya kr"
        result in 18.5..25.0 -> "tu fit hn"

        result in 25.0..30.0-> "exercise krle bhai"
        result >30.0 -> "tu to bhagwan bhrose jee"
        else-> "hello"

    }
    return cate


}

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "i am start", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "i am restart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "i am resume", Toast.LENGTH_SHORT).show()
    }

}