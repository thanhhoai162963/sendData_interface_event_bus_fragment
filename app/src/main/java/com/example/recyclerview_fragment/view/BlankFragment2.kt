package com.example.recyclerview_fragment.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.MainThread
import androidx.fragment.app.Fragment
import com.example.recyclerview_fragment.R
import com.example.recyclerview_fragment.model.Message
import kotlinx.android.synthetic.main.fragment_blank2.*
import kotlinx.android.synthetic.main.fragment_blank2.view.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import kotlin.concurrent.thread


class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank2,container,false)
        val data = arguments?.getString("data")
        view.text2.text = data
        return view
    }



}