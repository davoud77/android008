package com.example.git008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.git008.utils.Constans

class MainActivity : AppCompatActivity() {

    private val constant: Constans by lazy { Constans(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
    }

    private fun main() {
        val classMe = constant
    }
}