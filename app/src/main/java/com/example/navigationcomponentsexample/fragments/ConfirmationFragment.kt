package com.example.navigationcomponentsexample.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.navigationcomponentsexample.R
import com.example.navigationcomponentsexample.util.Money
import kotlinx.android.synthetic.main.fragment_confirmation.*

class ConfirmationFragment : Fragment() {

    lateinit var recipient : String
    lateinit var money: Money

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipient = arguments!!.getString("recipient")
        money = arguments!!.getParcelable("amount")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val amount = money.amount
        val confirmationMessage = "You have send $$amount to $recipient"
        confirmation_message.text = confirmationMessage
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }


}
