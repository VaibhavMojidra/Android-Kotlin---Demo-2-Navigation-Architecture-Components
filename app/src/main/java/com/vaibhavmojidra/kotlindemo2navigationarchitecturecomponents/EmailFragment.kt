package com.vaibhavmojidra.kotlindemo2navigationarchitecturecomponents

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.vaibhavmojidra.kotlindemo2navigationarchitecturecomponents.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {

    private lateinit var binding:FragmentEmailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_email, container, false)
        binding.signUpBtn.setOnClickListener {
            val email:String=binding.emailEditText.text.toString()
            if(TextUtils.isEmpty(email)){
                Toast.makeText(inflater.context,"Please enter the email", Toast.LENGTH_LONG).show()
            }else{
                val bundle: Bundle? = arguments
                bundle!!.putString("Email", email)
                Navigation.findNavController(it).navigate(R.id.action_emailFragment_to_welcomeFragment,bundle)
            }
        }
        return binding.root
    }
}