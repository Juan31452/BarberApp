package com.createdevs.barberapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.createdevs.barberapp.databinding.FragmentUserBinding
import com.createdevs.barberapp.domain.BaseFragment

class UserFragment : BaseFragment<FragmentUserBinding>() {

    override fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentUserBinding {
        return FragmentUserBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Aquí puedes configurar tus elementos de la interfaz de usuario si es necesario
    }
}
