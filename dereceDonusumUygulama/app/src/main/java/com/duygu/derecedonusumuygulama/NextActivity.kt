package com.duygu.derecedonusumuygulama

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.duygu.derecedonusumuygulama.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        loadIntentData()

    }
    fun setupBinding()
    {
        binding= ActivityNextBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }

    fun loadIntentData()
    {
        val intent=getIntent()
        val userName=intent.getStringExtra("userName")
        val nameSurname=intent.getStringExtra("nameSurname")

        if(userName=="")
        {
            binding.userNameText.text="kullanıcı adı boş"
        }
        else
        {
            binding.userNameText.text= "Kullanıcı Adı:"+userName
        }
        if(nameSurname=="")
        {
            binding.nameSurnameText.text="Ad Soyad boş"
        }
        else
        {
            binding.nameSurnameText.text="Ad Soyad:"+nameSurname
        }
    }


    fun turningActionFC(view:View) {
        val number = binding.number.text.toString().toDouble()
        val result: Double = (number - 32) / 1.8
        binding.sonucText.text = "İşleminizin sonucu:\n ${result} Celsius"
    }

    fun turningActionCK(view: View)
    {
        val number=binding.number.text.toString().toDouble()
        val result:Double =(number+273.15)
        binding.sonucText.text="İşleminizin sonucu:\n ${result} Kelvin"
    }

    fun turningActionFK(view:View) {
        val number = binding.number.text.toString().toDouble()
        val result: Double =( ((number-32)*5)/9)+273.15
        binding.sonucText.text = "İşleminizin sonucu:\n ${result} Kelvin"
    }

    fun turningActionKC(view: View)
    {
        val number=binding.number.text.toString().toDouble()
        val result:Double =(number-273.15)
        binding.sonucText.text="İşleminizin sonucu:\n ${result} Celsius"
    }


}