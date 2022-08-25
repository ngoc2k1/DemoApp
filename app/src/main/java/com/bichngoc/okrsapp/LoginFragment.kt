package com.bichngoc.okrsapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bichngoc.okrsapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textviewLoginCreateaccount.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        binding.imagebuttonLoginNext.setOnClickListener {
            activity?.let{
                val intent = Intent (it, MainActivity::class.java)
                it.startActivity(intent)
            }
        }
    }
}