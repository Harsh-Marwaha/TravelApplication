package com.example.travelapplication.Activites

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.travelapplication.R

class UttrakhandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_uttrakhand)

        var intent : Intent = getIntent()

        var  destination : String = intent.getStringExtra("name").toString()
        var  destinationImg : Int = intent.getIntExtra("image",0)
        var  destinationContent : String = intent.getStringExtra("content").toString()
        var  destinationItenaty : String = intent.getStringExtra("headingItenary").toString()
        var  destinationItenatyContent : String = intent.getStringExtra("contentItenary").toString()

        var ivDestination : ImageView
        var tvHeading : TextView
        var tvContent : TextView
        var tvItenaryHeading : TextView
        var tvItenaryContent : TextView
        var tvDetailsOfDestination : TextView
        var btnImgBack : ImageButton

        ivDestination=findViewById(R.id.ivDestination)
        tvHeading=findViewById(R.id.tvHeading)
        tvContent=findViewById(R.id.tvContent)
        tvItenaryHeading=findViewById(R.id.tvItenaryHeading)
        tvItenaryContent=findViewById(R.id.tvItenaryContent)
        tvDetailsOfDestination=findViewById(R.id.tvDetailsOfDestination)
        btnImgBack=findViewById(R.id.btnImgBack)

        btnImgBack.setOnClickListener()
        {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        ivDestination.setImageResource(destinationImg)
        tvHeading.text=destination
        tvContent.text=destinationContent
        tvItenaryHeading.text=destinationItenaty
        tvItenaryContent.text=destinationItenatyContent
        tvDetailsOfDestination.text="Details of "+destination

    }
}