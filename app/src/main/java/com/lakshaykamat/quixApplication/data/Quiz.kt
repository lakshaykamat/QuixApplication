package com.lakshaykamat.quixApplication.data

data class Options(val text: String, val isRight: Boolean)
data class Quiz(val question: String, val options: List<Options>)
