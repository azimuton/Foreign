package com.azimuton.foreign.fragments.english.adapters

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.azimuton.domain.models.english.Word

class WordDiffCallback : DiffUtil.ItemCallback<Word>() {
    override fun areItemsTheSame(oldItem: Word, newItem: Word): Boolean {
        return  oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: Word, newItem: Word): Boolean {
       return oldItem == newItem
    }
}