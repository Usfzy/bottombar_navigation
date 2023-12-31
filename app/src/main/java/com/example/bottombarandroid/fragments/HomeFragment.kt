package com.example.bottombarandroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bottombarandroid.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.findViewById<TextView>(R.id.textView).setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.nav_home_to_content, null)
        }

        return view;
    }
}