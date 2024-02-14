package com.lakshaykamat.quixApplication

import com.lakshaykamat.quixApplication.data.models.Question
import com.lakshaykamat.quixApplication.data.models.Question.Options
import com.lakshaykamat.quixApplication.data.models.QuestionCategory
import com.lakshaykamat.quixApplication.data.local.quizData
import junit.framework.TestCase.assertTrue
import org.junit.Test

class QuizLocalDataTest {
    private val allQuizList: List<Question> = quizData.values.flatMap { it.questionList }
    @Test
    fun `Only have to 4 Options Test`() {
        allQuizList.forEachIndexed { _, quiz ->
            assertTrue(
                showErrorMessage("There should be only 4 options",quiz),
                quiz.options.size == 4
            )
        }
    }
    @Test
    fun `Only one option is set to true`() {
        allQuizList.forEachIndexed { _, quiz ->
            val correctOptions = quiz.options.filter { it.isRight }
            assertTrue(
                showErrorMessage("There should be exactly one option with isRight = true",quiz),
                correctOptions.size == 1
            )
        }
    }

    @Test
    fun `Test hain bhai`(){
        quizData.entries.forEach {quiz->
            val category = quiz.key

            //Compare Question Map category is always same for question category
            //print(quiz.value.category == category)
            var count = 0
            quiz.value.questionList.forEach {question ->
                count++
                println(question)
            }
            println(count)
        }
    }

    private fun showErrorMessage(message:String,quiz:Question):String{
        val questionName = quiz.question
        val questionCategory = quiz.category
        return "$message \n\nError in Category: $questionCategory \n Name:$questionName"

    }
    private fun getSampleQuizList(): List<Question> {
        return listOf(
            Question(
                question = "Question 1",
                options = listOf(
                    Options(text = "Option A", isRight = true),
                    Options(text = "Option B", isRight = false),
                    Options(text = "Option C", isRight = false),
                    Options(text = "Option D", isRight = false)
                ),
                category = QuestionCategory.General
            ),
            // Add more sample quiz questions as needed
        )
    }
}