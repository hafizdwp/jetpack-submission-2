package me.hafizdwp.jetpack_submission_2.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

/**
 * @author hafizdwp
 * 11/11/2019
 **/
abstract class BaseFragment<ACTIVITY : BaseActivity, VM: BaseViewModel> : Fragment() {

    lateinit var mContext: Context
    lateinit var mActivity: ACTIVITY

    @get:LayoutRes
    abstract val layoutRes: Int
    abstract val mViewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = requireActivity() as ACTIVITY
        mContext = requireContext()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutRes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onReady()
    }

    abstract fun onReady()
}