package me.hafizdwp.jetpack_submission_2.data.source

import me.hafizdwp.jetpack_submission_2.data.source.local.MyLocalDataSource
import me.hafizdwp.jetpack_submission_2.data.source.remote.MyRemoteDataSource

/**
 * @author hafizdwp
 * 20/11/2019
 **/
open class MyRepository(private val remoteDataSource: MyRemoteDataSource,
                        private val localDataSource: MyLocalDataSource) : MyDataSource {

    companion object {

        private var INSTANCE: MyRepository? = null

        /**
         * Returns the single instance of this class, creating it if necessary.

         * @param remoteDataSource the backend data source
         * @param localDataSource local data source (room / preference)
         *
         * @return the [MyRepository] instance
         */
        @JvmStatic
        fun getInstance(remoteDataSource: MyRemoteDataSource,
                        localDataSource: MyLocalDataSource) =
                INSTANCE ?: synchronized(MyRepository::class.java) {
                    INSTANCE ?: MyRepository(remoteDataSource, localDataSource)
                            .also { INSTANCE = it }
                }
    }
}