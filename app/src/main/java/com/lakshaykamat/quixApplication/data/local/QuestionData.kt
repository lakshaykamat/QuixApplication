package com.lakshaykamat.quixApplication.data.local

enum class Question {
    General,
    TechAndProgramming,
}

val quizData = mapOf(
    Question.General to generalQuestionsData,
    Question.TechAndProgramming to techAndProgrammingQuestionsData
)
