package com.kukuiinc.ckt_utas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.kukuiinc.ckt_utas.Model.chapters
import com.kukuiinc.ckt_utas.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<chapters>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_1,
        DataService.chapters)
        chaptersListView.adapter = adapter
    }
}