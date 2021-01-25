package com.senix22.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            showBeautifulCar()
        }
    }

    fun showBeautifulCar() {
        val urlString =
            "https://kolesa-uploads.ru/-/22cf20a0-0503-4ced-a761-277f5524ee22/porsche-panamera-rest-front1.jpg"

        Glide.with(this)
            .load(urlString)
//            .centerCrop()
            .placeholder(R.drawable.anim)
            .circleCrop()
            .transition(DrawableTransitionOptions.withCrossFade(2000))
            .into(panamera)


    }
}