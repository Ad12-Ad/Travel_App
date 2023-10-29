package com.example.app4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app4.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.tvGoToSignIn.setOnClickListener{
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogIn.setOnClickListener{
            val email = binding.etMail.text.toString()
            val pass = binding.etPassword.text.toString()
            val confirmPass= binding.etPasswordRetype.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()){
                if(pass == confirmPass){
                    firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {
                        if(it.isSuccessful){
                            Toast.makeText(this,"Account created successfully",Toast.LENGTH_SHORT).show()
                            val intent1 = Intent(this, SignInActivity::class.java)
                            startActivity(intent1)
                        }else{
                            Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    Toast.makeText(this,"Password is not matching",Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"Empty Fields are not allowed",Toast.LENGTH_SHORT).show()
            }
        }
    }

    
}