package me.hafizdwp.jetpack_submission_2.ui.tv_show

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.tv_show_fragment.*
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2.data.model.TvShowModel
import me.hafizdwp.jetpack_submission_2.ui.detail.DetailActivity
import me.hafizdwp.jetpack_submission_2.utils.obtainViewModel

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class TvShowFragment : Fragment(), TvShowActionListener {

    companion object {
        fun newInstance() = TvShowFragment()
    }

    lateinit var mViewModel: TvShowViewModel
    var mAdapter: TvShowAdapter? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.tv_show_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mViewModel = obtainViewModel()

        val listTvShows = mViewModel.getListTvShows()

        mAdapter = TvShowAdapter(
                items = listTvShows,
                listener = this@TvShowFragment)

        recyclerView.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(requireContext(), 3)
        }
    }

    /**
     * TvShowActionListener implementation
     * ---------------------------------------------------------------------------------------------
     * */
    override fun onTvShowClick(data: TvShowModel) {
        DetailActivity.startActivity(
                context = requireContext(),
                tvShowModel = data)
    }
}
