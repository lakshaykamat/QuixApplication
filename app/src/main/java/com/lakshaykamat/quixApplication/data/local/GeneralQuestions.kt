package com.lakshaykamat.quixApplication.data.local

import com.lakshaykamat.quixApplication.data.models.Question.Options
import com.lakshaykamat.quixApplication.data.models.Question
import com.lakshaykamat.quixApplication.data.models.QuestionCategory

val generalQuestionsData = listOf(
    Question(
        question = "What is the capital of Japan?",
        options = listOf(
            Options(text = "Seoul", isRight = false),
            Options(text = "Beijing", isRight = false),
            Options(text = "Tokyo", isRight = true),
            Options(text = "Bangkok", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who wrote 'Romeo and Juliet'?",
        options = listOf(
            Options(text = "Charles Dickens", isRight = false),
            Options(text = "William Shakespeare", isRight = true),
            Options(text = "Jane Austen", isRight = false),
            Options(text = "Mark Twain", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "In which year did World War II end?",
        options = listOf(
            Options(text = "1945", isRight = true),
            Options(text = "1939", isRight = false),
            Options(text = "1950", isRight = false),
            Options(text = "1918", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the largest ocean on Earth?",
        options = listOf(
            Options(text = "Indian Ocean", isRight = false),
            Options(text = "Atlantic Ocean", isRight = false),
            Options(text = "Arctic Ocean", isRight = false),
            Options(text = "Pacific Ocean", isRight = true)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who painted the Mona Lisa?",
        options = listOf(
            Options(text = "Vincent van Gogh", isRight = false),
            Options(text = "Pablo Picasso", isRight = false),
            Options(text = "Leonardo da Vinci", isRight = true),
            Options(text = "Claude Monet", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the largest desert in the world?",
        options = listOf(
            Options(text = "Gobi Desert", isRight = false),
            Options(text = "Sahara Desert", isRight = true),
            Options(text = "Antarctica", isRight = false),
            Options(text = "Arabian Desert", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which element has the chemical symbol 'O'?",
        options = listOf(
            Options(text = "Osmium", isRight = false),
            Options(text = "Oxygen", isRight = true),
            Options(text = "Gold", isRight = false),
            Options(text = "Lead", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the currency of Brazil?",
        options = listOf(
            Options(text = "Peso", isRight = false),
            Options(text = "Real", isRight = true),
            Options(text = "Dollar", isRight = false),
            Options(text = "Euro", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who wrote 'To Kill a Mockingbird'?",
        options = listOf(
            Options(text = "Harper Lee", isRight = true),
            Options(text = "J.K. Rowling", isRight = false),
            Options(text = "George Orwell", isRight = false),
            Options(text = "Ernest Hemingway", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which planet is known as the 'Red Planet'?",
        options = listOf(
            Options(text = "Venus", isRight = false),
            Options(text = "Mars", isRight = true),
            Options(text = "Jupiter", isRight = false),
            Options(text = "Saturn", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the longest river in the world?",
        options = listOf(
            Options(text = "Nile", isRight = false),
            Options(text = "Amazon", isRight = true),
            Options(text = "Yangtze", isRight = false),
            Options(text = "Mississippi", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who developed the theory of relativity?",
        options = listOf(
            Options(text = "Isaac Newton", isRight = false),
            Options(text = "Galileo Galilei", isRight = false),
            Options(text = "Albert Einstein", isRight = true),
            Options(text = "Niels Bohr", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the smallest prime number?",
        options = listOf(
            Options(text = "2", isRight = false),
            Options(text = "1", isRight = false),
            Options(text = "3", isRight = true),
            Options(text = "5", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which country is known as the 'Land of the Rising Sun'?",
        options = listOf(
            Options(text = "China", isRight = false),
            Options(text = "Japan", isRight = true),
            Options(text = "South Korea", isRight = false),
            Options(text = "Thailand", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who painted 'Starry Night'?",
        options = listOf(
            Options(text = "Claude Monet", isRight = false),
            Options(text = "Vincent van Gogh", isRight = true),
            Options(text = "Pablo Picasso", isRight = false),
            Options(text = "Leonardo da Vinci", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the capital of Australia?",
        options = listOf(
            Options(text = "Sydney", isRight = false),
            Options(text = "Melbourne", isRight = false),
            Options(text = "Canberra", isRight = true),
            Options(text = "Brisbane", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who wrote 'The Great Gatsby'?",
        options = listOf(
            Options(text = "F. Scott Fitzgerald", isRight = true),
            Options(text = "Charles Dickens", isRight = false),
            Options(text = "Jane Austen", isRight = false),
            Options(text = "Mark Twain", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "In which year did the Titanic sink?",
        options = listOf(
            Options(text = "1912", isRight = true),
            Options(text = "1920", isRight = false),
            Options(text = "1905", isRight = false),
            Options(text = "1931", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the largest mammal in the world?",
        options = listOf(
            Options(text = "Elephant", isRight = false),
            Options(text = "Blue Whale", isRight = true),
            Options(text = "Giraffe", isRight = false),
            Options(text = "Hippopotamus", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who wrote '1984'?",
        options = listOf(
            Options(text = "George Orwell", isRight = true),
            Options(text = "Aldous Huxley", isRight = false),
            Options(text = "Ray Bradbury", isRight = false),
            Options(text = "J.K. Rowling", isRight = false)
        ),        category= QuestionCategory.General

    ),
    Question(
        question = "What is the largest bird in the world?",
        options = listOf(
            Options(text = "Ostrich", isRight = true),
            Options(text = "Eagle", isRight = false),
            Options(text = "Penguin", isRight = false),
            Options(text = "Albatross", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who painted 'The Last Supper'?",
        options = listOf(
            Options(text = "Michelangelo", isRight = false),
            Options(text = "Vincent van Gogh", isRight = false),
            Options(text = "Leonardo da Vinci", isRight = true),
            Options(text = "Pablo Picasso", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which country is known as the 'Land of the Pharaohs'?",
        options = listOf(
            Options(text = "Greece", isRight = false),
            Options(text = "Italy", isRight = false),
            Options(text = "Egypt", isRight = true),
            Options(text = "Mexico", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who wrote 'The Odyssey'?",
        options = listOf(
            Options(text = "Homer", isRight = true),
            Options(text = "Virgil", isRight = false),
            Options(text = "Sophocles", isRight = false),
            Options(text = "Plato", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "In which year did the Berlin Wall fall?",
        options = listOf(
            Options(text = "1989", isRight = true),
            Options(text = "1971", isRight = false),
            Options(text = "1995", isRight = false),
            Options(text = "2001", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the chemical symbol for gold?",
        options = listOf(
            Options(text = "Au", isRight = true),
            Options(text = "Ag", isRight = false),
            Options(text = "Fe", isRight = false),
            Options(text = "Cu", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who was the first woman to win a Nobel Prize?",
        options = listOf(
            Options(text = "Marie Curie", isRight = true),
            Options(text = "Rosalind Franklin", isRight = false),
            Options(text = "Dorothy Crowfoot Hodgkin", isRight = false),
            Options(text = "Jane Goodall", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which element is the most abundant in Earth's crust?",
        options = listOf(
            Options(text = "Iron", isRight = false),
            Options(text = "Aluminum", isRight = true),
            Options(text = "Silicon", isRight = false),
            Options(text = "Calcium", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who is known as the 'Father of Physics'?",
        options = listOf(
            Options(text = "Isaac Newton", isRight = false),
            Options(text = "Galileo Galilei", isRight = true),
            Options(text = "Albert Einstein", isRight = false),
            Options(text = "Niels Bohr", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the largest living species of big cat?",
        options = listOf(
            Options(text = "Lion", isRight = false),
            Options(text = "Leopard", isRight = false),
            Options(text = "Jaguar", isRight = false),
            Options(text = "Tiger", isRight = true)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which novel features the character Sherlock Holmes?",
        options = listOf(
            Options(text = "Pride and Prejudice", isRight = false),
            Options(text = "Dracula", isRight = false),
            Options(text = "Crime and Punishment", isRight = false),
            Options(text = "A Study in Scarlet", isRight = true)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who is the Greek god of the sea?",
        options = listOf(
            Options(text = "Zeus", isRight = false),
            Options(text = "Poseidon", isRight = true),
            Options(text = "Apollo", isRight = false),
            Options(text = "Hades", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the largest planet in our solar system?",
        options = listOf(
            Options(text = "Venus", isRight = false),
            Options(text = "Earth", isRight = false),
            Options(text = "Jupiter", isRight = true),
            Options(text = "Saturn", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which famous scientist developed the theory of general relativity?",
        options = listOf(
            Options(text = "Isaac Newton", isRight = false),
            Options(text = "Galileo Galilei", isRight = false),
            Options(text = "Albert Einstein", isRight = true),
            Options(text = "Niels Bohr", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the world's largest ocean?",
        options = listOf(
            Options(text = "Indian Ocean", isRight = false),
            Options(text = "Atlantic Ocean", isRight = false),
            Options(text = "Arctic Ocean", isRight = false),
            Options(text = "Pacific Ocean", isRight = true)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who painted 'The Starry Night'?",
        options = listOf(
            Options(text = "Claude Monet", isRight = false),
            Options(text = "Vincent van Gogh", isRight = true),
            Options(text = "Pablo Picasso", isRight = false),
            Options(text = "Leonardo da Vinci", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "In which country is the Taj Mahal located?",
        options = listOf(
            Options(text = "India", isRight = true),
            Options(text = "China", isRight = false),
            Options(text = "Egypt", isRight = false),
            Options(text = "Brazil", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the main ingredient in guacamole?",
        options = listOf(
            Options(text = "Tomato", isRight = false),
            Options(text = "Avocado", isRight = true),
            Options(text = "Onion", isRight = false),
            Options(text = "Lemon", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the capital of Canada?",
        options = listOf(
            Options(text = "Ottawa", isRight = true),
            Options(text = "Toronto", isRight = false),
            Options(text = "Vancouver", isRight = false),
            Options(text = "Montreal", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who wrote 'The Catcher in the Rye'?",
        options = listOf(
            Options(text = "J.D. Salinger", isRight = true),
            Options(text = "F. Scott Fitzgerald", isRight = false),
            Options(text = "George Orwell", isRight = false),
            Options(text = "Ernest Hemingway", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "In which year did the United States declare its independence?",
        options = listOf(
            Options(text = "1776", isRight = true),
            Options(text = "1789", isRight = false),
            Options(text = "1801", isRight = false),
            Options(text = "1850", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the square root of 144?",
        options = listOf(
            Options(text = "10", isRight = false),
            Options(text = "12", isRight = true),
            Options(text = "14", isRight = false),
            Options(text = "16", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who is known as the 'Father of Computer Science'?",
        options = listOf(
            Options(text = "Alan Turing", isRight = true),
            Options(text = "Charles Babbage", isRight = false),
            Options(text = "Ada Lovelace", isRight = false),
            Options(text = "Bill Gates", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which continent is known as the 'Land Down Under'?",
        options = listOf(
            Options(text = "Europe", isRight = false),
            Options(text = "Asia", isRight = false),
            Options(text = "Australia", isRight = true),
            Options(text = "South America", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who painted the famous painting 'The Persistence of Memory'?",
        options = listOf(
            Options(text = "Pablo Picasso", isRight = false),
            Options(text = "Vincent van Gogh", isRight = false),
            Options(text = "Salvador Dalí", isRight = true),
            Options(text = "Leonardo da Vinci", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the largest mammal on land?",
        options = listOf(
            Options(text = "Elephant", isRight = true),
            Options(text = "Rhino", isRight = false),
            Options(text = "Giraffe", isRight = false),
            Options(text = "Hippopotamus", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which planet is known as the 'Morning Star' or 'Evening Star'?",
        options = listOf(
            Options(text = "Venus", isRight = true),
            Options(text = "Mars", isRight = false),
            Options(text = "Jupiter", isRight = false),
            Options(text = "Saturn", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the main ingredient in guacamole?",
        options = listOf(
            Options(text = "Tomato", isRight = false),
            Options(text = "Avocado", isRight = true),
            Options(text = "Onion", isRight = false),
            Options(text = "Lime", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who is the author of 'The Hobbit'?",
        options = listOf(
            Options(text = "J.K. Rowling", isRight = false),
            Options(text = "J.R.R. Tolkien", isRight = true),
            Options(text = "C.S. Lewis", isRight = false),
            Options(text = "George R.R. Martin", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the currency of Japan?",
        options = listOf(
            Options(text = "Yen", isRight = true),
            Options(text = "Won", isRight = false),
            Options(text = "Baht", isRight = false),
            Options(text = "Ringgit", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who was the first woman to win a Nobel Prize?",
        options = listOf(
            Options(text = "Marie Curie", isRight = true),
            Options(text = "Rosalind Franklin", isRight = false),
            Options(text = "Dorothy Crowfoot Hodgkin", isRight = false),
            Options(text = "Jane Goodall", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "In which year did the Titanic sink?",
        options = listOf(
            Options(text = "1912", isRight = true),
            Options(text = "1920", isRight = false),
            Options(text = "1905", isRight = false),
            Options(text = "1931", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the speed of light in a vacuum?",
        options = listOf(
            Options(text = "299,792 kilometers per second", isRight = true),
            Options(text = "150,000 kilometers per second", isRight = false),
            Options(text = "500,000 kilometers per second", isRight = false),
            Options(text = "1 million kilometers per second", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Who played the character of Jack Dawson in the movie 'Titanic'?",
        options = listOf(
            Options(text = "Brad Pitt", isRight = false),
            Options(text = "Leonardo DiCaprio", isRight = true),
            Options(text = "Tom Cruise", isRight = false),
            Options(text = "Johnny Depp", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "What is the capital of South Africa?",
        options = listOf(
            Options(text = "Cape Town", isRight = false),
            Options(text = "Johannesburg", isRight = false),
            Options(text = "Pretoria", isRight = true),
            Options(text = "Durban", isRight = false)
        ),
        category= QuestionCategory.General
    ),
    Question(
        question = "Which gas makes up the majority of Earth's atmosphere?",
        options = listOf(
            Options(text = "Oxygen", isRight = false),
            Options(text = "Carbon Dioxide", isRight = false),
            Options(text = "Nitrogen", isRight = true),
            Options(text = "Hydrogen", isRight = false)
        ),
        category= QuestionCategory.General
    )
)