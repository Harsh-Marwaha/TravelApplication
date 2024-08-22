package com.example.travelapplication.Activites

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelapplication.Models.DestinationModel
import com.example.travelapplication.Models.PromotionModel
import com.example.travelapplication.Adapters.PromotionRecViewAdapter
import com.example.travelapplication.R
import com.example.travelapplication.Adapters.RecViewAdapter
import com.example.travelapplication.Fragments.HomeFragment
import com.example.travelapplication.Fragments.HotelFragment
import com.example.travelapplication.Fragments.MyOrdersFragment
import com.example.travelapplication.Fragments.ProfileFragment
import com.example.travelapplication.Fragments.SavedFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val frameLayout : FrameLayout
        val bottomNavigationView : BottomNavigationView

        var fragmentHome = HomeFragment()
        var fragmentHotel = HotelFragment()
        var fragmentMyOrders = MyOrdersFragment()
        var fragmentSaved = SavedFragment()
        var fragmentProfile = ProfileFragment()


        bottomNavigationView=findViewById(R.id.bottomNavigationView)

        replace(fragmentHome)

        bottomNavigationView.setOnItemSelectedListener{
            when(it.itemId)
            {
                R.id.bottomNavHome -> replace(fragmentHome)
                R.id.bottomNavHotels -> replace(fragmentHotel)
                R.id.bottomNavOrders -> replace(fragmentMyOrders)
                R.id.bottomNavSaved -> replace(fragmentSaved)
                R.id.bottomNavProfile -> replace(fragmentProfile)
            }
            true
        }

//        bottomNavigationView.itemIconTintList = null

    }

    fun replace(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit()
    }

//    override fun onBackPressed() {
//        super.onBackPressed()
//        finish()
//    }
//
    override fun onBackPressed() {
        super.onBackPressed()
    finish()
        val a = Intent(Intent.ACTION_MAIN)
        a.addCategory(Intent.CATEGORY_HOME)
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(a)
    }
}