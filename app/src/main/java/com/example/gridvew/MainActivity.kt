package com.example.gridvew

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var gridView : GridView
    lateinit var editNumberView : EditText
    lateinit var button: Button
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView =findViewById(R.id.gridView)
        editNumberView = findViewById(R.id.editTextNumber)
        button = findViewById(R.id.button)
        fillArrays()

        val adapter = birdAdapter(this,nameList,imageList)
        gridView.adapter=adapter
        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(applicationContext, "you selected ${nameList[position]}", Toast.LENGTH_SHORT).show()
        }
        button.setOnClickListener {
            var noOfColl = editNumberView.text.toString()
            var n = noOfColl.toInt()
//            Toast.makeText(this,, Toast.LENGTH_SHORT).show()
            gridView.numColumns = n
        }

    }
    fun fillArrays(){
        nameList.add("bird")
        nameList.add("bird2")
        nameList.add("bird3")
        nameList.add("bird4")
        nameList.add("bird5")
        nameList.add("bird6")
        nameList.add("bird7")
        nameList.add("bird8")
        nameList.add("bird9")

        imageList.add(R.drawable.bird1)
        imageList.add(R.drawable.bird2)
        imageList.add(R.drawable.bird3)
        imageList.add(R.drawable.bird4)
        imageList.add(R.drawable.bird5)
        imageList.add(R.drawable.bird6)
        imageList.add(R.drawable.bird7)
        imageList.add(R.drawable.bird8)
        imageList.add(R.drawable.bird9)
    }
}