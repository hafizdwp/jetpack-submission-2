package me.hafizdwp.jetpack_submission_2.ui

import kotlinx.android.synthetic.main.main_activity.*
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2.base.BaseActivity
import me.hafizdwp.jetpack_submission_2.base.BasePagerAdapter
import me.hafizdwp.jetpack_submission_2.ui.movie.MovieFragment
import me.hafizdwp.jetpack_submission_2.ui.tv_show.TvShowFragment

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class MainActivity : BaseActivity() {

    override val layoutRes: Int
        get() = R.layout.main_activity

    var mPagerAdapter: BasePagerAdapter? = null


    override fun onExtractIntent() {

    }

    override fun onReady() {
        mPagerAdapter = BasePagerAdapter(supportFragmentManager)
        mPagerAdapter?.addFragment(
                fragment = MovieFragment.newInstance(),
                title = getString(R.string.movies)
        )
        mPagerAdapter?.addFragment(
                fragment = TvShowFragment.newInstance(),
                title = getString(R.string.tv_shows)
        )

        viewPager.adapter = mPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
