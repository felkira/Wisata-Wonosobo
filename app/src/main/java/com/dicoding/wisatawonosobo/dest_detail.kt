package com.dicoding.wisatawonosobo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class dest_detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dest_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Destinasi"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvPrice: TextView = findViewById(R.id.tv_item_price)
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tPrice  = intent.getStringExtra(EXTRA_PRICE)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)



        tvName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgPhoto)
        tvPrice.text = tPrice
        tvDetail.text = tDetail
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
