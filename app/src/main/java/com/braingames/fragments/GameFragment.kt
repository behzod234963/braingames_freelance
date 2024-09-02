package com.braingames.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.braingames.R
import com.braingames.SharedPreferences
import com.braingames.activity.ResultActivity
import com.braingames.databinding.FragmentGameBinding
import com.braingames.questions.Questions

class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding
    private lateinit var firstLevelGeometryQuestions: ArrayList<Questions>
    private lateinit var firstLevelGeographyQuestions: ArrayList<Questions>
    private lateinit var firstLevelPhysicsQuestions: ArrayList<Questions>
    private lateinit var secondLevelGeometryQuestions: ArrayList<Questions>
    private lateinit var secondLevelGeographyQuestions: ArrayList<Questions>
    private lateinit var secondLevelPhysicsQuestions: ArrayList<Questions>
    private lateinit var firstLevelAnswers: ArrayList<Int>
    private lateinit var secondLevelAnswers: ArrayList<Int>
    private var isBtn1 = false
    private var isBtn2 = false
    private var isBtn3 = false
    private var isBtn4 = false

    private val menuArgs: GameFragmentArgs by navArgs()
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
        loadQuestions()
        initViews()
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestions(questionCount: Int) {
        val status = SharedPreferences(requireContext()).getStatus()

        if (status) {
            SharedPreferences(requireContext()).saveLevel(2)
        } else {
            SharedPreferences(requireContext()).saveLevel(1)
        }
        val playerLevel = SharedPreferences(requireContext()).getLevel()
        var selected = 0
        binding.apply {
            try {
                if (playerLevel == 1) {
                    when (menuArgs.menu) {
                        1 -> {
                            tvQuestion.text = firstLevelGeometryQuestions[questionCount].question
                            ivQuestionBackground.setImageResource(R.drawable.ic_geometry)

                            btnAnswer1.text = firstLevelGeometryQuestions[questionCount].firstVariant
                            btnAnswer2.text = firstLevelGeometryQuestions[questionCount].secondVariant
                            btnAnswer3.text = firstLevelGeometryQuestions[questionCount].thirdVariant
                            btnAnswer4.text = firstLevelGeometryQuestions[questionCount].fourthVariant

                        }

                        2 -> {
                            tvQuestion.text = firstLevelPhysicsQuestions[questionCount].question
                            ivQuestionBackground.setImageResource(R.drawable.ic_physics)

                            btnAnswer1.text = firstLevelPhysicsQuestions[questionCount].firstVariant
                            btnAnswer2.text = firstLevelPhysicsQuestions[questionCount].secondVariant
                            btnAnswer3.text = firstLevelPhysicsQuestions[questionCount].thirdVariant
                            btnAnswer4.text = firstLevelPhysicsQuestions[questionCount].fourthVariant

                        }

                        3 -> {

                            tvQuestion.text = firstLevelGeographyQuestions[questionCount].question
                            ivQuestionBackground.setImageResource(R.drawable.ic_geography)

                            btnAnswer1.text = firstLevelGeographyQuestions[questionCount].firstVariant
                            btnAnswer2.text = firstLevelGeographyQuestions[questionCount].secondVariant
                            btnAnswer3.text = firstLevelGeographyQuestions[questionCount].thirdVariant
                            btnAnswer4.text = firstLevelGeographyQuestions[questionCount].fourthVariant

                        }
                    }
                } else {
                    when (menuArgs.menu) {
                        1 -> {
                            tvQuestion.text = secondLevelGeometryQuestions[questionCount].question
                            ivQuestionBackground.setImageResource(R.drawable.ic_geometry)

                            btnAnswer1.text = secondLevelGeometryQuestions[questionCount].firstVariant
                            btnAnswer2.text = secondLevelGeometryQuestions[questionCount].secondVariant
                            btnAnswer3.text = secondLevelGeometryQuestions[questionCount].thirdVariant
                            btnAnswer4.text = secondLevelGeometryQuestions[questionCount].fourthVariant
                        }

                        2 -> {
                            tvQuestion.text = secondLevelPhysicsQuestions[questionCount].question
                            ivQuestionBackground.setImageResource(R.drawable.ic_physics)

                            btnAnswer1.text = secondLevelPhysicsQuestions[questionCount].firstVariant
                            btnAnswer2.text = secondLevelPhysicsQuestions[questionCount].secondVariant
                            btnAnswer3.text = secondLevelPhysicsQuestions[questionCount].thirdVariant
                            btnAnswer4.text = secondLevelPhysicsQuestions[questionCount].fourthVariant
                        }

                        3 -> {
                            tvQuestion.text = secondLevelGeographyQuestions[questionCount].question
                            ivQuestionBackground.setImageResource(R.drawable.ic_geography)

                            btnAnswer1.text = secondLevelGeographyQuestions[questionCount].firstVariant
                            btnAnswer2.text = secondLevelGeographyQuestions[questionCount].secondVariant
                            btnAnswer3.text = secondLevelGeographyQuestions[questionCount].thirdVariant
                            btnAnswer4.text = secondLevelGeographyQuestions[questionCount].fourthVariant
                        }
                    }
                }
            }catch (_:IndexOutOfBoundsException){ }
        }
    }

    private fun loadQuestions() {
        firstLevelGeometryQuestions = ArrayList()
        firstLevelPhysicsQuestions = ArrayList()
        firstLevelGeographyQuestions = ArrayList()
        val status = SharedPreferences(requireContext()).getStatus()

        if (status) {
            SharedPreferences(requireContext()).saveLevel(2)
        } else {
            SharedPreferences(requireContext()).saveLevel(1)
        }
        val playerLevel = SharedPreferences(requireContext()).getLevel()

        when (playerLevel) {
            1 -> {
                when (menuArgs.menu) {
                    1 -> {
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Что такое площадь круга?",
                                firstVariant = "πr",
                                secondVariant = "2πr",
                                thirdVariant = "πr^2",
                                fourthVariant = "2r^2π",
                                answer = 3
                            )
                        )
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Что такое периметр квадрата со стороной a?",
                                firstVariant = "4a",
                                secondVariant = "a^2",
                                thirdVariant = "2a",
                                fourthVariant = "3a",
                                answer = 1
                            )
                        )
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Как называется фигура, у которой все стороны равны между собой?",
                                firstVariant = "Прямоугольник",
                                secondVariant = "Ромб",
                                thirdVariant = "Параллелограмм",
                                fourthVariant = "Трапеция",
                                answer = 2
                            )
                        )
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Какая фигура имеет все стороны и углы равными?",
                                firstVariant = "Прямоугольник",
                                secondVariant = "Параллелограмм",
                                thirdVariant = "Равнобедренный треугольник",
                                fourthVariant = "Равносторонний треугольник",
                                answer = 4
                            )
                        )
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Что такое диаметр окружности?",
                                firstVariant = "Длина окружности",
                                secondVariant = "Отрезок, соединяющий центр окружности с какой-либо точкой на ней",
                                thirdVariant = "Половина радиуса",
                                fourthVariant = "Отрезок, соединяющий любые две точки на окружности",
                                answer = 2
                            )
                        )
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Сколько основных видов углов существует в геометрии?",
                                firstVariant = "4",
                                secondVariant = "5",
                                thirdVariant = "6",
                                fourthVariant = "7",
                                answer = 3
                            )
                        )
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Чему равен угол в 90 градусов?",
                                firstVariant = "Тупому углу",
                                secondVariant = "Прямому углу",
                                thirdVariant = "Острому углу",
                                fourthVariant = "Нулю",
                                answer = 2
                            )
                        )
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Что такое трапеция?",
                                firstVariant = "Фигура, у которой все стороны равны",
                                secondVariant = "Фигура, у которой две противоположные стороны параллельны",
                                thirdVariant = "Фигура, у которой все углы прямые",
                                fourthVariant = "Фигура, у которой два угла равны между собой",
                                answer = 2
                            )
                        )
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Что такое касательная к окружности?",
                                firstVariant = "Прямая, касающаяся окружности в одной точке",
                                secondVariant = "Прямая, проходящая через центр окружности",
                                thirdVariant = "Прямая, пересекающая окружность",
                                fourthVariant = "Луч, исходящий из центра окружности",
                                answer = 1
                            )
                        )
                        firstLevelGeometryQuestions.add(
                            Questions(
                                question = "Как называется треугольник, у которого все углы острые?",
                                firstVariant = "Прямоугольный",
                                secondVariant = "Тупоугольный",
                                thirdVariant = "Остроугольный",
                                fourthVariant = "Равнобедренный",
                                answer = 3
                            )
                        )
                        //fG10
                    }

                    2 -> {
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Что выражает закон всемирного тяготения?",
                                firstVariant = "Закон Архимеда",
                                secondVariant = "Второй закон Ньютона",
                                thirdVariant = "Закон всемирного тяготения Ньютона",
                                fourthVariant = "Закон сохранения энергии",
                                answer = 3
                            )
                        )
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Как называется явление изменения направления распространения света при переходе из одной среды в другую?\n",
                                firstVariant = "Дифракция",
                                secondVariant = "Дисперсия",
                                thirdVariant = "Отражение",
                                fourthVariant = "Преломление",
                                answer = 4
                            )
                        )
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Что является единицей измерения работы?",
                                firstVariant = "Ватт",
                                secondVariant = "Джоуль",
                                thirdVariant = "Килограмм",
                                fourthVariant = "Метр в секунду",
                                answer = 2
                            )
                        )
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Что описывает закон сохранения энергии?",
                                firstVariant = "Энергия не может быть создана или уничтожена, только преобразована из одной формы в другую",
                                secondVariant = "Энергия всегда направлена от холодного тела к горячему",
                                thirdVariant = "Энергия сохраняется только при равномерном движении тела",
                                fourthVariant = "Энергия не имеет важного значения в законах физики",
                                answer = 1
                            )
                        )
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Какой закон физики утверждает, что на каждое действие найдётся равное и противоположно направленное противодействие?",
                                firstVariant = "Закон сохранения импульса",
                                secondVariant = "Закон всемирного тяготения Ньютона",
                                thirdVariant = "Третий закон Ньютона",
                                fourthVariant = "Закон Ампера",
                                answer = 3
                            )
                        )
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Что определяет ускорение тела?",
                                firstVariant = "Сила, действующая на тело",
                                secondVariant = "Масса тела",
                                thirdVariant = "Гравитация",
                                fourthVariant = "Объём тела",
                                answer = 1
                            )
                        )
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Что такое сила в физике?",
                                firstVariant = "Мгновенный поворотный момент",
                                secondVariant = "Величина, способная изменить состояние движения тела",
                                thirdVariant = "Способность тела притягивать другие тела",
                                fourthVariant = "Единица измерения давления",
                                answer = 2
                            )
                        )
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Что такое частота?",
                                firstVariant = "Величина размаха колебаний",
                                secondVariant = "Время выполнения одного полного колебания",
                                thirdVariant = "Количество колебаний за единицу времени",
                                fourthVariant = "Максимальная скорость в колебательном движении",
                                answer = 3
                            )
                        )
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Какая величина измеряет сопротивление электрическому току?",
                                firstVariant = "Вольт",
                                secondVariant = "Ампер",
                                thirdVariant = "Ом",
                                fourthVariant = "Ватт",
                                answer = 3
                            )
                        )
                        firstLevelPhysicsQuestions.add(
                            Questions(
                                question = "Сколько элементарных зарядов содержится в одном кулоне?",
                                firstVariant = "6.24x10^18",
                                secondVariant = "1.6x10^-19",
                                thirdVariant = "1.6x10^-19",
                                fourthVariant = "1.6x10^-38",
                                answer = 1
                            )
                        )
                        //fP10
                    }

                    3 -> {
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "Как называется линия, соединяющая точки с одинаковой температурой на карте?",
                                firstVariant = "Изогипса",
                                secondVariant = "Изотерма",
                                thirdVariant = "Изобата",
                                fourthVariant = "Изоляция",
                                answer = 1
                            )
                        )
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "Какой материк является самым большим?",
                                firstVariant = "Африка",
                                secondVariant = "Южная Америка",
                                thirdVariant = "Евразия",
                                fourthVariant = "Австралия",
                                answer = 3
                            )
                        )
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "Какая страна имеет наибольшее количество соседних государств?",
                                firstVariant = "Китай",
                                secondVariant = "Россия",
                                thirdVariant = "Бразилия",
                                fourthVariant = "Германия",
                                answer = 2
                            )
                        )
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "Как называется самое глубокое озеро в мире?",
                                firstVariant = "Байкал",
                                secondVariant = "Танганьика",
                                thirdVariant = "Виктория",
                                fourthVariant = "Мичиган",
                                answer = 1
                            )
                        )
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "Где находится Сахарский пустыня?",
                                firstVariant = "Азия",
                                secondVariant = "Южная Америка",
                                thirdVariant = "Африка",
                                fourthVariant = "Австралия",
                                answer = 3
                            )
                        )
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "В каком океане находится Бермудский треугольник?",
                                firstVariant = "Тихий",
                                secondVariant = "Атлантический",
                                thirdVariant = "Индийский",
                                fourthVariant = "Северный Ледовитый",
                                answer = 2
                            )
                        )
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "Где находится Гималаи?",
                                firstVariant = "Африка",
                                secondVariant = "Южная Америка",
                                thirdVariant = "Азия",
                                fourthVariant = "Европа",
                                answer = 3
                            )
                        )
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "Какое из этих озер находится в Северной Америке?",
                                firstVariant = "Байкал",
                                secondVariant = "Танганьика",
                                thirdVariant = "Мичиган",
                                fourthVariant = "Балхаш",
                                answer = 3
                            )
                        )
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "В какой стране находится самая высокая гора мира - Эверест?",
                                firstVariant = "Тибет",
                                secondVariant = "Непал",
                                thirdVariant = "Индия",
                                fourthVariant = "Пакистан",
                                answer = 2
                            )
                        )
                        firstLevelGeographyQuestions.add(
                            Questions(
                                question = "Как называется главная река в Европе?",
                                firstVariant = "Рейн",
                                secondVariant = "Нил",
                                thirdVariant = "Дунай",
                                fourthVariant = "Волга",
                                answer = 3
                            )
                        )
                    }
                }
            }

            2 -> {
                when (menuArgs.menu) {
                    1 -> {
                        secondLevelGeometryQuestions = ArrayList()
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Какая формула используется для расчета объема прямоугольного параллелепипеда?",
                                firstVariant = "V = a^2",
                                secondVariant = "V = a*b*h",
                                thirdVariant = "V = 2*(a+b)",
                                fourthVariant = "V = πr^2*h",
                                answer = 2
                            )
                        )
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Что такое теорема Пифагора?",
                                firstVariant = "a^2 + b^2 = c^2",
                                secondVariant = "c^2 = a^2 - b^2",
                                thirdVariant = "a*b*c = V",
                                fourthVariant = "x = -b±√b^2-4ac/2a",
                                answer = 1
                            )
                        )
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Что такое радиус окружности?",
                                firstVariant = "Отрезок, соединяющий центр окружности с точкой на ней",
                                secondVariant = "Половина длины окружности",
                                thirdVariant = "Отрезок, соединяющий две точки на окружности",
                                fourthVariant = "Длина от центра до касательной",
                                answer = 1
                            )
                        )
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Как называется фигура, у которой все стороны и углы разные?",
                                firstVariant = "Параллелограмм",
                                secondVariant = "Равносторонний треугольник",
                                thirdVariant = "Неравносторонний многоугольник",
                                fourthVariant = "Ромб",
                                answer = 3
                            )
                        )
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Сколько граней у куба?",
                                firstVariant = "4",
                                secondVariant = "6",
                                thirdVariant = "8",
                                fourthVariant = "12",
                                answer = 2
                            )
                        )
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Какой вид угла обозначает кратность в 90 градусов?",
                                firstVariant = "Острый",
                                secondVariant = "Прямой",
                                thirdVariant = "Тупой",
                                fourthVariant = "Полный",
                                answer = 4
                            )
                        )
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Что такое хорда в круге?",
                                firstVariant = "Отрезок, соединяющий две точки на окружности",
                                secondVariant = "Половина диаметра",
                                thirdVariant = "Отрезок, соединяющий центр с точкой на окружности",
                                fourthVariant = "Треугольник, вписанный в круг",
                                answer = 1
                            )
                        )
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Как называется фигура, все углы которой прямые?",
                                firstVariant = "Параллелограмм",
                                secondVariant = "Ромб",
                                thirdVariant = "Трапеция",
                                fourthVariant = "Прямоугольник",
                                answer = 4
                            )
                        )
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Что такое диагональ прямоугольника?",
                                firstVariant = "Отрезок, соединяющий противоположные вершины",
                                secondVariant = "Высота, проведенная из вершины к середине противоположной стороны",
                                thirdVariant = "Половина стороны",
                                fourthVariant = "Отрезок, соединяющий центр окружности и любую точку на ней",
                                answer = 1
                            )
                        )
                        secondLevelGeometryQuestions.add(
                            Questions(
                                question = "Чему равна сумма углов в треугольнике?",
                                firstVariant = "90°",
                                secondVariant = "120°",
                                thirdVariant = "180°",
                                fourthVariant = "360°",
                                answer = 3
                            )
                        )
                    }

                    2 -> {
                        secondLevelPhysicsQuestions = ArrayList()
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Как называется сила сопротивления движению, возникающая при движении объекта через жидкость или газ?",
                                firstVariant = "Сила тяжести",
                                secondVariant = "Сила трения",
                                thirdVariant = "Сила архимеда",
                                fourthVariant = "Сила упругости",
                                answer = 2
                            )
                        )
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Что измеряется в вольтах?",
                                firstVariant = "Сила тока",
                                secondVariant = "Электрическое сопротивление",
                                thirdVariant = "Электрическая емкость",
                                fourthVariant = "Разность потенциалов",
                                answer = 4
                            )
                        )
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Как называется явление изменения частоты звуковых колебаний при приближении или отдалении источника звука?",
                                firstVariant = "Дисперсия",
                                secondVariant = "Дифракция",
                                thirdVariant = "Интерференция",
                                fourthVariant = "Эффект Доплера",
                                answer = 4
                            )
                        )
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Какое уравнение используется для нахождения скорости?",
                                firstVariant = "v = d/t",
                                secondVariant = "a = (vf-vi)/t",
                                thirdVariant = "F = m*a",
                                fourthVariant = "p = m*v",
                                answer = 1
                            )
                        )
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Как называется закон сохранения, согласно которому не может быть создано или уничтожено количество энергии?",
                                firstVariant = "Закон сохранения импульса",
                                secondVariant = "Закон сохранения энергии",
                                thirdVariant = "Закон всемирного тяготения Ньютона",
                                fourthVariant = "Закон Архимеда",
                                answer = 2
                            )
                        )
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Что определяет момент силы?",
                                firstVariant = "Скорость",
                                secondVariant = "Ускорение",
                                thirdVariant = "Вращательное движение",
                                fourthVariant = "Сила трения",
                                answer = 3
                            )
                        )
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Какой тип энергии связан с движением частиц вещества?",
                                firstVariant = "Потенциальная энергия",
                                secondVariant = "Кинетическая энергия",
                                thirdVariant = "Ядерная энергия",
                                fourthVariant = "Механическая энергия",
                                answer = 2
                            )
                        )
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Как называется закон, согласно которому сила, действующая на тело, равна произведению массы тела на его ускорение?",
                                firstVariant = "Первый закон Ньютона",
                                secondVariant = "Второй закон Ньютона",
                                thirdVariant = "Третий закон Ньютона",
                                fourthVariant = "Закон всемирного тяготения Ньютона",
                                answer = 2
                            )
                        )
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Что определяет мощность?",
                                firstVariant = "Сила упругости",
                                secondVariant = "Сила трения",
                                thirdVariant = "Работа, выполненная за единицу времени",
                                fourthVariant = "Кинетическая энергия",
                                answer = 3
                            )
                        )
                        secondLevelPhysicsQuestions.add(
                            Questions(
                                question = "Чему равно ускорение свободного падения на Земле?",
                                firstVariant = "9.8 м/с^2",
                                secondVariant = "6.67x10^-11 м^3/(кг*с^2)",
                                thirdVariant = "3.0x10^8 м/с",
                                fourthVariant = "299,792 км/с",
                                answer = 1
                            )
                        )
                    }

                    3 -> {
                        secondLevelGeographyQuestions = ArrayList()
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "На каком материке расположена самая высокая гора мира, Эверест?",
                                firstVariant = "Евразия",
                                secondVariant = "Австралия",
                                thirdVariant = "Южная Америка",
                                fourthVariant = "Северная Америка",
                                answer = 1
                            )
                        )
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "Что представляет собой экватор?",
                                firstVariant = "Линия широты 0 градусов",
                                secondVariant = "Линия долготы 0 градусов",
                                thirdVariant = "Линия полярного круга",
                                fourthVariant = "Река в Африке",
                                answer = 1
                            )
                        )
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "В каком океане находится самая глубокая впадина, Марианская впадина?",
                                firstVariant = "Тихий",
                                secondVariant = "Атлантический",
                                thirdVariant = "Индийский",
                                fourthVariant = "Северный Ледовитый",
                                answer = 1
                            )
                        )
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "Какое озеро считается самым крупным по площади поверхности?",
                                firstVariant = "Виктория",
                                secondVariant = "Супериор",
                                thirdVariant = "Каспийское море",
                                fourthVariant = "Танганьика",
                                answer = 1
                            )
                        )
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "Как называются линии на карте, соединяющие места с одинаковой высотой над уровнем моря?",
                                firstVariant = "Изохрона",
                                secondVariant = "Изоэти",
                                thirdVariant = "Изобара",
                                fourthVariant = "Изолиния",
                                answer = 4
                            )
                        )
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "Какое море считается самым большим на планете?",
                                firstVariant = "Карибское",
                                secondVariant = "Эгейское",
                                thirdVariant = "Средиземное",
                                fourthVariant = "Южно-Китайское",
                                answer = 3
                            )
                        )
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "Где расположены Андахские горы?",
                                firstVariant = "Австралия",
                                secondVariant = "Южная Америка",
                                thirdVariant = "Европа",
                                fourthVariant = "Африка",
                                answer = 2
                            )
                        )
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "Что является самым длинным рекой в мире?",
                                firstVariant = "Амазонка",
                                secondVariant = "Нил",
                                thirdVariant = "Миссисипи",
                                fourthVariant = "Янцзы",
                                answer = 1
                            )
                        )
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "Какая страна является крупнейшим островом в мире?",
                                firstVariant = "Австралия",
                                secondVariant = "Гренландия",
                                thirdVariant = "Мадагаскар",
                                fourthVariant = "Борнео",
                                answer = 1
                            )
                        )
                        secondLevelGeographyQuestions.add(
                            Questions(
                                question = "Где расположена самая сухая точка на Земле, пустыня Атакама?",
                                firstVariant = "Африка",
                                secondVariant = "Южная Америка",
                                thirdVariant = "Австралия",
                                fourthVariant = "Азия",
                                answer = 2
                            )
                        )
                    }
                }
            }
        }
    }

    private fun initViews() {
        val status = SharedPreferences(requireContext()).getStatus()

        if (status) {
            SharedPreferences(requireContext()).saveLevel(2)
        } else {
            SharedPreferences(requireContext()).saveLevel(1)
        }
        val playerLevel = SharedPreferences(requireContext()).getLevel()
        firstLevelAnswers = ArrayList()
        secondLevelAnswers = ArrayList()
        var questionCount = 0
        var selected = 0
        setQuestions(questionCount)
        binding.btnAnswer1.setOnClickListener {
            selected = 1
            firstLevelAnswers.add(selected)
            secondLevelAnswers.add(selected)
            questionCount += 1
            when (playerLevel) {
                1 -> {
                    when (menuArgs.menu) {
                        1 -> {
                            if (questionCount == firstLevelGeometryQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        2 -> {
                            if (questionCount == firstLevelPhysicsQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        3 -> {
                            if (questionCount == firstLevelGeographyQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }
                    }
                }

                2 -> {
                    when (menuArgs.menu) {
                        1 -> {
                            if (questionCount == secondLevelGeometryQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        2 -> {
                            if (questionCount == secondLevelPhysicsQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        3 -> {
                            if (questionCount == secondLevelGeographyQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }
                    }
                }
            }
        }
        binding.btnAnswer2.setOnClickListener {
            selected = 2
            firstLevelAnswers.add(selected)
            secondLevelAnswers.add(selected)
            questionCount += 1
            when (playerLevel) {
                1 -> {
                    when (menuArgs.menu) {
                        1 -> {
                            if (questionCount == firstLevelGeometryQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        2 -> {
                            if (questionCount == firstLevelPhysicsQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        3 -> {
                            if (questionCount == firstLevelGeographyQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }
                    }
                }

                2 -> {
                    when (menuArgs.menu) {
                        1 -> {
                            if (questionCount == secondLevelGeometryQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        2 -> {
                            if (questionCount == secondLevelPhysicsQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        3 -> {
                            if (questionCount == secondLevelGeographyQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }
                    }
                }
            }
        }
        binding.btnAnswer3.setOnClickListener {
            selected = 3
            firstLevelAnswers.add(selected)
            secondLevelAnswers.add(selected)
            questionCount += 1
            when (playerLevel) {
                1 -> {
                    when (menuArgs.menu) {
                        1 -> {
                            if (questionCount == firstLevelGeometryQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        2 -> {
                            if (questionCount == firstLevelPhysicsQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        3 -> {
                            if (questionCount == firstLevelGeographyQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }
                    }
                }

                2 -> {
                    when (menuArgs.menu) {
                        1 -> {
                            if (questionCount == secondLevelGeometryQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        2 -> {
                            if (questionCount == secondLevelPhysicsQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        3 -> {
                            if (questionCount == secondLevelGeographyQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }
                    }
                }
            }
        }
        binding.btnAnswer4.setOnClickListener {
            selected = 4
            firstLevelAnswers.add(selected)
            secondLevelAnswers.add(selected)
            questionCount += 1
            when (playerLevel) {
                1 -> {
                    when (menuArgs.menu) {
                        1 -> {
                            if (questionCount == firstLevelGeometryQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        2 -> {
                            if (questionCount == firstLevelPhysicsQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        3 -> {
                            if (questionCount == firstLevelGeographyQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    firstLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }
                    }
                }

                2 -> {
                    when (menuArgs.menu) {
                        1 -> {
                            if (questionCount == secondLevelGeometryQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        2 -> {
                            if (questionCount == secondLevelPhysicsQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }

                        3 -> {
                            if (questionCount == secondLevelGeographyQuestions.size) {
                                val intent = Intent(requireContext(), ResultActivity::class.java)
                                intent.putExtra("level", playerLevel)
                                intent.putExtra("menu", menuArgs.menu)
                                intent.putIntegerArrayListExtra(
                                    "firstLevelAnswers",
                                    secondLevelAnswers
                                )
                                startActivity(intent)
                            } else {
                                setQuestions(questionCount)
                            }
                        }
                    }
                }
            }
        }
    }
}