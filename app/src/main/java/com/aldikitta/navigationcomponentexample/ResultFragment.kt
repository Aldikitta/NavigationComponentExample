package com.aldikitta.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.aldikitta.navigationcomponentexample.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    private lateinit var binding: FragmentResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_result, container, false)
        val inputName = requireArguments().getString("user_input_name_pt2")
        val inputEmail = requireArguments().getString("user_input_email")
        binding.textNameResult.text = inputName.toString()
        binding.textEmailResult.text = inputEmail.toString()
        binding.btnTakeMeHome.setOnClickListener{
            it.findNavController().navigate(R.id.action_resultFragment_to_homeFragment)
        }
        return binding.root
    }


}