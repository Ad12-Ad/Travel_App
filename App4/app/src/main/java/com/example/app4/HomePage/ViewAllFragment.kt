package com.example.app4.HomePage

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.app4.Pages.JalMahalActivity
import com.example.app4.Pages.Page1Activity
import com.example.app4.Pages.Page2Activity
import com.example.app4.Pages.SriNagarActivity
import com.example.app4.Pages.TajMahalActivity
import com.example.app4.Pages.UdaipurActivity
import com.example.app4.R
import com.example.app4.databinding.FragmentViewAllBinding

class ViewAllFragment : Fragment(R.layout.fragment_view_all) {

    private lateinit var binding: FragmentViewAllBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentViewAllBinding.bind(view)
        binding.cardSafdarjungTomb1.setOnClickListener {
            Intent(activity,Page1Activity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardJaipur1.setOnClickListener {
            Intent(activity,Page2Activity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardJalMahal.setOnClickListener {
            Intent(activity,JalMahalActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardUdipur1.setOnClickListener {
            Intent(activity,UdaipurActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardTajMahal1.setOnClickListener {
            Intent(activity,TajMahalActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardSriNagar1.setOnClickListener {
            Intent(activity, SriNagarActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}