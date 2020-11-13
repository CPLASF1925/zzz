package com.bril.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlobalScope.launch (Dispatchers.Main){
            var name=getNetDate()
            showMessage(name)
        }
    }
    private suspend fun getNetDate():String{
        var name=""
        //withContext函数可以构建一个协程作用域,必须在挂起函数或者协程中执行
        withContext(Dispatchers.IO){
            for(i in 0..10000){

            }
        }
        name="张三"
        return name
    }
    private fun showMessage(message: String) {
        tv_name.text=message
    }
}