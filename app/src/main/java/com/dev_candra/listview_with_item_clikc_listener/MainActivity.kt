package com.dev_candra.listview_with_item_clikc_listener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Aksi()
    }

    private fun Aksi(){
        // arrays of items to be displayed in listview
        val nilai = arrayListOf("item One","Item two","Item Three","Item four")
        // adapter
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nilai)
        // inisiasi list view
        val list = findViewById<ListView>(R.id.list)
        // membuat set adapter
        list.adapter = adapter
        // list item on click listener
        list.setOnItemClickListener { parent, view, position, id ->
            if (position == 0){
                Toast.makeText(this,"Item One",Toast.LENGTH_SHORT).show()
            }else if (position == 1){
            Toast.makeText(this,"Item Two",Toast.LENGTH_SHORT).show()
            }else if (position == 2){
                Toast.makeText(this,"Item Three",Toast.LENGTH_SHORT).show()
            }else if (position == 3){
                Toast.makeText(this,"Item Four",Toast.LENGTH_SHORT).show()
            }
        }
        actionBar()
    }

    private fun actionBar(){
        val actionbar = supportActionBar
        if (actionbar != null){
            actionbar.title = "Candra Julius Sinaga"
            actionbar.subtitle = "Home List View"
        }
    }

}
