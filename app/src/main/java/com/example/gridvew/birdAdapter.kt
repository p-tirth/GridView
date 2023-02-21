package com.example.gridvew

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.text.FieldPosition

class birdAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>
) : BaseAdapter() {

    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view :View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.custom_layout,parent,false)

        var birdName : TextView = view.findViewById(R.id.textView)
        var birdImage : ImageView = view.findViewById(R.id.imageView)
        birdName.text = nameList[position]
        birdImage.setImageResource(imageList.get(position))

//        Toast.makeText(context, "you selected ${}", Toast.LENGTH_SHORT).show()
        return view
    }

}