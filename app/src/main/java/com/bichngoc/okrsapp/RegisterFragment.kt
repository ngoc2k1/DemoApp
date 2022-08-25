package com.bichngoc.okrsapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bichngoc.okrsapp.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imagebuttonRegisterBack.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)

        }
        binding.imagebuttonRegisterNext.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            activity?.startActivity(intent)
        }
    }
}
