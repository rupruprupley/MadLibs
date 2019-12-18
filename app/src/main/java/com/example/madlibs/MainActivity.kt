
package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.animals)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        val animals = findViewById<EditText>(R.id.animals)
        val fruit = findViewById<EditText>(R.id.fruit)
        val toys = findViewById<EditText>(R.id.toys)
        val crisis = findViewById<EditText>(R.id.crisis)
        val dictator = findViewById<EditText>(R.id.dictator)
        val insult = findViewById<EditText>(R.id.insult)
        val bbq = findViewById<EditText>(R.id.bbq)
        val organ = findViewById<EditText>(R.id.organ)
        val store = findViewById<EditText>(R.id.store)
        val pasta = findViewById<EditText>(R.id.pasta)
        startActivity(intent)
    }
}
