package com.example.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewbindingexample.databinding.ActivityUsingViewModelBinding

class UsingViewModel : AppCompatActivity() {

    lateinit var viewModel : HitungViewModel

    lateinit var binding: ActivityUsingViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsingViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(HitungViewModel::class.java)
        binding.txtHasil.text = viewModel.hasil.toString()
//        displayResult()

        binding.btnHitung.setOnClickListener{
            var pj = binding.etPanjang.text.toString().toInt()
            var lb = binding.etLebar.text.toString().toInt()
            var tg = binding.etTinggi.text.toString().toInt()
            viewModel.Hitung(pj,lb,tg)
            binding.txtHasil.text = viewModel.hasil.toString()
        }


    }

    fun displayResult(){
        binding.txtHasil.text = viewModel.hasil.toString()
    }
}