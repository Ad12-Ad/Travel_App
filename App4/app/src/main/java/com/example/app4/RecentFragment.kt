package com.example.app4

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.app4.HomePage.Scroll_viewFragment
import com.example.app4.HomePage.ViewAllFragment
import com.example.app4.databinding.FragmentRecentBinding

class RecentFragment : Fragment(R.layout.fragment_recent) {
    private lateinit var binding: FragmentRecentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setCurrFragment(ViewAllFragment())
        binding = FragmentRecentBinding.bind(view)


    }

    private fun setCurrFragment(fragment: Fragment) =
        childFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment2, fragment)
            commit()
        }
}