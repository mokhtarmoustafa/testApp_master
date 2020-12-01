package com.unicom.testapp.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unicom.testapp.R


class SplashFragment : Fragment() {

    //region Members
    private val TAG = this.javaClass.simpleName
    //endregion

    //region Events
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    //endregion
    companion object {


    }

    //region Helper Functions

    //endregion
}