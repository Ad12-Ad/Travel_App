package com.example.app4.HomePage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.app4.Pages.JalMahalActivity
import com.example.app4.Pages.Page1Activity
import com.example.app4.Pages.Page2Activity
import com.example.app4.Pages.SriNagarActivity
import com.example.app4.Pages.UdaipurActivity
import com.example.app4.R
import com.example.app4.databinding.FragmentScrollViewBinding

class Scroll_viewFragment : Fragment(R.layout.fragment_scroll_view) {

    private lateinit var binding: FragmentScrollViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentScrollViewBinding.bind(view)
        binding.cardPhoto6.setOnClickListener{
            Intent(activity, Page1Activity::class.java).also{
                startActivity(it)
            }
        }
        binding.cardJaipur.setOnClickListener {
            Intent(activity, Page2Activity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardJalMahal1.setOnClickListener {
            Intent(activity, JalMahalActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardUdaipur.setOnClickListener {
            Intent(activity, UdaipurActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardSriNagar.setOnClickListener {
            Intent(activity, SriNagarActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    private fun setCurrFragment(fragment: Fragment) =
        childFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment2, fragment)
            commit()
        }
}