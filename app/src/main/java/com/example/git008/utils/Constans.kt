package com.example.git008.utils

import android.content.Context
import android.widget.Toast

class Constans(context: Context) {

    private val name = "davoud"
    private val age = 15000
    private val family = "fathi"

    init {
        Toast.makeText(context, "$name and $age and $family", Toast.LENGTH_SHORT).show()
    }
}