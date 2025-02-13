package edu.msudenver.cs3013.textinputbutton

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var inbutton = findViewById<Button>(R.id.inbutton)
        inbutton.setOnClickListener{

            Toast.makeText(this, "Button Pressed", Toast.LENGTH_SHORT).show()
            var intext = findViewById<EditText>(R.id.inputText)
            var s = intext.getText().toString()
            Toast.makeText(this, "Got Data: " + s, Toast.LENGTH_SHORT).show()
            var outtext = findViewById<TextView>(R.id.outputText)
            outtext.setText("You typed: " + s)
        }
    }
}