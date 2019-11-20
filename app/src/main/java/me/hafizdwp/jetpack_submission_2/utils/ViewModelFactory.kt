package me.hafizdwp.jetpack_submission_2.utils

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import me.hafizdwp.jetpack_submission_2.data.source.MyRepository
import me.hafizdwp.jetpack_submission_2.data.source.local.MyLocalDataSource
import me.hafizdwp.jetpack_submission_2.data.source.remote.MyRemoteDataSource
import me.hafizdwp.jetpack_submission_2.ui.movie.MovieViewModel
import me.hafizdwp.jetpack_submission_2.ui.tv_show.TvShowViewModel

/**
 * @author hafizdwp
 * 10/07/19
 **/
class ViewModelFactory private constructor(
        private val mApplication: Application,
        private val mRepository: MyRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>) =
            with(modelClass) {
                when {

                    isAssignableFrom(MovieViewModel::class.java) ->
                        MovieViewModel()
                    isAssignableFrom(TvShowViewModel::class.java) ->
                        TvShowViewModel()

                    else ->
                        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
                }
            } as T

    companion object {

        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: ViewModelFactory? = null

        @JvmStatic
        fun getInstance(application: Application) =
                INSTANCE ?: synchronized(ViewModelFactory::class.java) {
                    INSTANCE ?: ViewModelFactory(
                            mApplication = application,
                            mRepository = provideRepository(application.applicationContext)
                    )
                            .also { INSTANCE = it }
                }

        fun provideRepository(context: Context): MyRepository {
            return MyRepository.getInstance(
                    remoteDataSource = MyRemoteDataSource,
                    localDataSource = MyLocalDataSource
            )
        }
    }
}