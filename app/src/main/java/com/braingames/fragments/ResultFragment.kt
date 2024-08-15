package com.braingames.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.braingames.R
import com.braingames.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private lateinit var binding : FragmentResultBinding
    val args:ResultFragmentArgs by navArgs()
    private val sharedPrefs = context?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
    private val playerLevel = sharedPrefs?.getInt("PlayerLevel", 1) ?: 1
    var correctAnswers = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        val answers = args.results.asList()
        checkAnswer(answers)
    }

    private fun checkAnswer(answers:List<Int>) {

        when(playerLevel){
            1->{

                if (answers[0] == 2) {
                    binding.apply {
                        tvAnswer1Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer1Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
                if (answers[1] == 4) {
                    binding.apply {
                        tvAnswer2Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer2Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
                if (answers[2] == 2) {
                    binding.apply {
                        tvAnswer3Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer3Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
                if (answers[3] == 1) {
                    binding.apply {
                        tvAnswer4Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer4Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
                if (answers[4] == 4) {
                    binding.apply {
                        tvAnswer5Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer5Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
                if (answers[5] == 1) {
                    binding.apply {
                        tvAnswer6Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer6Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
                if (answers[6] == 3) {
                    binding.apply {
                        tvAnswer7Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer7Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
                if (answers[7] == 1) {
                    binding.apply {
                        tvAnswer8Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer8Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
                if (answers[8] == 2) {
                    binding.apply {
                        tvAnswer9Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer9Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
                if (answers[9] == 1) {
                    binding.apply {
                        tvAnswer10Result.background = getDrawable(requireContext(),R.drawable.bg_correct)
                        correctAnswers += 1
                    }
                }else {
                    binding.apply {
                        tvAnswer10Result.background = getDrawable(requireContext(),R.drawable.bg_incorrect)
                    }
                }
            }
            2->{}
        }
    }
}