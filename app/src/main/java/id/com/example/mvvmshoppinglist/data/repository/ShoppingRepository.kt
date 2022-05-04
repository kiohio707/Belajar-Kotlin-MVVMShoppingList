package id.com.example.mvvmshoppinglist.data.repository

import id.com.example.mvvmshoppinglist.data.db.ShoppingDatabase
import id.com.example.mvvmshoppinglist.data.entity.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItems()
}