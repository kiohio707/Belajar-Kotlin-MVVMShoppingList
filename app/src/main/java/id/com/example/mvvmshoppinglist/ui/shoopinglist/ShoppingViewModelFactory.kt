package id.com.example.mvvmshoppinglist.ui.shoopinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.com.example.mvvmshoppinglist.data.repository.ShoppingRepository

class ShoppingViewModelFactory(
    private val repository: ShoppingRepository
): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}