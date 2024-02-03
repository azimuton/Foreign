package com.azimuton.foreign.fragments.spain.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azimuton.domain.models.spain.LearnedSpainWord
import com.azimuton.foreign.R
import com.azimuton.foreign.fragments.spain.LearnedSpainFragment

class LearnedSpainWordsAdapter (
    private val contextA: Context,
    private val callback : LearnedSpainFragment
)
    : androidx.recyclerview.widget.ListAdapter<LearnedSpainWord, LearnedSpainWordsAdapter.ViewHolder>(
    LearnedSpainWordsDiffCallback()
){
    class ViewHolder(itemView: View, contextV: Context) : RecyclerView.ViewHolder(itemView) {

        interface ItemCallback{
            fun deleteLearnedSpainWords(index : Int)
        }

        val context = contextV
        val learnedSpainWord : TextView = itemView.findViewById(R.id.tvItemLearnedWord)
        val learnedTranslateWord : TextView = itemView.findViewById(R.id.tvItemLearnedTranslate)
        val showTranslateClosed : ImageView = itemView.findViewById(R.id.ivItemEyeLearnedClose)
        val showTranslateOpen : ImageView = itemView.findViewById(R.id.ivItemEyeLearnedOpen)
        val deleteLearnedWords : ImageView = itemView.findViewById(R.id.ivItemDeleteLearnedWord)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(contextA)
            .inflate(R.layout.item_learned_words, parent, false), contextA)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.learnedSpainWord.text = currentList[position].spainLearnedWord
        holder.learnedTranslateWord.text = currentList[position].translateLearnedSpainWord
        holder.deleteLearnedWords.setOnClickListener {
            callback.deleteLearnedSpainWords(position)
        }
        holder.showTranslateOpen.setOnClickListener {
            holder.learnedTranslateWord.visibility = View.VISIBLE
            holder.showTranslateClosed.visibility = View.VISIBLE
            holder.showTranslateOpen.visibility = View.GONE
        }
        holder.showTranslateClosed.setOnClickListener {
            holder.learnedTranslateWord.visibility = View.GONE
            holder.showTranslateOpen.visibility = View.VISIBLE
            holder.showTranslateClosed.visibility = View.GONE
        }
    }
}