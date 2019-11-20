package me.hafizdwp.jetpack_submission_2.ui.detail

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2.utils.FakeDataDummy
import org.junit.Rule
import org.junit.Test

/**
 * @author hafizdwp
 * 16/11/2019
 */
class DetailActivityMovieTest {

    /*
    * 0. back button tampil
    * 1. image tampil
    * 2. title tampil
    * 3. rating bar terisi & tampil
    * 4. rating text tampil
    * 5. desc label tampil
    * 6. desc tampil
    * */

    val fakeMovieData = FakeDataDummy.Movies.getListMovies()[0]

    @get:Rule
    val activityRule = object : ActivityTestRule<DetailActivity>(DetailActivity::class.java) {
        override fun getActivityIntent(): Intent {
            val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
            val result = Intent(targetContext, DetailActivity::class.java)
            result.putExtra(DetailActivity.EXTRA_MOVIE_DATA, fakeMovieData)
            return result
        }
    }

    @Test
    fun loadDetail() {

        // back button
        onView(withId(R.id.imgBack)).check(matches(isDisplayed()))

        // image
        onView(withId(R.id.imgPhoto)).check(matches(isDisplayed()))

        // title
        onView(withId(R.id.textTitle)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(fakeMovieData.title)))
        }

        // rating bar
        onView(withId(R.id.ratingBar)).check(matches(isDisplayed()))

        // rating bar text
        onView(withId(R.id.textRating)).apply {
            check(matches(isDisplayed()))
            check(matches(withText((fakeMovieData.rating.toFloat() / 10).toString())))
        }

        // desc label
        onView(withId(R.id.textDescLabel)).check(matches(isDisplayed()))

        // desc
        onView(withId(R.id.textDesc)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(fakeMovieData.desc)))
        }
    }

}