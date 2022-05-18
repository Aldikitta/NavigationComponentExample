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
import com.aldikitta.navigationcomponentexample.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.btnSignup.setOnClickListener {
//                val bundle = bundleOf("user_input" to binding.editText.text.toString())
            it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }

        binding.btnViewTerms.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_termsFragment)
        }

        return binding.root
    }

}