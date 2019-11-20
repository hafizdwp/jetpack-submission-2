package me.hafizdwp.jetpack_submission_2.data

import me.hafizdwp.jetpack_submission_2.MyApp
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2.data.model.MovieModel
import me.hafizdwp.jetpack_submission_2.data.model.TvShowModel

/**
 * @author hafizdwp
 * 11/11/2019
 **/
object DummyData {

    private val resources = MyApp.getContext().resources

    object Movies {

        private fun getListTitle() = listOf(
                "Avengers: Infinity War",
                "Spider-Man: Into the Spider-Verse",
                "Venom",
                "Bohemian Rhapsody",
                "Robin Hood",
                "Bumblebee",
                "Aquaman",
                "A Star Is Born",
                "Mortal Engines",
                "Deadpool"
        )

        private fun getListShortDesc() = listOf(
                "As the Avengers and their allies have continued to protect the world from threats too large for any onehero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson 'Kingpin' Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers toprotect",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock n roll band Queen in 1970. Hit songs become instant classics.",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people",
                "Seasoned musician Jackson Maine discovers and falls in love with struggling artist Ally. She has just about given up on her dream to make it big as a singer until Jack coaxes her into the spotlight. But even",
                "Many thousands of years in the future, Earth cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom",
                "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boys life."
        )

        private fun getListDesc() = listOf(
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson 'Kingpin' Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock n roll band Queen in 1970. Hit songs become instant classics. When Mercurys increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt Englishcrown.",
                "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town.Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee,battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orms half-human, half-Atlantean brother and true heir to the throne.",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Allys career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "Many thousands of years in the future, Earths cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boys life."
        )

        private fun getListRating() = listOf(
                "83", "84",
                "66", "81",
                "58", "65",
                "68", "75",
                "60", "75"
        )

        private fun getListPhoto() = listOf(
                R.drawable.poster_avengerinfinity,
                R.drawable.poster_spiderman,
                R.drawable.poster_venom,
                R.drawable.poster_bohemian,
                R.drawable.poster_robinhood,
                R.drawable.poster_bumblebee,
                R.drawable.poster_aquaman,
                R.drawable.poster_a_star,
                R.drawable.poster_mortalengine,
                R.drawable.poster_deadpool
        )

        fun getListMovies(): List<MovieModel> {
            val list = arrayListOf<MovieModel>()

            val title = getListTitle()
            val shortDesc = getListShortDesc()
            val desc = getListDesc()
            val listRating = getListRating()

            getListPhoto().forEachIndexed { index, photoResource ->
                list.add(
                        MovieModel(
                                title = title[index],
                                shortDesc = shortDesc[index],
                                desc = desc[index],
                                rating = listRating[index],
                                photoResource = photoResource
                        )
                )
            }

            return list
        }
    }

    object TvShows {

        private fun getListTitle() = listOf(
                "The Flash",
                "Arrow",
                "Grey Anatomy",
                "Dragon Ball",
                "Gotham",
                "Naruto Shippuden",
                "Family Guy",
                "Doom Patrol",
                "The Simpson",
                "The Walking Dead"
        )

        private fun getListShortDesc() = listOf(
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning andfalls into a coma. Months later he awakens with the power of super speed, granting him the ability to move",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his",
                "Before there was Batman, there was GOTHAM. Everyone knows the name Commissioner Gordon. He is one of the crime worlds greatest foes, a man whose reputation is synonymous with law and order. But what is known",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the",
                "Sick, twisted, politically incorrect and Freakin Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids.",
                "The Doom Patrols members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands.",
                "Sheriffs deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way."
        )

        private fun getListDesc() = listOf(
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only 'meta-human' who was created in the wake of the accelerator explosion and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it wont be long before the world learns what Barry Allen has become The Flash.",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Gokus home. Together, they set off to find all seven dragon balls in an adventure that would change Gokus life forever. See how Goku met his life long friends Bulma, Yamcha, Krillin, Master Roshi and more. And see his adventures as a boy, all leading up to Dragonball Z and later Dragonball GT.",
                "Everyone knows the name Commissioner Gordon. He is one of the crime worlds greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordons story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the worlds most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Faceand The Joker?",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "Sick, twisted, politically incorrect and Freakin Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, hes not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues. ",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "Sheriffs deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way."
        )

        private fun getListRating() = listOf(
                "67", "58",
                "63", "72",
                "69", "75",
                "65", "61",
                "71", "73"
        )

        private fun getListPhoto() = listOf(
                R.drawable.poster_flash,
                R.drawable.poster_arrow,
                R.drawable.poster_grey_anatomy,
                R.drawable.poster_dragon_ball,
                R.drawable.poster_gotham,
                R.drawable.poster_naruto_shipudden,
                R.drawable.poster_family_guy,
                R.drawable.poster_doom_patrol,
                R.drawable.poster_the_simpson,
                R.drawable.poster_the_walking_dead)

        fun getListTvShows(): List<TvShowModel> {
            val list = arrayListOf<TvShowModel>()

            val title = getListTitle()
            val shortDesc = getListShortDesc()
            val desc = getListDesc()
            val listRating = getListRating()

            getListPhoto().forEachIndexed { index, photoResource ->
                list.add(
                        TvShowModel(
                                title = title[index],
                                shortDesc = shortDesc[index],
                                desc = desc[index],
                                rating = listRating[index],
                                photoResource = photoResource
                        )
                )
            }

            return list
        }
    }
}