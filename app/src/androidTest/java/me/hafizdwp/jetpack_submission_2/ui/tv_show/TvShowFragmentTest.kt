package me.hafizdwp.jetpack_submission_2.ui.tv_show

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
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
class TvShowFragmentTest {

    @get:Rule
    val activityRule = ActivityTestRule(SingleFragmentActivity::class.java)
    private val tvShowFragment = TvShowFragment()

    @Before
    fun setUp() {
        activityRule.activity.setFragment(tvShowFragment)
    }

    @Test
    fun loadMovie() {
        Espresso.onView(ViewMatchers.withId(R.id.recyclerView)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            check(RecyclerViewItemCountAssertion(10))
        }
    }
}