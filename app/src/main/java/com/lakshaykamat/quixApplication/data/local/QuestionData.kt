package com.lakshaykamat.quixApplication.data.local

import com.lakshaykamat.quixApplication.data.models.QuestionCategory
import com.lakshaykamat.quixApplication.data.models.Quiz


val quizData = mapOf(
    QuestionCategory.General to Quiz(
        questionList = generalQuestionsData,
        category = QuestionCategory.General,
    ),
    QuestionCategory.TechAndProgramming to Quiz(
        questionList = techAndProgrammingQuestionsData,
        category = QuestionCategory.TechAndProgramming
    ),
    QuestionCategory.Entertainment to Quiz(
        questionList = entertainmentQuestionsData,
        category = QuestionCategory.Entertainment
    ),
    QuestionCategory.GeneralKnowledge to Quiz(
        questionList = gkQuestionsData,
        category = QuestionCategory.GeneralKnowledge
    ),
    QuestionCategory.History to Quiz(
        questionList = historyQuestionsData,
        category = QuestionCategory.History
    ),
    QuestionCategory.Music to Quiz(
        questionList = musicQuestionsData,
        category = QuestionCategory.Music
    ),
    QuestionCategory.Religion to Quiz(
        questionList = religionQuestionsData,
        category = QuestionCategory.Religion
    ),
    QuestionCategory.Sport to Quiz(
        questionList = sportsQuestionsData,
        category = QuestionCategory.Sport
    ),
)
