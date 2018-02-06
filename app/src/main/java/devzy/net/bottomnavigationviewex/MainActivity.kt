package devzy.net.bottomnavigationviewex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import android.support.annotation.NonNull
import android.util.Log
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

//        val textView = findViewById<TextView>(R.id.textView)


//        bottomNav.setOnNavigationItemSelectedListener( { item ->
//            Log.e("Test Log : ", item.toString())
//            true
//        })

        bottomNav.setOnNavigationItemSelectedListener( { item ->
            when (item.itemId) {
//                R.id.action_home -> textView.text = "Home Page"
//                R.id.action_learn -> textView.text = "Learn Page"
//                R.id.action_profile -> textView.text = "Profile Page"
            }
            true
        })

    }
}
