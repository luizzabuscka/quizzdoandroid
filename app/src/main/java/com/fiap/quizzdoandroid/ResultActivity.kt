package com.fiap.quizzdoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score = intent.extras?.getInt("score")!!
        val totalQuestions = intent.extras?.getInt("total_questions")!!

        tvResult.text = String.format(getString(R.string.text_result), score, totalQuestions )

        btRestart.setOnClickListener {
            finish()
        }
    }
}
