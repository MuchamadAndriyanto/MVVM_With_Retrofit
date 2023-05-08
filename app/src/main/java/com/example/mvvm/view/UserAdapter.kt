package com.example.mvvm.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvm.databinding.ItemUserBinding
import com.example.mvvm.model.GetAllUserItem

class UserAdapter (var listUser : List<GetAllUserItem>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        holder.binding.tvNama.text= listUser[position].name
        holder.binding.tvUmur.text = listUser[position].age.toString()
        holder.binding.tvAlamat.text = listUser[position].address


    }

    override fun getItemCount(): Int {
        return listUser.size
    }

}
