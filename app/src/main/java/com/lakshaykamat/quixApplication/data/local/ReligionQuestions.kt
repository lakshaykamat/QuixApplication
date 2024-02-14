package com.lakshaykamat.quixApplication.data.local
import com.lakshaykamat.quixApplication.data.models.Question.Options
import com.lakshaykamat.quixApplication.data.models.Question
import com.lakshaykamat.quixApplication.data.models.QuestionCategory

val religionQuestionsData = listOf(
    Question(
        question = "Who is the founder of Buddhism?",
        options = listOf(
            Options(text = "Siddhartha Gautama", isRight = true),
            Options(text = "Confucius", isRight = false),
            Options(text = "Muhammad", isRight = false),
            Options(text = "Jesus Christ", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Which religious text is central to Hinduism?",
        options = listOf(
            Options(text = "Bhagavad Gita", isRight = true),
            Options(text = "Quran", isRight = false),
            Options(text = "Bible", isRight = false),
            Options(text = "Torah", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is considered the central figure of Christianity?",
        options = listOf(
            Options(text = "Jesus Christ", isRight = true),
            Options(text = "Moses", isRight = false),
            Options(text = "Muhammad", isRight = false),
            Options(text = "Buddha", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Which religious figure is associated with the Ten Commandments?",
        options = listOf(
            Options(text = "Moses", isRight = true),
            Options(text = "Abraham", isRight = false),
            Options(text = "Jesus Christ", isRight = false),
            Options(text = "Muhammad", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the holy book of Islam?",
        options = listOf(
            Options(text = "Quran", isRight = true),
            Options(text = "Bible", isRight = false),
            Options(text = "Tripitaka", isRight = false),
            Options(text = "Vedas", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the first prophet in Islam?",
        options = listOf(
            Options(text = "Adam", isRight = true),
            Options(text = "Moses", isRight = false),
            Options(text = "Jesus", isRight = false),
            Options(text = "Abraham", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the holy book of Judaism?",
        options = listOf(
            Options(text = "Torah", isRight = true),
            Options(text = "Bhagavad Gita", isRight = false),
            Options(text = "Quran", isRight = false),
            Options(text = "Bible", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the last prophet in Islam?",
        options = listOf(
            Options(text = "Muhammad", isRight = true),
            Options(text = "Abraham", isRight = false),
            Options(text = "Jesus", isRight = false),
            Options(text = "Moses", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the sacred text of Sikhism?",
        options = listOf(
            Options(text = "Guru Granth Sahib", isRight = true),
            Options(text = "Tripitaka", isRight = false),
            Options(text = "Bhagavad Gita", isRight = false),
            Options(text = "Vedas", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the primary deity in Hinduism?",
        options = listOf(
            Options(text = "Brahman", isRight = true),
            Options(text = "Shiva", isRight = false),
            Options(text = "Vishnu", isRight = false),
            Options(text = "Krishna", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Sikhism?",
        options = listOf(
            Options(text = "Guru Nanak", isRight = true),
            Options(text = "Guru Gobind Singh", isRight = false),
            Options(text = "Guru Tegh Bahadur", isRight = false),
            Options(text = "Guru Angad", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Buddhism?",
        options = listOf(
            Options(text = "Tripitaka", isRight = true),
            Options(text = "Bhagavad Gita", isRight = false),
            Options(text = "Quran", isRight = false),
            Options(text = "Vedas", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the central figure of Jainism?",
        options = listOf(
            Options(text = "Mahavira", isRight = true),
            Options(text = "Siddhartha Gautama", isRight = false),
            Options(text = "Adi Shankaracharya", isRight = false),
            Options(text = "Guru Nanak", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the holy book of Zoroastrianism?",
        options = listOf(
            Options(text = "Avesta", isRight = true),
            Options(text = "Vedas", isRight = false),
            Options(text = "Tripitaka", isRight = false),
            Options(text = "Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the central figure in Zoroastrianism?",
        options = listOf(
            Options(text = "Zarathustra", isRight = true),
            Options(text = "Rumi", isRight = false),
            Options(text = "Mazdak", isRight = false),
            Options(text = "Ahriman", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Shintoism?",
        options = listOf(
            Options(text = "Kojiki", isRight = true),
            Options(text = "Nihon Shoki", isRight = false),
            Options(text = "Bhagavad Gita", isRight = false),
            Options(text = "Vedas", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Jainism?",
        options = listOf(
            Options(text = "Mahavira", isRight = true),
            Options(text = "Buddha", isRight = false),
            Options(text = "Adi Shankaracharya", isRight = false),
            Options(text = "Guru Nanak", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the holy book of the Baha'i Faith?",
        options = listOf(
            Options(text = "Kitab-i-Aqdas", isRight = true),
            Options(text = "Bible", isRight = false),
            Options(text = "Quran", isRight = false),
            Options(text = "Tripitaka", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of the Baha'i Faith?",
        options = listOf(
            Options(text = "Baha'u'llah", isRight = true),
            Options(text = "Abdul-Baha", isRight = false),
            Options(text = "The Bab", isRight = false),
            Options(text = "Shoghi Effendi", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Taoism?",
        options = listOf(
            Options(text = "Tao Te Ching", isRight = true),
            Options(text = "Analects", isRight = false),
            Options(text = "I Ching", isRight = false),
            Options(text = "Zhuangzi", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Taoism?",
        options = listOf(
            Options(text = "Laozi", isRight = true),
            Options(text = "Confucius", isRight = false),
            Options(text = "Zhuangzi", isRight = false),
            Options(text = "Mencius", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the central religious text of Confucianism?",
        options = listOf(
            Options(text = "Analects", isRight = true),
            Options(text = "Tao Te Ching", isRight = false),
            Options(text = "I Ching", isRight = false),
            Options(text = "Zhuangzi", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the central figure in Confucianism?",
        options = listOf(
            Options(text = "Confucius", isRight = true),
            Options(text = "Laozi", isRight = false),
            Options(text = "Mencius", isRight = false),
            Options(text = "Xunzi", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the holy book of Jainism?",
        options = listOf(
            Options(text = "Jain Agamas", isRight = true),
            Options(text = "Vedas", isRight = false),
            Options(text = "Tripitaka", isRight = false),
            Options(text = "Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the central figure in Jainism?",
        options = listOf(
            Options(text = "Mahavira", isRight = true),
            Options(text = "Siddhartha Gautama", isRight = false),
            Options(text = "Adi Shankaracharya", isRight = false),
            Options(text = "Guru Nanak", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Baha'i Faith?",
        options = listOf(
            Options(text = "Kitab-i-Aqdas", isRight = true),
            Options(text = "Vedas", isRight = false),
            Options(text = "Quran", isRight = false),
            Options(text = "Bible", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Baha'i Faith?",
        options = listOf(
            Options(text = "Baha'u'llah", isRight = true),
            Options(text = "Abdul-Baha", isRight = false),
            Options(text = "The Bab", isRight = false),
            Options(text = "Shoghi Effendi", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Jainism?",
        options = listOf(
            Options(text = "Jain Agamas", isRight = true),
            Options(text = "Vedas", isRight = false),
            Options(text = "Tripitaka", isRight = false),
            Options(text = "Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the central figure in Jainism?",
        options = listOf(
            Options(text = "Mahavira", isRight = true),
            Options(text = "Siddhartha Gautama", isRight = false),
            Options(text = "Adi Shankaracharya", isRight = false),
            Options(text = "Guru Nanak", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Sikhism?",
        options = listOf(
            Options(text = "Guru Granth Sahib", isRight = true),
            Options(text = "Vedas", isRight = false),
            Options(text = "Tripitaka", isRight = false),
            Options(text = "Quran", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Sikhism?",
        options = listOf(
            Options(text = "Guru Nanak", isRight = true),
            Options(text = "Guru Gobind Singh", isRight = false),
            Options(text = "Guru Tegh Bahadur", isRight = false),
            Options(text = "Guru Angad", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Scientology?",
        options = listOf(
            Options(text = "Dianetics: The Modern Science of Mental Health", isRight = true),
            Options(text = "The Bible", isRight = false),
            Options(text = "The Quran", isRight = false),
            Options(text = "The Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Scientology?",
        options = listOf(
            Options(text = "L. Ron Hubbard", isRight = true),
            Options(text = "David Miscavige", isRight = false),
            Options(text = "Joseph Smith", isRight = false),
            Options(text = "Elron Hurbard", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Satanism?",
        options = listOf(
            Options(text = "The Satanic Bible", isRight = true),
            Options(text = "The Bible", isRight = false),
            Options(text = "The Quran", isRight = false),
            Options(text = "The Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Satanism?",
        options = listOf(
            Options(text = "Anton LaVey", isRight = true),
            Options(text = "Aleister Crowley", isRight = false),
            Options(text = "L. Ron Hubbard", isRight = false),
            Options(text = "Marilyn Manson", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Scientology?",
        options = listOf(
            Options(text = "Dianetics: The Modern Science of Mental Health", isRight = true),
            Options(text = "The Bible", isRight = false),
            Options(text = "The Quran", isRight = false),
            Options(text = "The Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Scientology?",
        options = listOf(
            Options(text = "L. Ron Hubbard", isRight = true),
            Options(text = "David Miscavige", isRight = false),
            Options(text = "Joseph Smith", isRight = false),
            Options(text = "Elron Hurbard", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Satanism?",
        options = listOf(
            Options(text = "The Satanic Bible", isRight = true),
            Options(text = "The Bible", isRight = false),
            Options(text = "The Quran", isRight = false),
            Options(text = "The Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Satanism?",
        options = listOf(
            Options(text = "Anton LaVey", isRight = true),
            Options(text = "Aleister Crowley", isRight = false),
            Options(text = "L. Ron Hubbard", isRight = false),
            Options(text = "Marilyn Manson", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Rastafarianism?",
        options = listOf(
            Options(text = "Holy Piby", isRight = true),
            Options(text = "The Bible", isRight = false),
            Options(text = "The Quran", isRight = false),
            Options(text = "The Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is considered the messiah in Rastafarianism?",
        options = listOf(
            Options(text = "Haile Selassie", isRight = true),
            Options(text = "Marcus Garvey", isRight = false),
            Options(text = "Bob Marley", isRight = false),
            Options(text = "Peter Tosh", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Wicca?",
        options = listOf(
            Options(text = "Book of Shadows", isRight = true),
            Options(text = "The Bible", isRight = false),
            Options(text = "The Quran", isRight = false),
            Options(text = "The Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Wicca?",
        options = listOf(
            Options(text = "Gerald Gardner", isRight = true),
            Options(text = "Alex Sanders", isRight = false),
            Options(text = "Doreen Valiente", isRight = false),
            Options(text = "Margot Adler", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Shinto?",
        options = listOf(
            Options(text = "Kojiki", isRight = true),
            Options(text = "The Bible", isRight = false),
            Options(text = "The Quran", isRight = false),
            Options(text = "The Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the name of the supreme deity in Shinto?",
        options = listOf(
            Options(text = "Amaterasu", isRight = true),
            Options(text = "Susanoo", isRight = false),
            Options(text = "Izanagi", isRight = false),
            Options(text = "Izanami", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Druidry?",
        options = listOf(
            Options(text = "The Book of Shadows", isRight = true),
            Options(text = "The Bible", isRight = false),
            Options(text = "The Quran", isRight = false),
            Options(text = "The Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the name of the sacred symbol in Druidry?",
        options = listOf(
            Options(text = "Awen", isRight = true),
            Options(text = "Pentacle", isRight = false),
            Options(text = "Cross", isRight = false),
            Options(text = "Ankh", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Santeria?",
        options = listOf(
            Options(text = "Odu Ifa", isRight = true),
            Options(text = "The Bible", isRight = false),
            Options(text = "The Quran", isRight = false),
            Options(text = "The Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the main deity in Santeria?",
        options = listOf(
            Options(text = "Olodumare", isRight = true),
            Options(text = "Ogun", isRight = false),
            Options(text = "Obatala", isRight = false),
            Options(text = "Yemaya", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Jainism?",
        options = listOf(
            Options(text = "Jain Agamas", isRight = true),
            Options(text = "Vedas", isRight = false),
            Options(text = "Tripitaka", isRight = false),
            Options(text = "Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the central figure in Jainism?",
        options = listOf(
            Options(text = "Mahavira", isRight = true),
            Options(text = "Siddhartha Gautama", isRight = false),
            Options(text = "Adi Shankaracharya", isRight = false),
            Options(text = "Guru Nanak", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Baha'i Faith?",
        options = listOf(
            Options(text = "Kitab-i-Aqdas", isRight = true),
            Options(text = "Vedas", isRight = false),
            Options(text = "Quran", isRight = false),
            Options(text = "Bible", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Baha'i Faith?",
        options = listOf(
            Options(text = "Baha'u'llah", isRight = true),
            Options(text = "Abdul-Baha", isRight = false),
            Options(text = "The Bab", isRight = false),
            Options(text = "Shoghi Effendi", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Jainism?",
        options = listOf(
            Options(text = "Jain Agamas", isRight = true),
            Options(text = "Vedas", isRight = false),
            Options(text = "Tripitaka", isRight = false),
            Options(text = "Bhagavad Gita", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the central figure in Jainism?",
        options = listOf(
            Options(text = "Mahavira", isRight = true),
            Options(text = "Siddhartha Gautama", isRight = false),
            Options(text = "Adi Shankaracharya", isRight = false),
            Options(text = "Guru Nanak", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "What is the main religious text of Sikhism?",
        options = listOf(
            Options(text = "Guru Granth Sahib", isRight = true),
            Options(text = "Vedas", isRight = false),
            Options(text = "Tripitaka", isRight = false),
            Options(text = "Quran", isRight = false)
        ),
        category = QuestionCategory.Religion
    ),
    Question(
        question = "Who is the founder of Sikhism?",
        options = listOf(
            Options(text = "Guru Nanak", isRight = true),
            Options(text = "Guru Gobind Singh", isRight = false),
            Options(text = "Guru Tegh Bahadur", isRight = false),
            Options(text = "Guru Angad", isRight = false)
        ),
        category = QuestionCategory.Religion
    )
)
