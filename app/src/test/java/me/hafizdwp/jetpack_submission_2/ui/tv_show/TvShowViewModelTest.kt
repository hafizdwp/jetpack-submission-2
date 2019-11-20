package me.hafizdwp.jetpack_submission_2.ui.tv_show

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

/**
 * @author hafizdwp
 * 16/11/2019
 */
class TvShowViewModelTest {

    private var viewModel: TvShowViewModel? = null

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getListTvShows() {
        val list = viewModel?.getListTvShows()
        assertNotNull(list)
        assertEquals(10, list?.size)
    }
}