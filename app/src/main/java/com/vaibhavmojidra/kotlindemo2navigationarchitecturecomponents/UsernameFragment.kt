package com.vaibhavmojidra.kotlindemo2navigationarchitecturecomponents

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.vaibhavmojidra.kotlindemo2navigationarchitecturecomponents.databinding.FragmentUsernameBinding


class UsernameFragment : Fragment() {

    private lateinit var binding:FragmentUsernameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_username, container, false)
        binding.nextButton.setOnClickListener {
            val username:String=binding.usernameEditTextText.text.toString()
            if(TextUtils.isEmpty(username)){
                Toast.makeText(inflater.context,"Please enter the username",Toast.LENGTH_LONG).show()
            }else{
                val bundle= bundleOf("Username" to username)
                Navigation.findNavController(it).navigate(R.id.action_usernameFragment_to_emailFragment,bundle)
            }
        }
        return binding.root
    }
}