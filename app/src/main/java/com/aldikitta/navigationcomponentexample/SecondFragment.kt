package com.aldikitta.navigationcomponentexample

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.aldikitta.navigationcomponentexample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)
        binding.btnNext.setOnClickListener {
            val bundle = bundleOf("user_input_name" to binding.etName.text.toString())
            if (!TextUtils.isEmpty(binding.etName.text)) {
                it.findNavController().navigate(R.id.action_secondFragment_to_emailFragment, bundle)
            } else {
                Toast.makeText(activity, "Please enter your name", Toast.LENGTH_LONG).show()
            }
        }
        return binding.root
    }

}