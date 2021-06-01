package com.example.recyclerview_fragment.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.recyclerview_fragment.R
import com.example.recyclerview_fragment.model.Message
import kotlinx.android.synthetic.main.fragment_blank1.*
import kotlinx.android.synthetic.main.fragment_blank1.view.*
import org.greenrobot.eventbus.EventBus
import java.lang.Exception


class BlankFragment1 : Fragment() {
     var mOnSendData: OnSendData? =null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnSendData){
            mOnSendData = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_blank1, container, false)
        view.button_send.setOnClickListener {
            mOnSendData?.sendData(view.edt1.text.toString())
        }

        return view
    }


}