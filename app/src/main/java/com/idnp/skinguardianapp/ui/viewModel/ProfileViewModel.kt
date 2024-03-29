package com.idnp.skinguardianapp.ui.viewModel


import androidx.lifecycle.ViewModel
import com.idnp.skinguardianapp.data.ApplicationRepository
import com.idnp.skinguardianapp.data.model.User
import com.idnp.skinguardianapp.data.model.toDomain
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val repository: ApplicationRepository
) : ViewModel() {

    fun getUser(id: Int): User {
        return repository.getUser(id)
    }


}