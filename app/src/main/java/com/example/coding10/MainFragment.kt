package com.example.coding10

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coding10.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    private val listAdapter by lazy {
        MainListAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

        listAdapter.addItems(dataList)
        listAdapter.itemClick = object : MainListAdapter.ItemClick{
            override fun onClick(position: Int) {

            }
        }
    }

    private fun initView() = with(binding) {
        mainRecyclerview.adapter = listAdapter
    }

}