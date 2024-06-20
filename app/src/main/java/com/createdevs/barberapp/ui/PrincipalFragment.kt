package com.createdevs.barberapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.createdevs.barberapp.databinding.FragmentPrincipalBinding

class PrincipalFragment : Fragment() {

    private var _binding: FragmentPrincipalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using view binding
        _binding = FragmentPrincipalBinding.inflate(inflater, container, false)
        val view = binding.root

        // Aquí puedes configurar tus elementos de la interfaz de usuario si es necesario

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
