package com.braingames.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.braingames.R
import com.braingames.databinding.FragmentGameBinding
import com.braingames.questions.Questions

class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding
    private lateinit var firstLevelQuestions: ArrayList<Questions>
    private lateinit var secondLevelQuestions: ArrayList<Questions>
    private lateinit var firstLevelAnswers: ArrayList<Int>
    private lateinit var secondLevelAnswers: ArrayList<Int>
    private val sharedPrefs = context?.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
    private val playerLevel = sharedPrefs?.getInt("PlayerLevel", 1) ?: 1
    var selected = 0
    var questionCount = 0

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
        setQuestions(questionCount)
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestions(questionCount: Int) {
        selected = 0
        binding.apply {
            if (playerLevel == 1) {
                tvQuestion.text = firstLevelQuestions[questionCount].question
                ivQuestionBackground.setImageResource(firstLevelQuestions[questionCount].image)

                btnAnswer1.text = firstLevelQuestions[questionCount].firstVariant
                btnAnswer2.text = firstLevelQuestions[questionCount].secondVariant
                btnAnswer3.text = firstLevelQuestions[questionCount].thirdVariant
                btnAnswer4.text = firstLevelQuestions[questionCount].fourthVariant
            } else {
                tvQuestion.text = secondLevelQuestions[questionCount].question
                ivQuestionBackground.setImageResource(firstLevelQuestions[questionCount].image)

                btnAnswer1.text = secondLevelQuestions[questionCount].firstVariant
                btnAnswer2.text = secondLevelQuestions[questionCount].secondVariant
                btnAnswer3.text = secondLevelQuestions[questionCount].thirdVariant
                btnAnswer4.text = secondLevelQuestions[questionCount].fourthVariant
            }
        }
    }

    private fun loadQuestions() {
        when (playerLevel) {
            1 -> {
                firstLevelQuestions = ArrayList()

            }

            2 -> {
                secondLevelQuestions = ArrayList()
            }
        }
    }

    private fun initViews() {
        selected = 0
        questionCount = 0
        firstLevelAnswers = ArrayList()
        secondLevelAnswers = ArrayList()
        secondLevelQuestions = ArrayList()
        loadQuestions()
        setQuestions(questionCount)

        if (playerLevel == 1) {
            binding.apply {
                btnAnswer1.setOnClickListener {
                    selected = 1
                    questionCount++
                    firstLevelAnswers.add(questionCount)
                    setQuestions(questionCount)
                    if (questionCount == firstLevelQuestions.size) {
                        findNavController().navigate(
                            R.id.action_gameFragment_to_resultFragment,
                            bundleOf("results" to firstLevelAnswers.toIntArray())
                        )
                    }else{
                        setQuestions(questionCount)
                    }
                }
                btnAnswer2.setOnClickListener {
                    selected = 2
                    questionCount++
                    firstLevelAnswers.add(questionCount)
                    setQuestions(questionCount)
                    if (questionCount == firstLevelQuestions.size) {
                        findNavController().navigate(
                            R.id.action_gameFragment_to_resultFragment,
                            bundleOf("results" to firstLevelAnswers.toIntArray())
                        )
                    }else{
                        setQuestions(questionCount)
                    }
                }
                btnAnswer3.setOnClickListener {
                    selected = 3
                    questionCount++
                    firstLevelAnswers.add(questionCount)
                    setQuestions(questionCount)
                    if (questionCount == firstLevelQuestions.size) {
                        findNavController().navigate(
                            R.id.action_gameFragment_to_resultFragment,
                            bundleOf("results" to firstLevelAnswers.toIntArray())
                        )
                    }else{
                        setQuestions(questionCount)
                    }
                }
                btnAnswer4.setOnClickListener {
                    selected = 4
                    questionCount++
                    firstLevelAnswers.add(questionCount)
                    setQuestions(questionCount)
                    if (questionCount == firstLevelQuestions.size) {
                        findNavController().navigate(
                            R.id.action_gameFragment_to_resultFragment,
                            bundleOf("results" to firstLevelAnswers.toIntArray())
                        )
                    }else{
                        setQuestions(questionCount)
                    }
                }
            }
        } else {
            binding.apply {
                btnAnswer1.setOnClickListener {
                    selected = 1
                    questionCount++
                    secondLevelAnswers.add(questionCount)
                    setQuestions(questionCount)
                    if (questionCount == secondLevelQuestions.size) {
                        findNavController().navigate(
                            R.id.action_gameFragment_to_resultFragment,
                            bundleOf("results" to secondLevelAnswers.toIntArray())
                        )
                    }else{
                        setQuestions(questionCount)
                    }
                }
                btnAnswer2.setOnClickListener {
                    selected = 2
                    questionCount++
                    secondLevelAnswers.add(questionCount)
                    setQuestions(questionCount)
                    if (questionCount == secondLevelQuestions.size) {
                        findNavController().navigate(
                            R.id.action_gameFragment_to_resultFragment,
                            bundleOf("results" to secondLevelAnswers.toIntArray())
                        )
                    }else{
                        setQuestions(questionCount)
                    }
                }
                btnAnswer3.setOnClickListener {
                    selected = 3
                    questionCount++
                    secondLevelAnswers.add(questionCount)
                    setQuestions(questionCount)
                    if (questionCount == secondLevelQuestions.size) {
                        findNavController().navigate(
                            R.id.action_gameFragment_to_resultFragment,
                            bundleOf("results" to secondLevelAnswers.toIntArray())
                        )
                    }else{
                        setQuestions(questionCount)
                    }
                }
                btnAnswer4.setOnClickListener {
                    selected = 4
                    questionCount++
                    secondLevelAnswers.add(questionCount)
                    setQuestions(questionCount)
                    if (questionCount == secondLevelQuestions.size) {
                        findNavController().navigate(
                            R.id.action_gameFragment_to_resultFragment,
                            bundleOf("results" to secondLevelAnswers.toIntArray())
                        )
                    }else{
                        setQuestions(questionCount)
                    }
                }
            }
        }
    }
}