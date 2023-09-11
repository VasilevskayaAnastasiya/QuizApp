package com.example.quizzapp.domain

import android.util.Log
import com.example.quizzapp.data.Question

class QuestionRepositoryImpl(
    private val dataSource: ArrayList<Question>,
) : QuestionRepository {
    override fun getQuestion(position: Int): Question {
        return dataSource[position]
    }
}