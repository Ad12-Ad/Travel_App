package com.example.app4.HomePage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.app4.R
import com.example.app4.databinding.FragmentDefaultBinding
import com.example.app4.databinding.FragmentHomeBinding

class DefaultFragment : Fragment(R.layout.fragment_default) {

    private lateinit var binding: FragmentDefaultBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setCurrFragment(Scroll_viewFragment())

        binding = FragmentDefaultBinding.bind(view)
        binding.btn1Home.setOnClickListener {
            setCurrFragment(Scroll_viewFragment())
        }
        binding.btn2Home.setOnClickListener {
            setCurrFragment(ViewAllFragment())
        }
        binding.btn3Home.setOnClickListener {
            setCurrFragment(ViewAllFragment())
        }
        binding.btn4Home.setOnClickListener {
            setCurrFragment(ViewAllFragment())
        }
    }

    private fun setCurrFragment(fragment: Fragment) =
        childFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment2, fragment)
            commit()
        }

}