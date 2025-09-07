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

            )
        )



    }
}



