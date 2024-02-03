package com.azimuton.foreign.fragments.spain.adapters

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.azimuton.domain.models.spain.LearnedSpainWord

class LearnedSpainWordsDiffCallback : DiffUtil.ItemCallback<LearnedSpainWord>() {
    override fun areItemsTheSame(oldItem: LearnedSpainWord, newItem: LearnedSpainWord): Boolean {
        return  oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: LearnedSpainWord, newItem: LearnedSpainWord): Boolean {
        return oldItem == newItem
    }
}