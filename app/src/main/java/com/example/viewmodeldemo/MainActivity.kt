package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mSavedStateViewModel: ChronometerViewModel = ViewModelProvider(this).get(ChronometerViewModel::class.java)
            mSavedStateViewModel.name.observe(this, Observer {
                saved_vm_tv.text = it
            })

            save_bt.setOnClickListener {
                mSavedStateViewModel.setName(name_et.text.toString())
            }

    }

}

