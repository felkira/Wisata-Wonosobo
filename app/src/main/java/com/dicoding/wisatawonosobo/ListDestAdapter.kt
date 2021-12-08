package com.dicoding.wisatawonosobo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListDestAdapter(val listDest: ArrayList<Dest>) : RecyclerView.Adapter<ListDestAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.dest_item_card, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDest.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, price, photo, detail) = listDest[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvPrice.text = price

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, dest_detail::class.java)
            moveDetail.putExtra(dest_detail.EXTRA_NAME, name)
            moveDetail.putExtra(dest_detail.EXTRA_PRICE, price)
            moveDetail.putExtra(dest_detail.EXTRA_PHOTO, photo)
            moveDetail.putExtra(dest_detail.EXTRA_DETAIL, detail)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}