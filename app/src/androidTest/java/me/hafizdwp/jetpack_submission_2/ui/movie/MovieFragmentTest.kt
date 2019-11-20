package me.hafizdwp.jetpack_submission_2.ui.movie

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2._testing.SingleFragmentActivity
import me.hafizdwp.jetpack_submission_2.utils.RecyclerViewItemCountAssertion
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * @author hafizdwp
 * 16/11/2019
 */
class MovieFragmentTest {

    @get:Rule
    val activityRule = ActivityTestRule(SingleFragmentActivity::class.java)
    private val movieFragment = MovieFragment()

    @Before
    fun setUp() {
        activityRule.activity.setFragment(movieFragment)
    }

    @Test
    fun loadMovie() {
        onView(withId(R.id.recyclerView)).apply {
            check(ViewAssertions.matches(isDisplayed()))
            check(RecyclerViewItemCountAssertion(10))
        }
    }
}