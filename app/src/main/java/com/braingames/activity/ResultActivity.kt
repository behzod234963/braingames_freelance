package com.braingames.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.braingames.SharedPreferences
import com.braingames.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    @SuppressLint("SetTextI18n")
    private fun initView() {
        val menu = intent.getIntExtra("menu", 0)
        val playerLevel = intent.getIntExtra("level",1)
        var correct = 0
        var inCorrect = 0
        when (playerLevel) {
            1 -> {
                val firstLevelAnswers = intent.getIntegerArrayListExtra("firstLevelAnswers")
                when (menu) {
                    1 -> {
                        if (firstLevelAnswers?.get(0) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(1) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                binding.apply {
                                    inCorrect++
                                    tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                                }
                            }
                        }

                        if (firstLevelAnswers?.get(2) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(3) == 4) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {

                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(4) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(5) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(6) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(7) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(8) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(9) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }
                    }

                    2 -> {
                        if (firstLevelAnswers?.get(0) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(1) == 4) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(2) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(3) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(4) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(5) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(6) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(7) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(8) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(9) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }
                    }
                    3 -> {
                        if (firstLevelAnswers?.get(0) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(1) == 3) {
                            binding.apply {

                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(2) == 2) {
                            binding.apply {

                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(3) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(4) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(5) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(6) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(7) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(8) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (firstLevelAnswers?.get(9) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }
                    }
                }
            }

            2 -> {
                val secondLevelAnswers = intent.getIntegerArrayListExtra("secondLevelAnswers")
                when (menu) {
                    1 -> {
                        if (secondLevelAnswers?.get(0) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(1) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                binding.apply {
                                    inCorrect++
                                    tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                                }
                            }
                        }

                        if (secondLevelAnswers?.get(2) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(3) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {

                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(4) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(5) == 4) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(6) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(7) == 4) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(8) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(9) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }
                    }

                    2 -> {
                        if (secondLevelAnswers?.get(0) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(1) == 4) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(2) == 4) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(3) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(4) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(5) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(6) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(7) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(8) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(9) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }
                    }
                    3 -> {
                        if (secondLevelAnswers?.get(0) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(1) == 1) {
                            binding.apply {

                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(2) == 1) {
                            binding.apply {

                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(3) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(4) == 4) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(5) == 3) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(6) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(7) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(8) == 1) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }

                        if (secondLevelAnswers?.get(9) == 2) {
                            binding.apply {
                                correct++
                                tvCorrectAnswers.text = "Правильные ответы: $correct"
                            }
                        } else {
                            binding.apply {
                                inCorrect++
                                tvIncorrectAnswers.text = "Неправильные ответы: $inCorrect"
                            }
                        }
                    }
                }
            }
        }
        if(correct >= 8){
            binding.tvLevelStatus.text = " Level passed!"
            SharedPreferences(this@ResultActivity).saveStatus(true)
        }else{
            binding.tvLevelStatus.text = " Try again"
            SharedPreferences(this@ResultActivity).saveStatus(false)
        }
        binding.bTryAgainResult.setOnClickListener {
            val intent = Intent(this@ResultActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}