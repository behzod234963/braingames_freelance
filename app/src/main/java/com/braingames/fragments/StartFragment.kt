package com.braingames.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.braingames.R
import com.braingames.databinding.FragmentStartBinding


class StartFragment : Fragment() {
    private lateinit var binding:FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStartBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        val sharedPrefs = context?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val levelStatus = sharedPrefs?.getBoolean("levelStatus",false)
        binding.apply {
            btnStart.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_gameFragment)
                if (levelStatus == true){
                    sharedPrefs.edit().putInt("PlayerLevel",2).apply()
                }else{
                    sharedPrefs?.edit()?.putInt("PlayerLevel",1)?.apply()
                }
            }
        }
    }
}