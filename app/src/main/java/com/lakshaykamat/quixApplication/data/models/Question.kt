package com.lakshaykamat.quixApplication.data.models

data class Question(val question: String, val options: List<Options>, val category: QuestionCategory) {
    data class Options(val text: String, val isRight: Boolean)
}
