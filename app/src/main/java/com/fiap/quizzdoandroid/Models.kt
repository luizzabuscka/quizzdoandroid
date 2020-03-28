package com.fiap.quizzdoandroid

data class Answer(
    val title: String,
    val correct: Boolean
)

data class Question(
    val title: String,
    val answers: List<Answer>
)
