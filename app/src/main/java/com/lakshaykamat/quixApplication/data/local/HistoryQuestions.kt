package com.lakshaykamat.quixApplication.data.local
import com.lakshaykamat.quixApplication.data.models.Question.Options
import com.lakshaykamat.quixApplication.data.models.Question
import com.lakshaykamat.quixApplication.data.models.QuestionCategory

val historyQuestionsData = listOf(
    Question(
        question = "Who was the first President of the United States?",
        options = listOf(
            Options(text = "Thomas Jefferson", isRight = false),
            Options(text = "Abraham Lincoln", isRight = false),
            Options(text = "George Washington", isRight = true),
            Options(text = "John Adams", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "In which year did World War I begin?",
        options = listOf(
            Options(text = "1914", isRight = true),
            Options(text = "1918", isRight = false),
            Options(text = "1939", isRight = false),
            Options(text = "1941", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the first Emperor of Rome?",
        options = listOf(
            Options(text = "Julius Caesar", isRight = false),
            Options(text = "Augustus", isRight = true),
            Options(text = "Nero", isRight = false),
            Options(text = "Caligula", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which ancient civilization built the Great Pyramids of Giza?",
        options = listOf(
            Options(text = "Mesopotamians", isRight = false),
            Options(text = "Greeks", isRight = false),
            Options(text = "Egyptians", isRight = true),
            Options(text = "Romans", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the first woman to fly solo across the Atlantic Ocean?",
        options = listOf(
            Options(text = "Amelia Earhart", isRight = true),
            Options(text = "Bessie Coleman", isRight = false),
            Options(text = "Katherine Johnson", isRight = false),
            Options(text = "Sally Ride", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "What event marked the beginning of the French Revolution?",
        options = listOf(
            Options(text = "Storming of the Bastille", isRight = true),
            Options(text = "Reign of Terror", isRight = false),
            Options(text = "Execution of Louis XVI", isRight = false),
            Options(text = "Declaration of the Rights of Man and of the Citizen", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the last Tsar of Russia?",
        options = listOf(
            Options(text = "Nicholas II", isRight = true),
            Options(text = "Alexander III", isRight = false),
            Options(text = "Peter the Great", isRight = false),
            Options(text = "Ivan the Terrible", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which battle is considered the turning point of the American Civil War?",
        options = listOf(
            Options(text = "Battle of Antietam", isRight = false),
            Options(text = "Battle of Gettysburg", isRight = true),
            Options(text = "Battle of Bull Run", isRight = false),
            Options(text = "Battle of Vicksburg", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the leader of the Soviet Union during World War II?",
        options = listOf(
            Options(text = "Joseph Stalin", isRight = true),
            Options(text = "Vladimir Lenin", isRight = false),
            Options(text = "Nikita Khrushchev", isRight = false),
            Options(text = "Mikhail Gorbachev", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "What year did the Berlin Wall fall?",
        options = listOf(
            Options(text = "1989", isRight = true),
            Options(text = "1991", isRight = false),
            Options(text = "1985", isRight = false),
            Options(text = "1995", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the first woman to win a Nobel Prize?",
        options = listOf(
            Options(text = "Marie Curie", isRight = true),
            Options(text = "Mother Teresa", isRight = false),
            Options(text = "Jane Addams", isRight = false),
            Options(text = "Rosalind Franklin", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which civilization is credited with the invention of writing?",
        options = listOf(
            Options(text = "Mesopotamians", isRight = true),
            Options(text = "Ancient Egyptians", isRight = false),
            Options(text = "Greeks", isRight = false),
            Options(text = "Romans", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "What was the code name for the Allied invasion of Normandy in World War II?",
        options = listOf(
            Options(text = "Operation Overlord", isRight = true),
            Options(text = "Operation Neptune", isRight = false),
            Options(text = "Operation Barbarossa", isRight = false),
            Options(text = "Operation Market Garden", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the first explorer to circumnavigate the globe?",
        options = listOf(
            Options(text = "Christopher Columbus", isRight = false),
            Options(text = "Ferdinand Magellan", isRight = true),
            Options(text = "Vasco da Gama", isRight = false),
            Options(text = "James Cook", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which ancient civilization built the city of Machu Picchu?",
        options = listOf(
            Options(text = "Incas", isRight = true),
            Options(text = "Mayans", isRight = false),
            Options(text = "Aztecs", isRight = false),
            Options(text = "Romans", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who wrote 'The Communist Manifesto'?",
        options = listOf(
            Options(text = "Karl Marx and Friedrich Engels", isRight = true),
            Options(text = "Vladimir Lenin", isRight = false),
            Options(text = "Leon Trotsky", isRight = false),
            Options(text = "Mao Zedong", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "What event led to the start of World War II?",
        options = listOf(
            Options(text = "Invasion of Poland", isRight = true),
            Options(text = "Bombing of Pearl Harbor", isRight = false),
            Options(text = "Invasion of France", isRight = false),
            Options(text = "Battle of Stalingrad", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the first European explorer to reach India by sea?",
        options = listOf(
            Options(text = "Vasco da Gama", isRight = true),
            Options(text = "Christopher Columbus", isRight = false),
            Options(text = "Ferdinand Magellan", isRight = false),
            Options(text = "James Cook", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which American President signed the Emancipation Proclamation?",
        options = listOf(
            Options(text = "Abraham Lincoln", isRight = true),
            Options(text = "Andrew Johnson", isRight = false),
            Options(text = "Ulysses S. Grant", isRight = false),
            Options(text = "James Buchanan", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the leader of the Soviet Union during the Cuban Missile Crisis?",
        options = listOf(
            Options(text = "Nikita Khrushchev", isRight = true),
            Options(text = "Joseph Stalin", isRight = false),
            Options(text = "Leonid Brezhnev", isRight = false),
            Options(text = "Mikhail Gorbachev", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which ancient wonder of the world was located in Babylon?",
        options = listOf(
            Options(text = "Hanging Gardens", isRight = true),
            Options(text = "Great Pyramid of Giza", isRight = false),
            Options(text = "Statue of Zeus at Olympia", isRight = false),
            Options(text = "Lighthouse of Alexandria", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the founder of the Mongol Empire?",
        options = listOf(
            Options(text = "Genghis Khan", isRight = true),
            Options(text = "Kublai Khan", isRight = false),
            Options(text = "Attila the Hun", isRight = false),
            Options(text = "Timur", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which treaty officially ended World War I?",
        options = listOf(
            Options(text = "Treaty of Versailles", isRight = true),
            Options(text = "Treaty of Trianon", isRight = false),
            Options(text = "Treaty of Brest-Litovsk", isRight = false),
            Options(text = "Treaty of Sevres", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the first female Prime Minister of the United Kingdom?",
        options = listOf(
            Options(text = "Margaret Thatcher", isRight = true),
            Options(text = "Theresa May", isRight = false),
            Options(text = "Indira Gandhi", isRight = false),
            Options(text = "Angela Merkel", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which city was the capital of the Byzantine Empire?",
        options = listOf(
            Options(text = "Constantinople", isRight = true),
            Options(text = "Rome", isRight = false),
            Options(text = "Athens", isRight = false),
            Options(text = "Alexandria", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who led the Haitian Revolution, leading to Haiti's independence from France?",
        options = listOf(
            Options(text = "Toussaint Louverture", isRight = true),
            Options(text = "Simón Bolívar", isRight = false),
            Options(text = "Miguel Hidalgo", isRight = false),
            Options(text = "José Martí", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "What was the primary cause of the Black Death in Europe?",
        options = listOf(
            Options(text = "Bubonic Plague", isRight = true),
            Options(text = "Smallpox", isRight = false),
            Options(text = "Influenza", isRight = false),
            Options(text = "Cholera", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the longest-reigning monarch in British history?",
        options = listOf(
            Options(text = "Queen Victoria", isRight = true),
            Options(text = "Queen Elizabeth II", isRight = false),
            Options(text = "King Henry VIII", isRight = false),
            Options(text = "King George III", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which ancient civilization built the city of Troy?",
        options = listOf(
            Options(text = "Ancient Greeks", isRight = true),
            Options(text = "Romans", isRight = false),
            Options(text = "Persians", isRight = false),
            Options(text = "Egyptians", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the author of 'The Prince', a political treatise on governance?",
        options = listOf(
            Options(text = "Niccolò Machiavelli", isRight = true),
            Options(text = "Thomas More", isRight = false),
            Options(text = "John Locke", isRight = false),
            Options(text = "Montesquieu", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the first emperor of China?",
        options = listOf(
            Options(text = "Qin Shi Huang", isRight = true),
            Options(text = "Han Wudi", isRight = false),
            Options(text = "Emperor Wu of Han", isRight = false),
            Options(text = "Emperor Gaozu of Han", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which city was the capital of the Roman Empire?",
        options = listOf(
            Options(text = "Rome", isRight = true),
            Options(text = "Athens", isRight = false),
            Options(text = "Carthage", isRight = false),
            Options(text = "Byzantium", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the first female pharaoh of ancient Egypt?",
        options = listOf(
            Options(text = "Hatshepsut", isRight = true),
            Options(text = "Cleopatra", isRight = false),
            Options(text = "Nefertiti", isRight = false),
            Options(text = "Nefertari", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which medieval English king was known as 'The Lionheart'?",
        options = listOf(
            Options(text = "Richard I", isRight = true),
            Options(text = "Edward I", isRight = false),
            Options(text = "Henry II", isRight = false),
            Options(text = "John", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the leader of the Bolsheviks during the Russian Revolution?",
        options = listOf(
            Options(text = "Vladimir Lenin", isRight = true),
            Options(text = "Joseph Stalin", isRight = false),
            Options(text = "Leon Trotsky", isRight = false),
            Options(text = "Mikhail Gorbachev", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which ancient civilization developed the concept of zero?",
        options = listOf(
            Options(text = "Mayans", isRight = true),
            Options(text = "Greeks", isRight = false),
            Options(text = "Romans", isRight = false),
            Options(text = "Egyptians", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who wrote 'The Wealth of Nations', often considered the foundation of modern economics?",
        options = listOf(
            Options(text = "Adam Smith", isRight = true),
            Options(text = "Karl Marx", isRight = false),
            Options(text = "John Locke", isRight = false),
            Options(text = "David Hume", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Who was the longest-serving President of the United States?",
        options = listOf(
            Options(text = "Franklin D. Roosevelt", isRight = true),
            Options(text = "George Washington", isRight = false),
            Options(text = "Thomas Jefferson", isRight = false),
            Options(text = "Abraham Lincoln", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "Which ancient civilization is credited with the invention of democracy?",
        options = listOf(
            Options(text = "Ancient Greeks", isRight = true),
            Options(text = "Romans", isRight = false),
            Options(text = "Persians", isRight = false),
            Options(text = "Egyptians", isRight = false)
        ),
        category= QuestionCategory.History
    ),
    Question(
        question = "What was the period of renewed interest in art and learning in Europe called?",
        options = listOf(
            Options(text = "Renaissance", isRight = true),
            Options(text = "Enlightenment", isRight = false),
            Options(text = "Baroque", isRight = false),
            Options(text = "Industrial Revolution", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Who was the first woman to serve as the Prime Minister of India?",
        options = listOf(
            Options(text = "Indira Gandhi", isRight = true),
            Options(text = "Sonia Gandhi", isRight = false),
            Options(text = "Margaret Thatcher", isRight = false),
            Options(text = "Golda Meir", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Which ancient civilization built the city of Petra?",
        options = listOf(
            Options(text = "Nabateans", isRight = true),
            Options(text = "Sumerians", isRight = false),
            Options(text = "Phoenicians", isRight = false),
            Options(text = "Minoans", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Who was the first President of the United States to be impeached?",
        options = listOf(
            Options(text = "Andrew Johnson", isRight = true),
            Options(text = "Bill Clinton", isRight = false),
            Options(text = "Richard Nixon", isRight = false),
            Options(text = "Donald Trump", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Who discovered the New World?",
        options = listOf(
            Options(text = "Christopher Columbus", isRight = true),
            Options(text = "Amerigo Vespucci", isRight = false),
            Options(text = "John Cabot", isRight = false),
            Options(text = "Ferdinand Magellan", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Which ancient civilization developed the first known system of writing?",
        options = listOf(
            Options(text = "Sumerians", isRight = true),
            Options(text = "Ancient Egyptians", isRight = false),
            Options(text = "Greeks", isRight = false),
            Options(text = "Mayans", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Who was the last ruler of the Aztec Empire?",
        options = listOf(
            Options(text = "Moctezuma II", isRight = true),
            Options(text = "Cuauhtémoc", isRight = false),
            Options(text = "Montezuma I", isRight = false),
            Options(text = "Atahualpa", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Which European explorer first reached the southern tip of Africa, known as the Cape of Good Hope?",
        options = listOf(
            Options(text = "Bartolomeu Dias", isRight = true),
            Options(text = "Vasco da Gama", isRight = false),
            Options(text = "Christopher Columbus", isRight = false),
            Options(text = "Ferdinand Magellan", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Who was the longest-reigning female monarch in British history?",
        options = listOf(
            Options(text = "Queen Elizabeth II", isRight = true),
            Options(text = "Queen Victoria", isRight = false),
            Options(text = "Queen Mary I", isRight = false),
            Options(text = "Queen Anne", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Which civilization built the city of Teotihuacan in present-day Mexico?",
        options = listOf(
            Options(text = "Teotihuacanos", isRight = true),
            Options(text = "Mayans", isRight = false),
            Options(text = "Aztecs", isRight = false),
            Options(text = "Incas", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "What event marked the end of the Roman Republic and the beginning of the Roman Empire?",
        options = listOf(
            Options(text = "Assassination of Julius Caesar", isRight = true),
            Options(text = "Battle of Actium", isRight = false),
            Options(text = "Sack of Rome", isRight = false),
            Options(text = "Founding of Constantinople", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Who was the first European explorer to reach India by sea?",
        options = listOf(
            Options(text = "Vasco da Gama", isRight = true),
            Options(text = "Christopher Columbus", isRight = false),
            Options(text = "Ferdinand Magellan", isRight = false),
            Options(text = "James Cook", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Which country was the first to grant women the right to vote?",
        options = listOf(
            Options(text = "New Zealand", isRight = true),
            Options(text = "United States", isRight = false),
            Options(text = "United Kingdom", isRight = false),
            Options(text = "Australia", isRight = false)
        ),
        category = QuestionCategory.History
    ),
    Question(
        question = "Who was the first European explorer to reach North America?",
        options = listOf(
            Options(text = "Leif Erikson", isRight = true),
            Options(text = "Christopher Columbus", isRight = false),
            Options(text = "Amerigo Vespucci", isRight = false),
            Options(text = "John Cabot", isRight = false)
        ),
        category = QuestionCategory.History
    )
)

