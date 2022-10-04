package com.example.tbctask17

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.tbctask17.databinding.ItemLayoutBinding
import org.w3c.dom.Attr

class MyAdapter : ListAdapter<Attributes, MyAdapter.MyViewHolder>(callback) {


    inner class MyViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val currentItem = getItem(adapterPosition)
            binding.apply {
                ivMenuIcon.setImageResource(currentItem.cover)
                tvMenuTitle.text = currentItem.title

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind()
    }


    companion object {
        val callback = object : DiffUtil.ItemCallback<Attributes>() {
            override fun areItemsTheSame(oldItem: Attributes, newItem: Attributes): Boolean {
                return oldItem.title == newItem.title
            }

            override fun areContentsTheSame(oldItem: Attributes, newItem: Attributes): Boolean {
                return oldItem == newItem
            }

        }
    }

}