package com.example.app4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.app4.HomePage.DefaultFragment
import com.example.app4.HomePage.ViewAllFragment
import com.example.app4.databinding.FragmentHomeBinding
import com.example.app4.databinding.FragmentPofileBinding
import com.google.firebase.auth.FirebaseAuth

class PofileFragment : Fragment(R.layout.fragment_pofile) {

    private lateinit var binding: FragmentPofileBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPofileBinding.bind(view)

        firebaseAuth = FirebaseAuth.getInstance()
    }
}