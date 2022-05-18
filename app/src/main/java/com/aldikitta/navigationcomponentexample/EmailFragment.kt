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
import com.aldikitta.navigationcomponentexample.databinding.FragmentEmailBinding
import com.aldikitta.navigationcomponentexample.databinding.FragmentSecondBinding

class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_email, container, false)
        val getName = requireArguments().getString("user_input_name")
        binding.btnNext.setOnClickListener {
            val bundle2 = bundleOf(
                "user_input_email" to binding.etEmail.text.toString(),
                "user_input_name_pt2" to getName
            )
            if (!TextUtils.isEmpty(binding.etEmail.text)) {
                it.findNavController()
                    .navigate(R.id.action_emailFragment_to_resultFragment, bundle2)
            } else {
                Toast.makeText(activity, "Please enter your email", Toast.LENGTH_LONG).show()

            }
        }
        return binding.root
    }


}