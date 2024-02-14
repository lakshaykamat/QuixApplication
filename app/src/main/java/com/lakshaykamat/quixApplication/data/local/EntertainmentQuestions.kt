package com.lakshaykamat.quixApplication.data.local
import com.lakshaykamat.quixApplication.data.models.Question.Options
import com.lakshaykamat.quixApplication.data.models.Question
import com.lakshaykamat.quixApplication.data.models.QuestionCategory

val entertainmentQuestionsData = listOf(
    Question(
        question = "Who played the character of Tony Stark in the Marvel Cinematic Universe?",
        options = listOf(
            Options(text = "Chris Hemsworth", isRight = false),
            Options(text = "Chris Evans", isRight = false),
            Options(text = "Robert Downey Jr.", isRight = true),
            Options(text = "Mark Ruffalo", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which movie won the Academy Award for Best Picture in 2020?",
        options = listOf(
            Options(text = "Parasite", isRight = true),
            Options(text = "1917", isRight = false),
            Options(text = "Joker", isRight = false),
            Options(text = "Once Upon a Time in Hollywood", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who is the creator of the TV series 'Friends'?",
        options = listOf(
            Options(text = "David Crane and Marta Kauffman", isRight = true),
            Options(text = "Jerry Seinfeld", isRight = false),
            Options(text = "Lorne Michaels", isRight = false),
            Options(text = "Aaron Sorkin", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which actor voiced the character of Woody in the 'Toy Story' movies?",
        options = listOf(
            Options(text = "Tom Hanks", isRight = true),
            Options(text = "Tim Allen", isRight = false),
            Options(text = "Billy Crystal", isRight = false),
            Options(text = "John Goodman", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "What is the name of the famous wizarding school in the Harry Potter series?",
        options = listOf(
            Options(text = "Hogwarts School of Witchcraft and Wizardry", isRight = true),
            Options(text = "Beauxbatons Academy of Magic", isRight = false),
            Options(text = "Ilvermorny School of Witchcraft and Wizardry", isRight = false),
            Options(text = "Durmstrang Institute", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who directed the movie 'Inception'?",
        options = listOf(
            Options(text = "Christopher Nolan", isRight = true),
            Options(text = "Quentin Tarantino", isRight = false),
            Options(text = "Martin Scorsese", isRight = false),
            Options(text = "Steven Spielberg", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which actress won an Oscar for her role in 'La La Land'?",
        options = listOf(
            Options(text = "Emma Stone", isRight = true),
            Options(text = "Jennifer Lawrence", isRight = false),
            Options(text = "Natalie Portman", isRight = false),
            Options(text = "Meryl Streep", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "What is the highest-grossing film of all time (as of 2021)?",
        options = listOf(
            Options(text = "Avatar", isRight = true),
            Options(text = "Avengers: Endgame", isRight = false),
            Options(text = "Titanic", isRight = false),
            Options(text = "Star Wars: The Force Awakens", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who is the lead actor in the 'John Wick' film series?",
        options = listOf(
            Options(text = "Keanu Reeves", isRight = true),
            Options(text = "Brad Pitt", isRight = false),
            Options(text = "Tom Cruise", isRight = false),
            Options(text = "Matt Damon", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which TV series features characters named Ross, Rachel, Joey, Chandler, Monica, and Phoebe?",
        options = listOf(
            Options(text = "Friends", isRight = true),
            Options(text = "The Office", isRight = false),
            Options(text = "How I Met Your Mother", isRight = false),
            Options(text = "Parks and Recreation", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who is the lead actor in the 'Pirates of the Caribbean' film series?",
        options = listOf(
            Options(text = "Johnny Depp", isRight = true),
            Options(text = "Orlando Bloom", isRight = false),
            Options(text = "Geoffrey Rush", isRight = false),
            Options(text = "Keira Knightley", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which TV show is set in the fictional town of Hawkins, Indiana?",
        options = listOf(
            Options(text = "Stranger Things", isRight = true),
            Options(text = "Breaking Bad", isRight = false),
            Options(text = "The Walking Dead", isRight = false),
            Options(text = "Game of Thrones", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who directed the movie 'The Shawshank Redemption'?",
        options = listOf(
            Options(text = "Frank Darabont", isRight = true),
            Options(text = "Quentin Tarantino", isRight = false),
            Options(text = "Martin Scorsese", isRight = false),
            Options(text = "Steven Spielberg", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which actor played the character of Walter White in the TV series 'Breaking Bad'?",
        options = listOf(
            Options(text = "Bryan Cranston", isRight = true),
            Options(text = "Aaron Paul", isRight = false),
            Options(text = "Bob Odenkirk", isRight = false),
            Options(text = "Jonathan Banks", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who composed the iconic 'Star Wars' theme?",
        options = listOf(
            Options(text = "John Williams", isRight = true),
            Options(text = "Hans Zimmer", isRight = false),
            Options(text = "Howard Shore", isRight = false),
            Options(text = "Ennio Morricone", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which movie features a character named Jack Dawson and is set aboard the RMS Titanic?",
        options = listOf(
            Options(text = "Titanic", isRight = true),
            Options(text = "The Great Gatsby", isRight = false),
            Options(text = "Pearl Harbor", isRight = false),
            Options(text = "Gone with the Wind", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who directed the film 'Jurassic Park'?",
        options = listOf(
            Options(text = "Steven Spielberg", isRight = true),
            Options(text = "George Lucas", isRight = false),
            Options(text = "James Cameron", isRight = false),
            Options(text = "Martin Scorsese", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which actor starred as Neo in 'The Matrix' trilogy?",
        options = listOf(
            Options(text = "Keanu Reeves", isRight = true),
            Options(text = "Tom Cruise", isRight = false),
            Options(text = "Will Smith", isRight = false),
            Options(text = "Brad Pitt", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who played the role of Hermione Granger in the 'Harry Potter' film series?",
        options = listOf(
            Options(text = "Emma Watson", isRight = true),
            Options(text = "Emma Stone", isRight = false),
            Options(text = "Natalie Portman", isRight = false),
            Options(text = "Dakota Fanning", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which movie features characters named Harry, Ron, and Hermione?",
        options = listOf(
            Options(text = "Harry Potter series", isRight = true),
            Options(text = "Twilight", isRight = false),
            Options(text = "The Hunger Games", isRight = false),
            Options(text = "Percy Jackson series", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who directed the movie 'Avatar'?",
        options = listOf(
            Options(text = "James Cameron", isRight = true),
            Options(text = "Steven Spielberg", isRight = false),
            Options(text = "Christopher Nolan", isRight = false),
            Options(text = "Peter Jackson", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which actress portrayed Katniss Everdeen in 'The Hunger Games' movies?",
        options = listOf(
            Options(text = "Jennifer Lawrence", isRight = true),
            Options(text = "Emma Stone", isRight = false),
            Options(text = "Shailene Woodley", isRight = false),
            Options(text = "Emma Watson", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who voiced the character of Elsa in the animated movie 'Frozen'?",
        options = listOf(
            Options(text = "Idina Menzel", isRight = true),
            Options(text = "Kristen Bell", isRight = false),
            Options(text = "Demi Lovato", isRight = false),
            Options(text = "Adele Dazeem", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which movie features the character Tony Montana and his famous line 'Say hello to my little friend!'?",
        options = listOf(
            Options(text = "Scarface", isRight = true),
            Options(text = "Goodfellas", isRight = false),
            Options(text = "The Godfather", isRight = false),
            Options(text = "Casino", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who won the Academy Award for Best Actor for his role in 'The Revenant'?",
        options = listOf(
            Options(text = "Leonardo DiCaprio", isRight = true),
            Options(text = "Brad Pitt", isRight = false),
            Options(text = "Johnny Depp", isRight = false),
            Options(text = "Tom Hanks", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which actress starred as Black Widow in the Marvel Cinematic Universe?",
        options = listOf(
            Options(text = "Scarlett Johansson", isRight = true),
            Options(text = "Jennifer Lawrence", isRight = false),
            Options(text = "Margot Robbie", isRight = false),
            Options(text = "Gal Gadot", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who composed the soundtrack for the movie 'Interstellar'?",
        options = listOf(
            Options(text = "Hans Zimmer", isRight = true),
            Options(text = "John Williams", isRight = false),
            Options(text = "Ennio Morricone", isRight = false),
            Options(text = "James Horner", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which actor played the character Jack Sparrow in the 'Pirates of the Caribbean' series?",
        options = listOf(
            Options(text = "Johnny Depp", isRight = true),
            Options(text = "Orlando Bloom", isRight = false),
            Options(text = "Geoffrey Rush", isRight = false),
            Options(text = "Javier Bardem", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who directed the movie 'The Dark Knight'?",
        options = listOf(
            Options(text = "Christopher Nolan", isRight = true),
            Options(text = "Tim Burton", isRight = false),
            Options(text = "Zack Snyder", isRight = false),
            Options(text = "Joss Whedon", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which actor portrayed the character James Bond in the movie 'Skyfall'?",
        options = listOf(
            Options(text = "Daniel Craig", isRight = true),
            Options(text = "Pierce Brosnan", isRight = false),
            Options(text = "Sean Connery", isRight = false),
            Options(text = "Roger Moore", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who directed the movie 'The Shawshank Redemption'?",
        options = listOf(
            Options(text = "Frank Darabont", isRight = true),
            Options(text = "Quentin Tarantino", isRight = false),
            Options(text = "Martin Scorsese", isRight = false),
            Options(text = "Steven Spielberg", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which movie won the Academy Award for Best Picture in 2016?",
        options = listOf(
            Options(text = "Moonlight", isRight = true),
            Options(text = "La La Land", isRight = false),
            Options(text = "Manchester by the Sea", isRight = false),
            Options(text = "The Shape of Water", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who voiced the character of Nemo in the animated movie 'Finding Nemo'?",
        options = listOf(
            Options(text = "Alexander Gould", isRight = true),
            Options(text = "Hayden Rolence", isRight = false),
            Options(text = "Ellen DeGeneres", isRight = false),
            Options(text = "Albert Brooks", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Which movie features a character named Forrest Gump?",
        options = listOf(
            Options(text = "Forrest Gump", isRight = true),
            Options(text = "Saving Private Ryan", isRight = false),
            Options(text = "The Green Mile", isRight = false),
            Options(text = "Cast Away", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    ),
    Question(
        question = "Who directed the movie 'The Godfather'?",
        options = listOf(
           Options(text = "Francis Ford Coppola", isRight = true),
            Options(text = "Martin Scorsese", isRight = false),
            Options(text = "Alfred Hitchcock", isRight = false),
            Options(text = "Steven Spielberg", isRight = false)
        ),
        category = QuestionCategory.Entertainment
    )
)