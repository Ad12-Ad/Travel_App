package com.example.app4

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.app4.Pages.JalMahalActivity
import com.example.app4.Pages.Page1Activity
import com.example.app4.Pages.Page2Activity
import com.example.app4.Pages.TajMahalActivity
import com.example.app4.Pages.UdaipurActivity
import com.example.app4.databinding.FragmentFavoriteBinding
import com.example.app4.databinding.FragmentViewAllBinding

class FavoriteFragment : Fragment(R.layout.fragment_favorite) {

    private lateinit var binding : FragmentFavoriteBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFavoriteBinding.bind(view)
        binding.cardJalMahal1Fav.setOnClickListener {
            Intent(activity, JalMahalActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardUdaipur1Fav.setOnClickListener {
            Intent(activity, UdaipurActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cardTajMahal1Fav.setOnClickListener {
            Intent(activity, TajMahalActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}