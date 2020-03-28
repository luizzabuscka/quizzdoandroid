package com.fiap.quizzdoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fiap.quizzdoandroid.Questions.questions
import kotlinx.android.synthetic.main.activity_quizz.*

class QuizzActivity : AppCompatActivity() {


    var position = 0
    var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizz)

        configButtons()
        startQuizz()
    }

    private fun configButtons() {
        btAlt1.setOnClickListener {
            answerClicked(questions[position].answers[0])
        }

        btAlt2.setOnClickListener {
            answerClicked(questions[position].answers[1])
        }

        btAlt3.setOnClickListener {
            answerClicked(questions[position].answers[2])
        }

        btAlt4.setOnClickListener {
            answerClicked(questions[position].answers[3])
        }
    }

    private fun answerClicked(answer: Answer) {
        if (answer.correct) {
            score++
        }

        position++

        if (position == questions.size) {
            finishQuizz()
        } else {
            configQuestion()
        }

    }

    private fun finishQuizz() {
        val intent = Intent(this@QuizzActivity, ResultActivity::class.java)
        intent.putExtra("score", score)
        intent.putExtra("total_questions", questions.size)
        startActivity(intent)
        finish()
    }

    private fun startQuizz() {
        position = 0
        score = 0
        questions.shuffle()
        configQuestion()
    }

    private fun configQuestion() {
        tvQuestion.text = questions[position].title
        btAlt1.text = questions[position].answers[0].title
        btAlt2.text = questions[position].answers[1].title
        btAlt3.text = questions[position].answers[2].title
        btAlt4.text = questions[position].answers[3].title
    }
}
