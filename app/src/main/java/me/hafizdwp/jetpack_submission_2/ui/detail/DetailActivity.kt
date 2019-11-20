package me.hafizdwp.jetpack_submission_2.ui.detail

import android.content.Context
import android.content.Intent
import kotlinx.android.synthetic.main.detail_activity.*
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2.base.BaseActivity
import me.hafizdwp.jetpack_submission_2.data.model.MovieModel
import me.hafizdwp.jetpack_submission_2.data.model.TvShowModel

/**
 * @author hafizdwp
 * 13/11/2019
 **/
class DetailActivity : BaseActivity() {

    companion object {
        const val EXTRA_MOVIE_DATA = "extra_movie"
        const val EXTRA_TVSHOW_DATA = "extra_tvshow"

        fun startActivity(context: Context,
                          movieModel: MovieModel? = null,
                          tvShowModel: TvShowModel? = null) {

            val intent = Intent(context, DetailActivity::class.java)
            intent.apply {
                movieModel?.let {
                    putExtra(EXTRA_MOVIE_DATA, movieModel)
                }
                tvShowModel?.let {
                    putExtra(EXTRA_TVSHOW_DATA, tvShowModel)
                }
            }

            context.startActivity(intent)
        }
    }

    override val layoutRes: Int
        get() = R.layout.detail_activity

    var movieModel: MovieModel? = null
    var tvShowModel: TvShowModel? = null


    override fun onExtractIntent() {
        movieModel = intent.getParcelableExtra(EXTRA_MOVIE_DATA)
        tvShowModel = intent.getParcelableExtra(EXTRA_TVSHOW_DATA)
    }

    override fun onReady() {
        imgBack.setOnClickListener {
            onBackPressed()
        }

        imgPhoto.setImageResource(movieModel?.photoResource ?: tvShowModel?.photoResource ?: 0)
        textTitle.text = movieModel?.title ?: tvShowModel?.title ?: "-"
        textDesc.text = movieModel?.desc ?: tvShowModel?.desc ?: "-"

        movieModel?.let {
            ratingBar.rating = it.rating.toFloat() / 20
            textRating.text = (it.rating.toFloat() / 10).toString()
        }
        tvShowModel?.let {
            ratingBar.rating = it.rating.toFloat() / 20
            textRating.text = (it.rating.toFloat() / 10).toString()
        }
    }
}