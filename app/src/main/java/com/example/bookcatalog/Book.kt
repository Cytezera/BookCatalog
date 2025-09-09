//Book Class

package com.example.bookcatalog

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val desc: String,
    val categories: List<String>,
    val imageId : Int
):Parcelable{
    companion object{
        val bookList = listOf(
            Book(
                id = 1,
                title ="Harry Potter and the Philosopher's Stone" ,
                author = "J.K. Rowling",
                desc = "Orphan Harry Potter discovers he is a wizard on his eleventh birthday and attends Hogwarts School of Witchcraft and Wizardry.",
                categories = listOf("Fantasy"),
                imageId = R.drawable.hp1
            ),

            Book(
                id = 2,
                title = "Harry Potter and the Chamber of Secrets",
                author = "J.K. Rowling",
                desc = "Harry's second year at Hogwarts is disrupted by mysterious petrifications and the legend of a hidden Chamber of Secrets, opened an \"heir of Slytherin\" to rid the school of muggle-borns.",
                categories = listOf("Fantasy"),
                imageId = R.drawable.hp2
            ),

            Book(
                id = 3,
                title = "Harry Potter and the Prisoner of Azkaban",
                author = "J.K. Rowling",
                desc = "Harry's third year at Hogwarts is disrupted by the escape of Sirius Black, a dangerous prisoner believed to be a Voldemort supporter hunting Harry.",
                categories = listOf("Fantasy"),
                imageId =R.drawable.hp3
            ),

            Book(
                id = 4,
                title = "Harry Potter and the Goblet of Fire",
                author = "J.K. Rowling",
                desc = "Harry is inexplicably chosen as a fourth champion in the dangerous Triwizard Tournament alongside students from other wizarding schools, leading to thrilling but perilous magical tasks. He also experiences disturbing dreams, which hint at Voldemort's return to power. During the tournament's final task, Harry and Cedric Diggory are transported to a graveyard, where Voldemort murders Cedric and attempts to kill Harry, who barely escapes.",
                categories = listOf("Fantasy"),
                imageId =R.drawable.hp4
            ),

            Book(
                id = 5,
                title = "Harry Potter and the Order of the Phoenix",
                author = "J.K. Rowling",
                desc = "Harry's fifth year at Hogwarts is marked by the Ministry of Magic's denial of Voldemort's return and the installation of the oppressive Dolores Umbridge as Defense Against the Dark Arts teacher.",
                categories = listOf("Fantasy"),
                imageId = R.drawable.hp5
            ),

            Book(
                id = 6,
                title = "Harry Potter and the Half Blood Prince",
                author = "J.K. Rowling",
                desc = "Harry learns about Voldemort's past and his quest for immortality from Dumbledore, as well as a dangeous ritual called a Horcrux.",
                categories = listOf("Fantasy"),
                imageId = R.drawable.hp6
            ),

            Book(
                id = 7,
                title = "Harry Potter and the Deathly Hallows",
                author = "J.K. Rowling",
                desc = "Harry, Ron and Hermione go on a dangerous quest to find and destroy Voldemort's Horcruxes, hidden objects containing pieces of his soul, to defeat him.",
                categories = listOf("Fantasy"),
                imageId = R.drawable.hp7
            ),

            Book(
                id = 8,
                title = "Heartless",
                author = "Marissa Meyer",
                desc = "A reimagining of the Queen of Hearts before Wonderland, where love and ambition clash in a tragic tale.",
                categories = listOf("Fantasy"),
                imageId = R.drawable.hl8
            ),

            Book(
                id = 9,
                title = "Red, White & Royal Blue",
                author = "Casey McQuiston",
                desc = "Alex Claremont-Diaz, the First Son of the United States, and Prince Henry of Wales, who must fake a friendship for international PR after a public altercation.",
                categories = listOf("Romance"),
                imageId = R.drawable.rwrb9
            ),

            Book(
                id = 10,
                title = "Just for the Summer",
                author = "Abby Jimenez",
                desc = "A contemporary romance about two strangers, Justin and Emma, who believe they are cursed because every past relationship resulted in their exes finding their soulmats with someone new.",
                categories = listOf("Romance"),
                imageId = R.drawable.jfts10
            ),

            Book(
                id = 11,
                title = "The Hating Game",
                author = "Sally Thorne",
                desc = "Lucy Hutton and Joshua Templeman, two executive assistants at a publishing company who are intense rivals and constantly engage in passive-aggressive \"games\" to get under each other's skin.",
                categories = listOf("Romance"),
                imageId = R.drawable.thg11
            ),

            Book(
                id = 12,
                title = "Icebreaker",
                author = "Hannah Grace",
                desc = "Anastasia \"Stas\" Allen, a figure skater aiming for the Olympics, and Nathan \"Nate\" Hawkins, the captain of the college hockey team. When a misunderstanding forces their teams to share a practice rink, the highly disciplined Stas and the carefree Nate clash but eventually form an alliance to get through the season, leading to a steamy romance as they overcome their initial dislike and begin to fall for each other. ",
                categories = listOf("Romance"),
                imageId = R.drawable.ib12
            ),

            Book(
                id = 13,
                title = "A Good Girl's Guide to Murder",
                author = "Holly Jackson",
                desc = "High schooler Pippa Fitz-Amobi investigates the closed case of Andie Bell's murder for her senior capstone project, a murder her small town believes was committed by her boyfriend, Sal Singh, who subsequently died by suicide.",
                categories = listOf("Mystery"),
                imageId = R.drawable.agggm13
            ),

            Book(
                id = 14,
                title = "Good Girl, Bad Blood",
                author = "Holly Jackson",
                desc = "Pippa \"Pip\" Fitz-Amobi tries to leave her detective days behind, but her true-crime podcast about the Andie Bell murder case goes viral, drawing unwanted attention. When her friend's brother, Jamie Reynolds, disappears, and the police are unhelpful, Pip investigates, uncovering dark secrets connected to him. With the help of Ravi Singh, Pip must navigate a dangerous investigation that delves into past town secrets and puts everyone she knows at risk. ",
                categories = listOf("Mystery"),
                imageId = R.drawable.ggbb14
            ),

            Book(
                id = 15,
                title = "As Good as Dead",
                author = "Holly Jackson",
                desc = "Pippa Fitz-Amobi is preparing for university but is haunted by the aftermath of her previous investigations, suffering from PTSD and anonymous death threats, only to discover a real-life stalker.",
                categories = listOf("Mystery"),
                imageId = R.drawable.agad15
            ),

            Book(
                id = 16,
                title = "Blue Lock: Episode Nagi 1",
                author = "Sannomiya, Kota",
                desc = "Second-year high school student Reo Mikage wants nothing more than to escape his illustrious family's shadow by becoming a soccer star and winning the World Cup. The only thing that's missing is a talented diamond in the rough who can help him achieve his dream. That's when he sets his sights on Seishiro Nagi, a notorious slacker whose quick reflexes are the only hint of athletic ability. Can Reo find the switch to awaken the beast inside Nagi?",
                categories = listOf("Comic"),
                imageId = R.drawable.bluelock16
            ),

            Book(
                id = 17,
                title = "Blue Lock: Episode Nagi 2",
                author = "Sannomiya, Kota",
                desc = "Second-year high school student Reo Mikage wants nothing more than to escape his illustrious family's shadow by becoming a soccer star and winning the World Cup. The only thing that's missing is a talented diamond in the rough who can help him achieve his dream. That's when he sets his sights on Seishiro Nagi, a notorious slacker whose quick reflexes are the only hint of athletic ability. Can Reo find the switch to awaken the beast inside Nagi?",
                categories = listOf("Comic"),
                imageId = R.drawable.bluelock17
            ),

            Book(
                id = 18,
                title = "Blue Lock: Episode Nagi 3",
                author = "Sannomiya, Kota",
                desc = "Second-year high school student Reo Mikage wants nothing more than to escape his illustrious family's shadow by becoming a soccer star and winning the World Cup. The only thing that's missing is a talented diamond in the rough who can help him achieve his dream. That's when he sets his sights on Seishiro Nagi, a notorious slacker whose quick reflexes are the only hint of athletic ability. Can Reo find the switch to awaken the beast inside Nagi?",
                categories = listOf("Comic"),
                imageId = R.drawable.bluelock18
            ),

            Book(
                id = 19,
                title = "Big Nate: Attack of the Cheez Funk Breath",
                author = "Lincoln Peirce",
                desc = "Snack-loving sixth-grader Nate Wright always has his hands full—of Cheez Doodles! But those delicious orange curls make his breath stink, and when he tries to quit them cold turkey, poor Nate's a hot mess. And that's not the end of his problems. Out of nowhere, Nate gets dumped by his best buddy Francis. He strikes out at the school dance. And a close encounter at the beach with a spiky-haired look-alike has everyone seeing double. Can our favorite troublemaker turn the funk back into fun?",
                categories = listOf("Comic"),
                imageId = R.drawable.bn19
            ),

            Book(
                id = 20,
                title = "Big Nate: This Means War!",
                author = "Lincoln Peirce",
                desc = "Big Nate is a legend at P.S. 38, where he and friends Francis, Teddy, Dee Dee, Chad, and others manage to make sixth grade interesting with all kinds of pranks, drama, sports, and good times. The all-time leader in detentions, Nate is never far from the spotlight, whether it's for a freak injury on the soccer field, Halloween costume fail, or stirring up a new episode in his long-running rivalry with grade-grubbing Gina or his teacher nemesis, Mrs. Godfrey.",
                categories = listOf("Comic"),
                imageId = R.drawable.bn20
            ),

            Book(
                id = 21,
                title = "Hieroglyphs: A Very Short Introduction",
                author = "Penelope Wilson",
                desc = "Hieroglyphs were far more than a language. They were an omnipresent and all-powerful force in communicating the messages of ancient Egyptian culture for over three thousand years. This work explores the cultural significance of the script and looks at areas such as cryptography and the decipherment into modern times.",
                categories = listOf("Archaeology & Prehistory"),
                imageId = R.drawable.hvsi21
            ),

            Book(
                id = 22,
                title = "The Oxford Handbook of Prehistoric Oceania",
                author = "Terry L. Hunt",
                desc = "The Oxford Handbook of Prehistoric Oceania presents the archaeology, linguistics, environment and human biology of Melanesia, Micronesia, and Polynesia. First colonized 50,000 years ago, Oceania witnessed the independent invention of agriculture, the construction of Easter Island's statues, and the development of the word's last archaic states.",
                categories = listOf("Archaeology & Prehistory"),
                imageId = R.drawable.tohpo22
            ),

            Book(
                id = 23,
                title = "The House Saphir",
                author = "Marissa Meyer",
                desc = "Mallory Fontaine is a fraud. Though she comes from a long line of witches, the only magic she possesses is the ability to see ghosts. She and her sister eke out a living by selling fraudulent spells to gullible buyers and conducting tours of the mansion of Count Bastien Saphir - who killed three of his wives more than a century ago. But she never expected to meet his great-grandson and heir to the Saphir estate. Armand is handsome, wealthy and when he offers Mallory a large sum of money to rid his home of Bastien's ghost, she can't resist.",
                categories = listOf("Fantasy"),
                imageId = R.drawable.ths23
            )
        )
    }
}



