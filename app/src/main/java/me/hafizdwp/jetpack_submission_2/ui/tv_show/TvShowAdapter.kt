package me.hafizdwp.jetpack_submission_2.ui.tv_show

import android.view.View
import kotlinx.android.synthetic.main.tv_show_item.view.*
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2.base.BaseRecyclerAdapter
import me.hafizdwp.jetpack_submission_2.data.model.TvShowModel

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class TvShowAdapter(val items: List<TvShowModel>,
                    val listener: TvShowActionListener) : BaseRecyclerAdapter<TvShowModel>() {

    override val itemLayoutRes: Int
        get() = R.layout.movie_item
    override val mListItem: List<TvShowModel>
        get() = items
    override val useOnBindCustom: Boolean
        get() = true

    override fun onBindCustom(itemView: View, model: TvShowModel, layoutPosition: Int) {
        itemView.apply {
            imgPhoto.setImageResource(model.photoResource)
            textTitle.text = model.title
            ratingBar.rating = model.rating.toFloat() / 20
            rootLayout.setOnClickListener {
                listener.onTvShowClick(model)
            }
        }
    }

    override fun onBind(itemView: View, model: TvShowModel) {

    }
}