package com.azimuton.foreign.fragments.spain.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.foreign.R
import com.azimuton.foreign.fragments.english.adapters.WordDiffCallback
import com.azimuton.foreign.fragments.spain.LearnSpainFragment

class LearnSpainAdapter(
    private val contextA: Context,
    private val callback : LearnSpainFragment
)
    : androidx.recyclerview.widget.ListAdapter<WordSpain, LearnSpainAdapter.ViewHolder>(SpainWordDiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(contextA).inflate(R.layout.item_new_words, parent, false), contextA)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.spainWord.text = currentList[position].spainWord
        holder.translateSpainWord.text = currentList[position].translateSpainWord
        holder.deleteWords.setOnClickListener {
            callback.deleteWords(position)
        }
        holder.copyId.setOnClickListener {
            callback.copyId(position)
        }
        holder.showTranslateOpen.setOnClickListener {
            holder.translateSpainWord.visibility = View.VISIBLE
            holder.showTranslateClosed.visibility = View.VISIBLE
            holder.showTranslateOpen.visibility = View.GONE
        }
        holder.showTranslateClosed.setOnClickListener {
            holder.translateSpainWord.visibility = View.GONE
            holder.showTranslateOpen.visibility = View.VISIBLE
            holder.showTranslateClosed.visibility = View.GONE
        }
    }

    class ViewHolder(itemView: View, contextV: Context) : RecyclerView.ViewHolder(itemView){

        val context = contextV
        val spainWord : TextView = itemView.findViewById(R.id.tvItemWord)
        val translateSpainWord : TextView = itemView.findViewById(R.id.tvItemTranslate)
        val showTranslateClosed : ImageView = itemView.findViewById(R.id.ivItemEyeClosed)
        val showTranslateOpen : ImageView = itemView.findViewById(R.id.ivItemEyeOpen)
        val copyId : ImageView = itemView.findViewById(R.id.ivItemCopyWordToLearned)
        val deleteWords : ImageView = itemView.findViewById(R.id.ivItemDelete)

        interface ItemCallback{
            fun copyId(index: Int)
            fun deleteWords(index : Int)
        }
    }


}