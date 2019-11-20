package me.hafizdwp.jetpack_submission_2.ui.tv_show

import me.hafizdwp.jetpack_submission_2.base.BaseViewModel
import me.hafizdwp.jetpack_submission_2.data.DummyData

/**
 * @author hafizdwp
 * 13/11/2019
 **/
class TvShowViewModel : BaseViewModel() {

    fun getListTvShows() = DummyData.TvShows.getListTvShows()
}