package com.irempakyurek.getirexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.irempakyurek.getirexample.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var view:FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)

        view.name = "İrem PAKYÜREK"
        view.email = "irempakyurek1@gmail.com"
        view.phone = "+90 555 555 55 55"
        
        return view.root
    }

}