package me.hafizdwp.jetpack_submission_2.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

/**
 * @author hafizdwp
 * 13/11/2019
 **/

fun <VM : ViewModel> AppCompatActivity.obtainViewModel(viewModelClass: Class<VM>) =
        ViewModelProviders.of(this, ViewModelFactory.getInstance(application)).get(viewModelClass)

fun <VM : ViewModel> androidx.fragment.app.Fragment.obtainViewModel(viewModelClass: Class<VM>) =
        ViewModelProviders.of(requireActivity(), ViewModelFactory.getInstance(requireActivity().application)).get(viewModelClass)

inline fun <reified T : ViewModel> AppCompatActivity.obtainViewModel() =
        ViewModelProviders.of(this, ViewModelFactory.getInstance(application)).get(T::class.java)

inline fun <reified VM : ViewModel> androidx.fragment.app.Fragment.obtainViewModel() =
        ViewModelProviders.of(requireActivity(), ViewModelFactory.getInstance(requireActivity().application)).get(VM::class.java)
