package me.hafizdwp.jetpack_submission_2.ui

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2.utils.ViewPagerItemCountAssertion
import org.junit.Rule
import org.junit.Test

/**
 * @author hafizdwp
 * 16/11/2019
 */
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testTabLayout() {
        Espresso.onView(ViewMatchers.withId(R.id.viewPager)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            check(ViewPagerItemCountAssertion(2))
        }
    }
}