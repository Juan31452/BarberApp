package com.createdevs.barberapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.createdevs.barberapp.databinding.FragmentHorariosBinding
import com.createdevs.barberapp.domain.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HorariosFragment : BaseFragment<FragmentHorariosBinding>() {

    override fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentHorariosBinding {
        return FragmentHorariosBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Aquí puedes configurar tus elementos de la interfaz de usuario si es necesario
    }
}
