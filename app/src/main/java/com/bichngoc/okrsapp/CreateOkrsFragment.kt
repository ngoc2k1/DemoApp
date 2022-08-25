package com.bichngoc.okrsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bichngoc.okrsapp.databinding.FragmentCreateOkrsBinding

class CreateOkrsFragment : Fragment() {
    private lateinit var binding: FragmentCreateOkrsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateOkrsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imagebuttonCreateBack.setOnClickListener {
            findNavController().navigate(R.id.action_createOkrsFragment_to_overviewOkrsFragment)
        }
        binding.edittextCreateSave.setOnClickListener {
            findNavController().navigate(R.id.action_createOkrsFragment_to_overviewOkrsFragment)

        }
    }
}