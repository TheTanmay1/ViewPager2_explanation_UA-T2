package com.unwiringapps.viewpagerseekhtehai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.unwiringapps.viewpagerseekhtehai.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

                  postToList()

        binding.viewPager2.adapter = ViewPagerAdapter(titlesList,descList,imagesList)
        binding.viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL


//        val indicator = findViewById<CircleIndicator>(R.id.indicator)
//        indicator.setViewPager(Viewpager)

    }

        private fun addToList(title : String, description: String, image: Int) {

            titlesList.add(title)
            descList.add(description)
            imagesList.add(image)

        }


    private fun postToList() {

        for (i in 1..5){
            addToList("Title $i", "Description $i", R.mipmap.ic_launcher_round)
        }

    }


}