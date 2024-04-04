package com.st101454156.historyapp
//FEZOKUHLE NJABULO CELE ST10454156
//https://www.geeksforgeeks.org/kotlin-if-else-expression/?ref=lbp
//https://www.geeksforgeeks.org/kotlin-when-expression/?ref=lbp


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // declare variables
    private lateinit var clearButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var searchButton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize
        clearButton= findViewById(R.id.clearbutton)
        searchButton= findViewById(R.id.searchButton)
        ageInput= findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)


        searchButton.setOnClickListener {
            // create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            // if age is not full and age is in range between 20 and 100
            if (age != null && age in 20..100){
                // when age is 30 display Steve Biko else when is .. and so on
                val HistorianName = when (age){
                    30 -> "Steve Biko. He was an anti-apartheid activist in South Africa in the 1960s and 1970s, and the founder of the Black Consciousness Movement."
                    52 -> "William Shakespeare. He was an English playwright,poet and actor.He is regarded the greatest writer in the English Language."
                    44 -> "Pablo Escobar.A Colombian drug lord who was one of the wealthiest criminals in history."
                    76 -> "Albert Einstein. A German theoretical physicist who is regarded as the most influential scientist of all time."
                    56 -> "Adolf Hitler. An Austrian born German politician who was the dictator of Nazi Germany from 1933 until his suicide in 1945."
                    82 -> "Neil Armstrong. An American astronaut and aeronautical engineer who in 1969 became the first person to walk on the moon."
                    39 -> "Martin Luther King. An American activist who was one of the most prominent leaders in civil rights movement fro 1955 until his assassination in 1968. "
                    95 -> "Mangosuthu Buthelezi. He was the Zulu prince who served as the traditional prime minister to the Zulu family from 1954 until his passing in 2023."
                    57 -> "Jan Anthony Van Riebeeck. A Dutch colonial administrator who founded Cape Town in 1652 and thus opened Southern Africa for white settlement."
                    92 -> "Albertina Nontsikelelo Sisulu. The only woman present at the birth of the ANC Youth League and became a member of the executive of the Federation of South African women in 1954."
                    else -> null
                }

            val message = if (HistorianName != null) "The Historian's name is $HistorianName."
                else "No Historian found with the entered age."
                resultTextView.text = message


            }else {
                resultTextView.text = "Invalid input. Please enter a valuid age between 20 and 100."
            }


        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}