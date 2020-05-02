package com.gregcoorp.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            tv_box_one,
            tv_box_two,
            tv_box_three,
            tv_box_four,
            tv_box_five,
            layout,
            btn_red,
            btn_yellow,
            btn_green
        )
        
        for (view in clickableViews) {
            view.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) { //view.id to check a Int type instead of a View type (more efficient I think)

            // Boxes using Color class colors for background
            tv_box_one.id -> view.setBackgroundColor(Color.DKGRAY)
            tv_box_two.id -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            tv_box_three.id -> view.setBackgroundResource(android.R.color.holo_green_light)
            tv_box_four.id -> view.setBackgroundResource(android.R.color.holo_green_dark)
            tv_box_five.id -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            btn_red.id -> tv_box_three.setBackgroundResource(R.color.my_red)
            btn_yellow.id -> tv_box_four.setBackgroundResource(R.color.my_yellow)
            btn_green.id -> tv_box_five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
