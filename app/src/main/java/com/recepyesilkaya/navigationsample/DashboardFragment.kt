package com.recepyesilkaya.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_dash_board.*


class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dash_board, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var action: NavDirections

        imgBtnProfile.setOnClickListener {
            action = DashboardFragmentDirections.actionDashboardFragmentToProfileFragment()
            Navigation.findNavController(it).navigate(action)
        }

        imgBtnChatbox.setOnClickListener {
            action =
                DashboardFragmentDirections.actionDashboardFragmentToChatboxFragment("Hello Guys")
            Navigation.findNavController(it).navigate(action)
        }
    }
}