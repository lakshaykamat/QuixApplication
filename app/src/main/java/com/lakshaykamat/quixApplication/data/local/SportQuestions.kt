package com.lakshaykamat.quixApplication.data.local
import com.lakshaykamat.quixApplication.data.models.Question.Options
import com.lakshaykamat.quixApplication.data.models.Question
import com.lakshaykamat.quixApplication.data.models.QuestionCategory

val sportsQuestionsData = listOf(
    Question(
        question = "Who won the FIFA World Cup in 2018?",
        options = listOf(
            Options(text = "Germany", isRight = false),
            Options(text = "Brazil", isRight = false),
            Options(text = "France", isRight = true),
            Options(text = "Argentina", isRight = false),
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which sport is played at Wimbledon?",
        options = listOf(
            Options(text = "Tennis", isRight = true),
            Options(text = "Golf", isRight = false),
            Options(text = "Cricket", isRight = false),
            Options(text = "Badminton", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who is the all-time leading scorer in NBA history?",
        options = listOf(
            Options(text = "Kareem Abdul-Jabbar", isRight = true),
            Options(text = "Michael Jordan", isRight = false),
            Options(text = "LeBron James", isRight = false),
            Options(text = "Kobe Bryant", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country won the most gold medals in the 2016 Summer Olympics?",
        options = listOf(
            Options(text = "United States", isRight = true),
            Options(text = "China", isRight = false),
            Options(text = "Russia", isRight = false),
            Options(text = "Great Britain", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which team has won the most Super Bowl titles in NFL history?",
        options = listOf(
            Options(text = "New England Patriots", isRight = true),
            Options(text = "Dallas Cowboys", isRight = false),
            Options(text = "San Francisco 49ers", isRight = false),
            Options(text = "Pittsburgh Steelers", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who holds the record for the fastest 100-meter sprint in history?",
        options = listOf(
            Options(text = "Usain Bolt", isRight = true),
            Options(text = "Carl Lewis", isRight = false),
            Options(text = "Tyson Gay", isRight = false),
            Options(text = "Asafa Powell", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country has won the most FIFA World Cup titles?",
        options = listOf(
            Options(text = "Brazil", isRight = true),
            Options(text = "Germany", isRight = false),
            Options(text = "Italy", isRight = false),
            Options(text = "Argentina", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who is the only player to have won FIFA World Player of the Year three times?",
        options = listOf(
            Options(text = "Ronaldo", isRight = true),
            Options(text = "Lionel Messi", isRight = false),
            Options(text = "Zinedine Zidane", isRight = false),
            Options(text = "Cristiano Ronaldo", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "In which country did the sport of judo originate?",
        options = listOf(
            Options(text = "Japan", isRight = true),
            Options(text = "China", isRight = false),
            Options(text = "Korea", isRight = false),
            Options(text = "Thailand", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which city hosted the 2016 Summer Olympics?",
        options = listOf(
            Options(text = "Rio de Janeiro", isRight = true),
            Options(text = "London", isRight = false),
            Options(text = "Beijing", isRight = false),
            Options(text = "Tokyo", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who is considered the greatest tennis player of all time?",
        options = listOf(
            Options(text = "Roger Federer", isRight = true),
            Options(text = "Rafael Nadal", isRight = false),
            Options(text = "Novak Djokovic", isRight = false),
            Options(text = "Serena Williams", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country won the ICC Cricket World Cup in 2019?",
        options = listOf(
            Options(text = "England", isRight = true),
            Options(text = "India", isRight = false),
            Options(text = "Australia", isRight = false),
            Options(text = "New Zealand", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which boxer is nicknamed 'Money'?",
        options = listOf(
            Options(text = "Floyd Mayweather Jr.", isRight = true),
            Options(text = "Manny Pacquiao", isRight = false),
            Options(text = "Mike Tyson", isRight = false),
            Options(text = "Muhammad Ali", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "What is the highest possible break in snooker?",
        options = listOf(
            Options(text = "147", isRight = true),
            Options(text = "180", isRight = false),
            Options(text = "170", isRight = false),
            Options(text = "155", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country won the UEFA European Championship in 2020?",
        options = listOf(
            Options(text = "Italy", isRight = true),
            Options(text = "England", isRight = false),
            Options(text = "France", isRight = false),
            Options(text = "Portugal", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who won the Tour de France in 2021?",
        options = listOf(
            Options(text = "Tadej Pogačar", isRight = true),
            Options(text = "Primoz Roglic", isRight = false),
            Options(text = "Egan Bernal", isRight = false),
            Options(text = "Chris Froome", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country has won the most Olympic gold medals in men's hockey?",
        options = listOf(
            Options(text = "India", isRight = true),
            Options(text = "Netherlands", isRight = false),
            Options(text = "Australia", isRight = false),
            Options(text = "Germany", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who was the first woman to climb Mount Everest?",
        options = listOf(
            Options(text = "Junko Tabei", isRight = true),
            Options(text = "Reinhold Messner", isRight = false),
            Options(text = "Edmund Hillary", isRight = false),
            Options(text = "Tenzing Norgay", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which team won the NBA championship in 2021?",
        options = listOf(
            Options(text = "Milwaukee Bucks", isRight = true),
            Options(text = "Phoenix Suns", isRight = false),
            Options(text = "Los Angeles Lakers", isRight = false),
            Options(text = "Brooklyn Nets", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country has won the most FIFA Women's World Cup titles?",
        options = listOf(
            Options(text = "United States", isRight = true),
            Options(text = "Germany", isRight = false),
            Options(text = "Norway", isRight = false),
            Options(text = "Sweden", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who holds the record for the most Olympic gold medals in swimming?",
        options = listOf(
            Options(text = "Michael Phelps", isRight = true),
            Options(text = "Mark Spitz", isRight = false),
            Options(text = "Ian Thorpe", isRight = false),
            Options(text = "Katie Ledecky", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country won the Rugby World Cup in 2019?",
        options = listOf(
            Options(text = "South Africa", isRight = true),
            Options(text = "England", isRight = false),
            Options(text = "New Zealand", isRight = false),
            Options(text = "Australia", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who is the all-time leading goal scorer in the English Premier League?",
        options = listOf(
            Options(text = "Alan Shearer", isRight = true),
            Options(text = "Wayne Rooney", isRight = false),
            Options(text = "Thierry Henry", isRight = false),
            Options(text = "Sergio Agüero", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which city hosted the 2012 Summer Olympics?",
        options = listOf(
            Options(text = "London", isRight = true),
            Options(text = "Beijing", isRight = false),
            Options(text = "Sydney", isRight = false),
            Options(text = "Athens", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who won the 2021 Formula One World Drivers' Championship?",
        options = listOf(
            Options(text = "Max Verstappen", isRight = true),
            Options(text = "Lewis Hamilton", isRight = false),
            Options(text = "Valtteri Bottas", isRight = false),
            Options(text = "Daniel Ricciardo", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which sport uses the terms 'birdie' and 'eagle'?",
        options = listOf(
            Options(text = "Golf", isRight = true),
            Options(text = "Tennis", isRight = false),
            Options(text = "Badminton", isRight = false),
            Options(text = "Cricket", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who won the UEFA Champions League in 2021?",
        options = listOf(
            Options(text = "Chelsea", isRight = true),
            Options(text = "Manchester City", isRight = false),
            Options(text = "Real Madrid", isRight = false),
            Options(text = "Bayern Munich", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which athlete has won the most Olympic gold medals?",
        options = listOf(
            Options(text = "Michael Phelps", isRight = true),
            Options(text = "Usain Bolt", isRight = false),
            Options(text = "Carl Lewis", isRight = false),
            Options(text = "Simone Biles", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "In what sport would you perform a 'slam dunk'?",
        options = listOf(
            Options(text = "Basketball", isRight = true),
            Options(text = "Football", isRight = false),
            Options(text = "Volleyball", isRight = false),
            Options(text = "Baseball", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who is the youngest Formula One World Champion?",
        options = listOf(
            Options(text = "Sebastian Vettel", isRight = true),
            Options(text = "Lewis Hamilton", isRight = false),
            Options(text = "Ayrton Senna", isRight = false),
            Options(text = "Michael Schumacher", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country won the Copa America in 2021?",
        options = listOf(
            Options(text = "Argentina", isRight = true),
            Options(text = "Brazil", isRight = false),
            Options(text = "Uruguay", isRight = false),
            Options(text = "Chile", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which athlete set a new world record in the men's 100m dash at the 2009 World Championships in Athletics?",
        options = listOf(
            Options(text = "Usain Bolt", isRight = true),
            Options(text = "Tyson Gay", isRight = false),
            Options(text = "Yohan Blake", isRight = false),
            Options(text = "Asafa Powell", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "What is the diameter of a basketball hoop in inches?",
        options = listOf(
            Options(text = "18 inches", isRight = true),
            Options(text = "20 inches", isRight = false),
            Options(text = "22 inches", isRight = false),
            Options(text = "24 inches", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who is the only football player to have won the FIFA World Cup three times?",
        options = listOf(
            Options(text = "Pelé", isRight = true),
            Options(text = "Diego Maradona", isRight = false),
            Options(text = "Cristiano Ronaldo", isRight = false),
            Options(text = "Lionel Messi", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country won the Women's T20 Cricket World Cup in 2020?",
        options = listOf(
            Options(text = "Australia", isRight = true),
            Options(text = "India", isRight = false),
            Options(text = "England", isRight = false),
            Options(text = "West Indies", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which golfer is known as the 'Golden Bear'?",
        options = listOf(
            Options(text = "Jack Nicklaus", isRight = true),
            Options(text = "Tiger Woods", isRight = false),
            Options(text = "Arnold Palmer", isRight = false),
            Options(text = "Gary Player", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who holds the record for the most goals scored in a single FIFA World Cup tournament?",
        options = listOf(
            Options(text = "Just Fontaine", isRight = true),
            Options(text = "Pele", isRight = false),
            Options(text = "Gerd Müller", isRight = false),
            Options(text = "Ronaldo", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which horse won the Triple Crown in 2018?",
        options = listOf(
            Options(text = "Justify", isRight = true),
            Options(text = "American Pharoah", isRight = false),
            Options(text = "Secretariat", isRight = false),
            Options(text = "Seattle Slew", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who won the 2020 Australian Open men's singles title?",
        options = listOf(
            Options(text = "Novak Djokovic", isRight = true),
            Options(text = "Rafael Nadal", isRight = false),
            Options(text = "Roger Federer", isRight = false),
            Options(text = "Dominic Thiem", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country won the most medals at the 2020 Summer Olympics?",
        options = listOf(
            Options(text = "United States", isRight = true),
            Options(text = "China", isRight = false),
            Options(text = "Japan", isRight = false),
            Options(text = "Great Britain", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who is the only tennis player to have completed the Golden Slam (all four Grand Slams and Olympic gold medal)?",
        options = listOf(
            Options(text = "Steffi Graf", isRight = true),
            Options(text = "Serena Williams", isRight = false),
            Options(text = "Roger Federer", isRight = false),
            Options(text = "Rafael Nadal", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which city hosted the 2018 Winter Olympics?",
        options = listOf(
            Options(text = "Pyeongchang", isRight = true),
            Options(text = "Vancouver", isRight = false),
            Options(text = "Sochi", isRight = false),
            Options(text = "Salt Lake City", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who won the 2020 Tour de France?",
        options = listOf(
            Options(text = "Tadej Pogacar", isRight = true),
            Options(text = "Primoz Roglic", isRight = false),
            Options(text = "Egan Bernal", isRight = false),
            Options(text = "Chris Froome", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which city hosted the 2008 Summer Olympics?",
        options = listOf(
            Options(text = "Beijing", isRight = true),
            Options(text = "Sydney", isRight = false),
            Options(text = "Athens", isRight = false),
            Options(text = "Tokyo", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Which country has won the most medals in Olympic basketball?",
        options = listOf(
            Options(text = "United States", isRight = true),
            Options(text = "Soviet Union", isRight = false),
            Options(text = "Argentina", isRight = false),
            Options(text = "Spain", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who won the 2021 UEFA European Championship Golden Boot?",
        options = listOf(
            Options(text = "Cristiano Ronaldo", isRight = true),
            Options(text = "Harry Kane", isRight = false),
            Options(text = "Romelu Lukaku", isRight = false),
            Options(text = "Karim Benzema", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who won the 2020 NBA Finals MVP award?",
        options = listOf(
            Options(text = "LeBron James", isRight = true),
            Options(text = "Anthony Davis", isRight = false),
            Options(text = "Jimmy Butler", isRight = false),
            Options(text = "Kawhi Leonard", isRight = false)
        ),
        category = QuestionCategory.Sport
    ),
    Question(
        question = "Who won the FIFA Ballon d'Or award in 2019?",
        options = listOf(
            Options(text = "Lionel Messi", isRight = true),
            Options(text = "Cristiano Ronaldo", isRight = false),
            Options(text = "Virgil van Dijk", isRight = false),
            Options(text = "Robert Lewandowski", isRight = false)
        ),
        category = QuestionCategory.Sport
    )
)
