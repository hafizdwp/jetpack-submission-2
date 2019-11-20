package me.hafizdwp.jetpack_submission_2.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.movie_fragment.*
import me.hafizdwp.jetpack_submission_2.R
import me.hafizdwp.jetpack_submission_2.data.model.MovieModel
import me.hafizdwp.jetpack_submission_2.ui.detail.DetailActivity
import me.hafizdwp.jetpack_submission_2.utils.obtainViewModel

/**
 * @author hafizdwp
 * 11/11/2019
 **/
class MovieFragment : Fragment() , MovieActionListener {

    companion object {
        fun newInstance() = MovieFragment()
    }

    lateinit var mViewModel: MovieViewModel
    var mAdapter: MovieAdapter? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.movie_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mViewModel = obtainViewModel()

        val listMovies = mViewModel.getListMovie()

        mAdapter = MovieAdapter(
                items = listMovies,
                listener = this@MovieFragment
        )

        recyclerView.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(requireContext(), 6).apply {
                spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
                    override fun getSpanSize(position: Int): Int {
                        return when (position) {
                            0, 1, 2 -> 2
                            3, 4 -> 3
                            else -> 2
                        }
                    }
                }
            }
        }
    }

    /**
     * MovieActionListener implementations
     * ---------------------------------------------------------------------------------------------
     * */
    override fun onMovieClick(data: MovieModel) {
        DetailActivity.startActivity(
                context = requireContext(),
                movieModel = data)
    }
}
