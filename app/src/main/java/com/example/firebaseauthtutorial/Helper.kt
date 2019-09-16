package com.example.firebaseauthtutorial

import android.content.Context
import android.widget.Toast

fun Context.toast(message: String) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()