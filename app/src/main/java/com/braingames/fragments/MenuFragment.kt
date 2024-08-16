package com.braingames.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.braingames.R
import com.braingames.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var binding:FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.apply {
            ivGeometry.setOnClickListener {
                findNavController().navigate(R.id.action_menuFragment_to_gameFragment, bundleOf("menu" to 1))
            }
            ivPhysics.setOnClickListener {
                findNavController().navigate(R.id.action_menuFragment_to_gameFragment, bundleOf("menu" to 2))
            }
            ivGeography.setOnClickListener {
                findNavController().navigate(R.id.action_menuFragment_to_gameFragment, bundleOf("menu" to 3))
            }
        }
    }
}