package com.kukuiinc.ckt_utas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.kukuiinc.ckt_utas.Adapters.chaptersAdapter
import com.kukuiinc.ckt_utas.Model.chapters
import com.kukuiinc.ckt_utas.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : chaptersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = chaptersAdapter(this, DataService.chapters)
        chaptersListView.adapter = adapter
    }
}