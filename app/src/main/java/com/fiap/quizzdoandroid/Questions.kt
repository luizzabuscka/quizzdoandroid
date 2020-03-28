package com.fiap.quizzdoandroid

object Questions {

    val questions = mutableListOf(
        Question(
            "Quais as linguagens de programação nativas para Android?",
            listOf(
                Answer("C# e ASP", false),
                Answer("HTML e Javascript", false),
                Answer("Kotlin e Swift", false),
                Answer("Java e Koltin", true)
            )
        ),
        Question(
            "Como é chamado um campo de texto no Android?",
            listOf(
                Answer("TextField", false),
                Answer("Select", false),
                Answer("EditText", true),
                Answer("WriteField", false)
            )
        ),
        Question(
            "Quem é a empresa dona do Android?",
            listOf(
                Answer("Apple", false),
                Answer("Google", true),
                Answer("O Android não tem dono", false),
                Answer("Facebook", false)
            )
        ),
        Question(
            "Qual foi o nome do primeiro celular lançado com Android?",
            listOf(
                Answer("HTC Dream", true),
                Answer("Moto G", false),
                Answer("HiPhone", false),
                Answer("Nexus", false)
            )
        ),
        Question(
            "Qual o nome do cara que inventou o Android?",
            listOf(
                Answer("Larry Page", false),
                Answer("Steve Jobs", false),
                Answer("Mark Zuckerberg", false),
                Answer("Andy Rubin", true)
            )
        )
    )

}