package com.makaota.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class VerifyDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val name = arguments?.getString("name")
        val mobileNumber = arguments?.getLong("mobile")

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)

        val tvName = rootView.findViewById<TextView>(R.id.tv_name)
        val tvMobile = rootView.findViewById<TextView>(R.id.tv_mobile_number)

        tvName.text = name
        tvMobile.text = mobileNumber.toString()

        return rootView
    }


}