package com.example.madlibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Get the Intent that started this activity and extract the string
        val message1 = intent.getStringExtra(EXTRA_MESSAGE)
        val message2 = intent.getStringExtra(EXTRA_MESSAGE)
        val message3 = intent.getStringExtra(EXTRA_MESSAGE)
        val message4 = intent.getStringExtra(EXTRA_MESSAGE)
        val message5 = intent.getStringExtra(EXTRA_MESSAGE)
        val message6 = intent.getStringExtra(EXTRA_MESSAGE)
        val message7 = intent.getStringExtra(EXTRA_MESSAGE)
        val message8 = intent.getStringExtra(EXTRA_MESSAGE)
        val message9 = intent.getStringExtra(EXTRA_MESSAGE)
        val message10 = intent.getStringExtra(EXTRA_MESSAGE)


        // Capture the layout's TextView and set the string as its text
        val one = findViewById<TextView>(R.id.animals).apply {
            text = message1
        }
        val two = findViewById<TextView>(R.id.fruit).apply {
            text = message2
        }
        val three = findViewById<TextView>(R.id.toys).apply {
            text = message3
        }
        val four = findViewById<TextView>(R.id.crisis).apply {
            text = message4
        }
        val five = findViewById<TextView>(R.id.dictator).apply {
            text = message5
        }
        val six = findViewById<TextView>(R.id.insult).apply {
            text = message6
        }
        val seven = findViewById<TextView>(R.id.bbq).apply {
            text = message7
        }
        val eight = findViewById<TextView>(R.id.organ).apply {
            text = message8
        }
        val nine = findViewById<TextView>(R.id.store).apply {
            text = message9
        }
        val ten = findViewById<TextView>(R.id.pasta).apply {
            text = message10
        }
       // val one = findViewById<TextView>(R.id.animals)
 //       val two = findViewById<TextView>(R.id.fruit)
   //     val three = findViewById<TextView>(R.id.toys)
     //   val four = findViewById<TextView>(R.id.crisis)
       // val five = findViewById<TextView>(R.id.dictator)
//        val six = findViewById<TextView>(R.id.insult)
  //      val seven = findViewById<TextView>(R.id.bbq)
    //    val eight = findViewById<TextView>(R.id.organ)
      //  val nine = findViewById<TextView>(R.id.store)
        //val ten = findViewById<TextView>(R.id.pasta)
    }
}
