package com.example.myphotogalery_djakaridja

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var swip=0
    val listOfimage = listOf<Int>(R.drawable.imag0, R.drawable.imag1, R.drawable.imag2, R.drawable.imag3, R.drawable.imag4, R.drawable.imag5, R.drawable.imag6, R.drawable.imag7, R.drawable.imag8, R.drawable.imag9)
    val listOfdescription= listOf<String>("IOOF Grand Lodge of Maryland ", "There are two fountains located along the Grand Terrace. ", "Sleeping Bear Dunes through the eyes of one of our young visitors.", "This panel is south of the main park entrance along Highway 191. (NPS photo by Neal Herbert)", "Dr. J. T. Kelley.", "Opening Ceremony Stage Set up ", "General View of Mill Buildings; New Village, NJ; August 11, 1942. 10.220/501 ", "The soldiers learn the command to ram down cartridge, and prepare to fire.", "The Globemallow blooms from late summer into early fall.", "Lifeguarded Beach at Assateague Island National Seashore, 443kb")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image: ImageView = findViewById(R.id.image)
        val next: Button = findViewById(R.id.next)
        val previous: Button = findViewById(R.id.previous)
        val text: TextView = findViewById(R.id.description)

        next.setOnClickListener {
            swip++
            text.setText(listOfdescription[swip])
            image.setImageResource(listOfimage[swip])
            if(swip==listOfimage.size-1) {
                swip = 0
                text.setText(listOfdescription[swip])
                image.setImageResource(listOfimage[swip])
            }
        }

        previous.setOnClickListener {
            text.setText(listOfdescription[swip])
            image.setImageResource(listOfimage[swip])
            swip--
            if(swip<0) {
                swip = listOfimage.size-1
                text.setText(listOfdescription[swip])
                image.setImageResource(listOfimage[swip])
                swip--
            }
        }
    }
}