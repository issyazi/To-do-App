package com.example.to_doapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.to_doapp.R
import com.example.to_doapp.databinding.FragmentAddTodoPopupBinding


class AddTodoPopupFragment : Fragment() {

    private lateinit var binding:FragmentAddTodoPopupBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_todo_popup, container, false)
    }


}