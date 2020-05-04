package com.steffeson.randomico_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportActionBar != null){
            supportActionBar!!.hide()
        }

        btnRandom.setOnClickListener(this)
        txtNumber.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        if (v?.id == R.id.btnRandom || v?.id == R.id.txtNumber) {
            txtNumber.text = random().toString()
        }
    }

    fun random(): Int {
        return Random.nextInt(50) + 1
    }

}
