package com.mikekrysan.module26_6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import timber.log.Timber


class twoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        Timber.d(arguments.toString())

        super.onViewCreated(view, savedInstanceState)

        button_next.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.threeFragment)
        }

        button_prev.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.oneFragment)
        }
    }
}