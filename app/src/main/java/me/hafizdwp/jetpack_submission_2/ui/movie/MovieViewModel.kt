package me.hafizdwp.jetpack_submission_2.ui.movie

import me.hafizdwp.jetpack_submission_2.base.BaseViewModel
import me.hafizdwp.jetpack_submission_2.data.DummyData

/**
 * @author hafizdwp
 * 13/11/2019
 **/
class MovieViewModel : BaseViewModel() {

    fun getListMovie() = DummyData.Movies.getListMovies()
}