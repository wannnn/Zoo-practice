package com.example.zoopractice

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("imageUrl")
fun loadImage(imageView: ImageView, url: String?) {
    GlideApp.with(imageView.context)
        .load(url)
        .apply(
            RequestOptions()
                .placeholder(R.drawable.background)
                .error(R.drawable.background)
        )
        .into(imageView)
}

