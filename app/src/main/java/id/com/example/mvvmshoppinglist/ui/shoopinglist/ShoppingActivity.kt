package id.com.example.mvvmshoppinglist.ui.shoopinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import id.com.example.mvvmshoppinglist.R
import id.com.example.mvvmshoppinglist.data.db.ShoppingDatabase
import id.com.example.mvvmshoppinglist.data.repository.ShoppingRepository

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val database = ShoppingDatabase(this)
        val repository = ShoppingRepository(database)
        val factory = ShoppingViewModelFactory(repository)

        val viewModel = ViewModelProvider(this, factory)[ShoppingViewModel::class.java]
    }
}