package com.duygu.derecedonusumuygulama

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.duygu.derecedonusumuygulama.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
    }

    fun setupBinding(){
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }

    //kullanıcı login ve kayıt işlemi burada gerçekleşecek
    fun loginAction(view: View)
    {
        val intent= Intent(applicationContext,NextActivity::class.java)
        intent.putExtra("userName",binding.userNameTextView.text.toString())
        intent.putExtra("nameSurname",binding.nameSurnameTextView.text.toString())
        startActivity(intent)

        //toast mesajı
        Toast.makeText(this,"Giriş Yapıldı", Toast.LENGTH_LONG).show()
    }
    }


