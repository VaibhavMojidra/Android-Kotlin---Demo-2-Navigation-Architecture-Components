package com.vaibhavmojidra.kotlindemo2navigationarchitecturecomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.vaibhavmojidra.kotlindemo2navigationarchitecturecomponents.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        binding.signUpBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_usernameFragment)
        }
        binding.termsBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_termsAndConditionsFragment2)
        }
        return binding.root
    }
}