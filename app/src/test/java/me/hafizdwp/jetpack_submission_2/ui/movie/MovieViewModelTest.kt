package me.hafizdwp.jetpack_submission_2.ui.movie

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

/**
 * @author hafizdwp
 * 16/11/2019
 */
class MovieViewModelTest {

    private var viewModel: MovieViewModel? = null

    @Before
    fun setUp() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getListMovie() {
        val list = viewModel?.getListMovie()
        assertNotNull(list)
        assertEquals(10, list?.size)
    }
}