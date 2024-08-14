package com.braingames.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.braingames.databinding.FragmentGameBinding
import com.braingames.questions.Questions

class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding
    private lateinit var firstLevelQuestions: ArrayList<Questions>
    private lateinit var secondLevelQuestions: ArrayList<Questions>
    private lateinit var answers: ArrayList<Int>
    private var selected = 0
    private var questionCount = 0
    val sharedPrefs = context?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentGameBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        loadQuestions()
    }

    private fun setQuestions(questionCount: Int) {
        selected = 0
        val playerLevel = sharedPrefs?.getInt("PlayerLevel",1)
        binding.apply {
            when(playerLevel){
                1->{
                    tvQuestionNumber.text = "Question ${questionCount + 1}/${firstLevelQuestions.size}"
                    tvQuestion.text = firstLevelQuestions[questionCount].question

                    btnAnswer1.text = firstLevelQuestions[questionCount].firstVariant
                    btnAnswer2.text = firstLevelQuestions[questionCount].secondVariant
                    btnAnswer3.text = firstLevelQuestions[questionCount].thirdVariant
                    btnAnswer4.text = firstLevelQuestions[questionCount].fourthVariant
                }
                2->{
                    tvQuestionNumber.text = "Question ${questionCount + 1}/${secondLevelQuestions.size}"
                    tvQuestion.text = secondLevelQuestions[questionCount].question

                    btnAnswer1.text = secondLevelQuestions[questionCount].firstVariant
                    btnAnswer2.text = secondLevelQuestions[questionCount].secondVariant
                    btnAnswer3.text = secondLevelQuestions[questionCount].thirdVariant
                    btnAnswer4.text = secondLevelQuestions[questionCount].fourthVariant
                }
            }
        }
    }

    private fun loadQuestions() {
        val playerLevel = sharedPrefs?.getInt("PlayerLevel", 1)
        when (playerLevel) {
            1->{
                firstLevelQuestions = ArrayList()
            }
            2->{
                secondLevelQuestions = ArrayList()
            }
        }
    }

    private fun initViews() {
        answers = ArrayList()
        secondLevelQuestions = ArrayList()
        val playerLevel = sharedPrefs?.getInt("PlayerLevel",1)
        when(playerLevel){
            1->{
                binding.apply {
                    btnAnswer1.setOnClickListener {
                        selected = 1
                    }
                    btnAnswer2.setOnClickListener {
                        selected = 2
                    }
                    btnAnswer3.setOnClickListener {
                        selected = 3
                    }
                    btnAnswer4.setOnClickListener {
                        selected = 4
                    }
                    if (selected > 0) {
                        answers.add(selected)
                        questionCount++
                        if (questionCount == firstLevelQuestions.size) {

                        }
                    }
                }
            }
            2->{
                binding.apply {
                    btnAnswer1.setOnClickListener {
                        selected = 1
                    }
                    btnAnswer2.setOnClickListener {
                        selected = 2
                    }
                    btnAnswer3.setOnClickListener {
                        selected = 3
                    }
                    btnAnswer4.setOnClickListener {
                        selected = 4
                    }
                    if (selected > 0) {
                        answers.add(selected)
                        questionCount++
                        if (questionCount == secondLevelQuestions.size) {

                        }
                    }
                }
            }
        }
    }
}