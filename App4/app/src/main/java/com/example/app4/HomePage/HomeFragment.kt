package com.example.app4.HomePage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.app4.R
import com.example.app4.databinding.FragmentHomeBinding
import com.google.firebase.auth.FirebaseAuth

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        setCurrFragment(DefaultFragment())

        firebaseAuth = FirebaseAuth.getInstance()
        binding.tvViewAll.setOnClickListener{
            setCurrFragment(ViewAllFragment())
        }
    }
    private fun setCurrFragment(fragment: Fragment) =
        childFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment1, fragment)
            commit()
        }

}
