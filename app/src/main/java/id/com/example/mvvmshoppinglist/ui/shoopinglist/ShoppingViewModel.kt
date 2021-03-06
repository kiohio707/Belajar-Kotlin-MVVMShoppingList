package id.com.example.mvvmshoppinglist.ui.shoopinglist

import androidx.lifecycle.ViewModel
import id.com.example.mvvmshoppinglist.data.entity.ShoppingItem
import id.com.example.mvvmshoppinglist.data.repository.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(private val repository: ShoppingRepository): ViewModel() {

    fun upsert(item: ShoppingItem) {
        CoroutineScope(Dispatchers.Main).launch {
            repository.upsert(item)
        }
    }

    fun delete(item: ShoppingItem) {
        CoroutineScope(Dispatchers.Main).launch {
            repository.delete(item)
        }
    }

    fun getAllShoppingItem() {
        repository.getAllShoppingItem()
    }
}