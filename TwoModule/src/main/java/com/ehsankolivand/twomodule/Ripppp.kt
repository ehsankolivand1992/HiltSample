package com.ehsankolivand.twomodule

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class Ripppp @Inject constructor() {
    fun showMsg(context: Context,msg :String)
    {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
    }
}