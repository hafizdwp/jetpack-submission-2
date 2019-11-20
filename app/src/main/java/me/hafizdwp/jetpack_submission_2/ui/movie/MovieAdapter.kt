package me.hafizdwp.jetpack_submission_2.ui.movie

import android.view.View
import kotlinx.android.synthetic.main.movie_item.view.*
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2.base.BaseRecyclerAdapter
import me.hafizdwp.jetpack_submission_2.data.model.MovieModel

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class MovieAdapter(val items: List<MovieModel>,
                   val listener: MovieActionListener) : BaseRecyclerAdapter<MovieModel>() {

    override val itemLayoutRes: Int
        get() = R.layout.movie_item
    override val mListItem: List<MovieModel>
        get() = items
    override val useOnBindCustom: Boolean
        get() = true

    override fun onBindCustom(itemView: View, model: MovieModel, layoutPosition: Int) {
        itemView.apply {
            imgPhoto.setImageResource(model.photoResource)
            textTitle.text = model.title
            ratingBar.rating = model.rating.toFloat() / 20
            rootLayout.setOnClickListener {
                listener.onMovieClick(model)
            }
        }
    }

    override fun onBind(itemView: View, model: MovieModel) {

    }
}