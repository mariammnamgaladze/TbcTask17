package com.example.tbctask17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tbctask17.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val myAdapter by lazy { MyAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.adapter = myAdapter
        myAdapter.submitList(Attributes.attrinutesList)
    }

}