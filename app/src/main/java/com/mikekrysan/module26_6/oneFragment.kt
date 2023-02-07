package com.mikekrysan.module26_6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_one.*


class oneFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_next.setOnClickListener {
            //Первый способ передачи данных при помощи  Bundle
//            val bundle = Bundle()
//            bundle.putString("arg1", "Hello!")

            //Второй способ передачи информации при помощи навигационного графа
//            (activity as MainActivity).navController.navigate(R.id.action_oneFragment_to_threeFragment, bundle)
            view.findNavController().navigate(R.id.action_oneFragment_to_threeFragment)
        }

        button_prev.setOnClickListener {
            Toast.makeText(requireContext(), "No more fragments", Toast.LENGTH_SHORT).show()
        }
    }
}