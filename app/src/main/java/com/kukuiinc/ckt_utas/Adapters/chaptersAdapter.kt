package com.kukuiinc.ckt_utas.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.kukuiinc.ckt_utas.Model.chapters
import com.kukuiinc.ckt_utas.R
import kotlinx.android.synthetic.main.chapters_list_view.view.*

class chaptersAdapter(context: Context, chapters: List<chapters>) : BaseAdapter() {

    val context = context
    val chapters = chapters

    override fun getCount(): Int {
        return chapters.count()
    }

    override fun getItem(position: Int): Any {
        return chapters[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val chaptersView: View

        chaptersView = LayoutInflater.from(context).inflate(R.layout.chapters_list_view, null)
        val chaptersImage: ImageView = chaptersView.findViewById(R.id.chaptersImageView)
        val chaptersName: TextView = chaptersView.findViewById(R.id.chapterName)

        val chapter = chapters[position]

        val resourceId = context.resources.getIdentifier(chapter.image, "drawable", context.packageName)
        chaptersImage.setImageResource(resourceId)
        println(resourceId)

        chaptersName.text = chapter.title
        return chaptersView

    }
}