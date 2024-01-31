package com.azimuton.foreign.fragments.spain.adapters

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.azimuton.domain.models.spain.WordSpain

class SpainWordDiffCallback : DiffUtil.ItemCallback<WordSpain>() {
    override fun areItemsTheSame(oldItem: WordSpain, newItem: WordSpain): Boolean {
        return  oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: WordSpain, newItem: WordSpain): Boolean {
       return oldItem == newItem
    }
}