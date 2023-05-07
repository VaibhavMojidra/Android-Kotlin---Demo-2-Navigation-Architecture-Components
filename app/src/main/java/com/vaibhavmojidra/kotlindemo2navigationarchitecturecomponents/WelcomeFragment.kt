package com.vaibhavmojidra.kotlindemo2navigationarchitecturecomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.vaibhavmojidra.kotlindemo2navigationarchitecturecomponents.databinding.FragmentWelcomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomeFragment : Fragment() {

    private lateinit var binding:FragmentWelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_welcome, container, false)

        binding.emailTextView.text= requireArguments().getString("Email")
        binding.usernameTextView.text= requireArguments().getString("Username")
        binding.termsAndConditionsButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_welcomeFragment_to_termsAndConditionsFragment)
        }
        return binding.root
    }
}