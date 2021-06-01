package com.example.recyclerview_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.FragmentManager
import com.example.recyclerview_fragment.view.BlankFragment1
import com.example.recyclerview_fragment.view.BlankFragment2
import com.example.recyclerview_fragment.view.OnSendData
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.container, BlankFragment1(), "blankFragment1")
            .add(R.id.container,BlankFragment2())
            .commit()
    }

    override fun onResume() {
        super.onResume()

    }




}