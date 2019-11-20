package me.hafizdwp.jetpack_submission_2.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

/**
 * @author hafizdwp
 * 11/11/2019
 **/
abstract class BaseRecyclerAdapter<MODEL> :
    RecyclerView.Adapter<BaseRecyclerAdapter<MODEL>.BaseViewHolder>() {

    @get:LayoutRes
    abstract val itemLayoutRes: Int
    abstract val mListItem: List<MODEL>

    abstract fun onBind(itemView: View, model: MODEL)

    open val useOnBindCustom: Boolean = false
    open fun onBindCustom(itemView: View, model: MODEL, layoutPosition: Int) {}

    open fun onGetItemCount(): Int {
        return mListItem.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(itemLayoutRes, parent, false)
        return BaseViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bind(mListItem[position])
    }

    override fun getItemCount(): Int {
        return onGetItemCount()
    }

    inner class BaseViewHolder(private val mItemView: View) : RecyclerView.ViewHolder(mItemView) {
        fun bind(model: MODEL) {
            if (useOnBindCustom)
                onBindCustom(mItemView, model, layoutPosition)
            else
                onBind(mItemView, model)
        }
    }
}