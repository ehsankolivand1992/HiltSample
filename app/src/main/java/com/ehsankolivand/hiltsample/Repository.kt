package com.ehsankolivand.hiltsample

import android.content.Context
import com.ehsankolivand.twomodule.Ripppp
import javax.inject.Inject

class Repository @Inject constructor(private val ripppp: Ripppp) {
    fun show(context: Context,msg: String)
    {
        ripppp.showMsg(context,msg)
    }
}