package com.jailbreackers.soulhunter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_home_menu.*

class HomeMenuActivity : AppCompatActivity() {
    private val ADD_MAP = 1
    private val ADD_HELP = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_menu)
        fab_playbutton.setOnClickListener()
        {
            val intent = Intent(this, MapsActivity::class.java)
            startActivityForResult(intent, ADD_MAP)
        }

        fab_helpbutton.setOnClickListener(){

            val intent = Intent(this, HelpInstructionsActivity::class.java)
            startActivityForResult(intent, ADD_HELP)
        }
    }

}
