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
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image1,
                        question = "Треугольник это-",
                        firstVariant = "Четырёхугольная призма",
                        secondVariant = "Геометрическая фигура образованная тремя отрезками которые соединяют три точки, не лежащие на одной прямой",
                        thirdVariant = "Фигура которого все грани которой являются параллелограммами",
                        fourthVariant = "Треугольник, образуемый точками пересечения линий",
                        answer = 2
                    )
                )
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image2,
                        question = "На каком варианте указано квадрат?",
                        firstVariant = "Фигура которого число строк совпадает с числом столбцов",
                        secondVariant = "Четырёхугольник, у которого все углы прямые ",
                        thirdVariant = "Четырёхугольник, у которого противолежащие стороны попарно параллельны, то есть лежат на параллельных прямых",
                        fourthVariant = "Плоский четырёхугольник, у которого все углы и все стороны равны",
                        answer = 4
                    )
                )
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image3,
                        question = "На каком варианте указано правильное описание куба?",
                        firstVariant = "Геометрическая фигура образованная тремя отрезками которые соединяют три точки, не лежащие на одной прямой",
                        secondVariant = "Многогранник, поверхность которого состоит из шести квадратов",
                        thirdVariant = "Четырёхугольник, которого число строк совпадает с числом столбцов",
                        fourthVariant = "Четырёхугольник, у которого все углы прямые",
                        answer = 2
                    )
                )
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image4,
                        question = "Кому в голову упало яблоко?",
                        firstVariant = "Исаак Нютон",
                        secondVariant = "Аврам Линкольн",
                        thirdVariant = "Галилео Галилей",
                        fourthVariant = "Николай Коперник",
                        answer = 1
                    )
                )
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image5,
                        question = "Кто сказал слово \"Эврика\"? ",
                        firstVariant = "Плутон",
                        secondVariant = "Аристотель",
                        thirdVariant = "Авиценна",
                        fourthVariant = "Архимед",
                        answer = 4
                    )
                )
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image6,
                        question = "Кто изобрёл лампу накаливания?",
                        firstVariant = "Томас Эдисон",
                        secondVariant = "Никола Тесла",
                        thirdVariant = "Альберт Эйнштейн",
                        fourthVariant = "Вильгельм Рентген",
                        answer = 1
                    )
                )
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image7,
                        question = "Столица Италии это-",
                        firstVariant = "Париж",
                        secondVariant = "Мадрид",
                        thirdVariant = "Рим",
                        fourthVariant = "Милан",
                        answer = 3
                    )
                )
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image8,
                        question = "Спутник земли это-",
                        firstVariant = "Луна",
                        secondVariant = "Сольнце",
                        thirdVariant = "Марс",
                        fourthVariant = "Сатурн",
                        answer = 1
                    )
                )
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image9,
                        question = "Самая большая планета в солнечной системе?",
                        firstVariant = "Нептун",
                        secondVariant = "Юпитер",
                        thirdVariant = "Земля",
                        fourthVariant = "Венера",
                        answer = 2
                    )
                )
                firstLevelQuestions.add(
                    Questions(
                        image = R.drawable.first_level_question_image10,
                        question = "Самая длинная река на земле?",
                        firstVariant = "Амазонка",
                        secondVariant = "Ниль",
                        thirdVariant = "Ниагара",
                        fourthVariant = "Миссисипи",
                        answer = 1
                    )
                )
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