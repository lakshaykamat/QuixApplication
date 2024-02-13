package com.lakshaykamat.quixApplication

import com.lakshaykamat.quixApplication.data.Options
import com.lakshaykamat.quixApplication.data.Quiz
import com.lakshaykamat.quixApplication.data.local.Question
import com.lakshaykamat.quixApplication.data.local.generalQuestionsData
import com.lakshaykamat.quixApplication.data.local.quizData
import com.lakshaykamat.quixApplication.data.local.techAndProgrammingQuestionsData
import junit.framework.TestCase.assertTrue
import org.junit.Test

class QuizDataTest {
    @Test
    fun testIsRightOption() {
        val quizList = mutableListOf<Quiz>()
        quizList.addAll(generalQuestionsData)
        quizList.addAll(techAndProgrammingQuestionsData)

        quizList.forEachIndexed { index, quiz ->
            val correctOptions = quiz.options.filter { it.isRight }

            assertTrue(
                "There should be only 4 options Error in:${quiz.question}",
                quiz.options.size==4
            )

            assertTrue(
                "There should be exactly one option with isRight = true in Quiz Question ${quiz.question}",
                correctOptions.size == 1
            )
        }
    }

    private fun getSampleQuizList(): List<Quiz> {
        return listOf(
            Quiz(
                question = "Question 1",
                options = listOf(
                    Options(text = "Option A", isRight = true),
                    Options(text = "Option B", isRight = false),
                    Options(text = "Option C", isRight = false),
                    Options(text = "Option D", isRight = false)
                )
            ),
            // Add more sample quiz questions as needed
        )
    }
}