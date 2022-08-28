package com.example.cse226

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterRecycler(context: Context, arrayList: ArrayList<listItem>) :
    RecyclerView.Adapter<adapterRecycler.MyHolder>() {
    var context: Context
    var arrayList: ArrayList<listItem>

    init {
        this.context = context
        this.arrayList = arrayList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.custom_recycle_list, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.versionName.text = arrayList[position].versionName
        holder.version.text = arrayList[position].version
        holder.image.setImageResource(arrayList[position].image_resource)

    }

    class MyHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var versionName: TextView
        lateinit var version: TextView
        lateinit var image: ImageView

        init {
            versionName = view.findViewById(R.id.version_name)
            version = view.findViewById(R.id.version)
            image = view.findViewById(R.id.facebook_img)

        }
    }


}