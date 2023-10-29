package com.example.app4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.app4.HomePage.HomeFragment
import com.example.app4.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setCurrFragment(HomeFragment())
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener {menuItem ->
            when(menuItem.itemId){
                R.id.btnHome1 -> {
                    setCurrFragment(HomeFragment())
                    true
                }
                R.id.btnClock1 -> {
                    setCurrFragment(RecentFragment())
                    true
                }
                R.id.btnLike1 -> {
                    setCurrFragment(FavoriteFragment())
                    true
                }
                R.id.btnProfile1 -> {
                    setCurrFragment(PofileFragment())
                    true
                }
                else -> false
            }
        }
    }
    private fun setCurrFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}
