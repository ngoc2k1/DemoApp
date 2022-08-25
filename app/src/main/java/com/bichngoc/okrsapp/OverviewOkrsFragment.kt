package com.bichngoc.okrsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bichngoc.okrsapp.databinding.FragmentOverviewOkrsBinding
import com.bichngoc.okrsapp.databinding.FragmentRegisterBinding

class OverviewOkrsFragment : Fragment () {
    private lateinit var binding: FragmentOverviewOkrsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOverviewOkrsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonOverviewAdd.setOnClickListener {
            findNavController().navigate(R.id.action_overviewOkrsFragment_to_createOkrsFragment)
        }
    }
}