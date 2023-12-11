package com.aone.fullviewpager.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aone.fullviewpager.DetailNewsActivity
import com.aone.fullviewpager.data.model.ArticlesItem
import com.aone.fullviewpager.databinding.ItemRowNewsBinding
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.Locale

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    private val listNews = ArrayList<ArticlesItem>()

    fun setData(list: List<ArticlesItem>?){
        listNews.clear()
        if (list != null){
            listNews.addAll(list)
        }
        notifyItemRangeChanged(0, listNews.size)
    }



    class ViewHolder(val binding: ItemRowNewsBinding):
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d("NewsAdapter", "onCreateViewHolder")
        val binding = ItemRowNewsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataNews = listNews[position]

        Log.d("NewsAdapter", "Binding data at position $position: $dataNews")


        val dateTimeString = dataNews.pubDate
        val dateTimeFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val date = dateTimeFormat.parse(dateTimeString)
        val myDateFormat = SimpleDateFormat("EEE, dd MMMM | HH:mm", Locale.getDefault())

        val myDate = myDateFormat.format(date)

        holder.binding.apply {
            tvSource.text = dataNews.link
            tvTitle.text = dataNews.title
            tvDate.text = myDate


            Picasso.get()
                .load(dataNews.thumbnail)
                .fit()
                .centerInside()
                .into(imgNews)
        }
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailNewsActivity::class.java)

            intent.putExtra(DetailNewsActivity.DATA_NEWS, dataNews)
            holder.itemView.context.startActivity(intent)
        }
    }
}