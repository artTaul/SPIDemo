package com.zwt.spidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.zwt.base.CommonServer
import com.zwt.lib_module_1.ModuleOneImp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn_view)
        btn.setOnClickListener {
            while (SPIFactory.instance.hasNextCommonServer()) {
                SPIFactory.instance.getCommonServer().initData()
            }
        }
    }
}